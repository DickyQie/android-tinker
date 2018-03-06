package com.zhangqie.tinkerrelease;

import android.app.Application;
import android.util.Log;

import com.tencent.tinker.loader.app.ApplicationLike;
import com.tinkerpatch.sdk.TinkerPatch;
import com.tinkerpatch.sdk.loader.TinkerPatchApplicationLike;

/**
 * Created by gavin
 * Created date 17/7/3
 * Created log
 */

public class MyApplication extends Application {
    private ApplicationLike tinkerApplicationLike;
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.TINKER_ENABLE) {

            // 我们可以从这里获得Tinker加载过程的信息
            tinkerApplicationLike = TinkerPatchApplicationLike.getTinkerPatchApplicationLike();

            // 初始化TinkerPatch SDK, 更多配置可参照API章节中的,初始化SDK
            TinkerPatch.init(tinkerApplicationLike)
                    .reflectPatchLibrary()
                    //向后台获取是否有补丁包更新,默认的访问间隔为3个小时
                    //若参数为true,即每次调用都会真正的访问后台配置
                    .fetchPatchUpdate(true)
                    .setPatchRollbackOnScreenOff(true)
                    .setPatchRestartOnSrceenOff(true);

            // 每隔3个小时去访问后台时候有更新,通过handler实现轮训的效果
            new FetchPatchHandler().fetchPatchWithInterval(3);
            Log.i("TAG", "tinker init");
        }
    }
}