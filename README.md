## Tinker

Tinker修改官方Demo,这里是可以运行的,只要实现两步

1. 将build 下的app-debug-1111-13-31-12.apk运行

2. 运行Gradle中tinkerPatchDebug,或者在Terminal使用gradlew tinkerPatchDebug ,Terminal->就是 
 Android studio 一般左下角的那个cmd控制台一样的东西 

3. 推送补丁 'adb push ./app/build/outputs/tinkerPatch/debug/patch_signed_7zip.apk /storage/sdcard0/',运行apk.点击Loadpatch,关闭,再打开就ok

详情请我的博客看:http://blog.csdn.net/chengzichen_/article/details/53101204
 
