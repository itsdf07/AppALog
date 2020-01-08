## AppALog是用来干嘛的？
仅提供对android.util.Log的重新封装，自定义属于自己风格的ALog打印

## 对于module baseutils的使用
* 项目的build.gradle增加工具库的目标地址
```javascript
    repositories {
        jcenter()
        maven {
            url 'https://bintray.com/itsdf07/maven/'
        }
    }
```
* 需要依赖该工具库的Module中的'build.gradle'中添加'compile'依赖
```javascript
    dependencies {
        compile 'com.itsdf07:lib-alog:1.0.2'
    }
```
## 对ALog的使用
```javascript
    ALog.init()
            .setLogLevel(ALogLevel.FULL) //是否打印log
            .setTag("自定义Tag") //自定义tag
            .setDefineALogFilePath("xxx/xxx/xxx.log") //自定义log存储路径
            .setLog2Local(true) //设置是否本地存储log记录
            .setShowThreadInfo(true)//是否显示线程信息
            .setMethodCount(2) //显示函数栈中的方法数
            .setMethodOffset(0); //控制从函数栈中的具体位置显示MethodCount数量的函数
```


