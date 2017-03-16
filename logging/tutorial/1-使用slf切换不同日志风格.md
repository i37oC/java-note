## 目标
- 学会slf4j的原理和基本方法
- 体验不同的日志风格，jdk4j， log4j ...

## 参考地址
http://yangzb.iteye.com/blog/245844

## 简介
简单日记门面(simple logging Facade for java)SLF4J是为各种loging APIs提供一个简单统一的
接口，从而使得最终用户能够在部署的时候配置自己希望的loging APIs实现。 Logging API实现既可以
选择直接实现SLF4J接的loging APIs如： NLOG4J、SimpleLogger。也可以通过SLF4J提供的API实现
来开发相应的适配器如Log4jLoggerAdapter、JDK14LoggerAdapter。在SLF4J发行版本中包含了几个
jar包，如slf4j-nop.jar, slf4j-simple.jar, slf4j-log4j12.jar, slf4j-log4j13.jar,
slf4j-jdk14.jar and slf4j-jcl.jar通过这些jar文件可以使编译期与具体的实现脱离。或者说可以
灵活的切换


## 操作步骤：
1、pom 文件中，一次依赖不同的 日志实现包 查看控制台的输出。  
2、运行 Wombat 类中的源码，查看不同的输出结果

