## log4j 的基本使用方法
参考官方的demo
https://logging.apache.org/log4j/2.x/manual/configuration.html#Additivity   

## 目标
- 使用 log4j2
- 配置 config 输出到控制台
- 配置 config 输出到文件
- 配置 config 为单个类配置一个不同的logger

## log4j2 的配置模板
https://logging.apache.org/log4j/2.x/manual/configuration.html#Additivity  
<?xml version="1.0" encoding="UTF-8"?>;
<Configuration>
  <Properties>
    <Property name="name1">value</property>
    <Property name="name2" value="value2"/>
  </Properties>
  <filter  ... />
  <Appenders>
    <appender ... >
      <filter  ... />
    </appender>
    ...
  </Appenders>
  <Loggers>
    <Logger name="name1">
      <filter  ... />
    </Logger>
    ...
    <Root level="level">
      <AppenderRef ref="name"/>
    </Root>
  </Loggers>
</Configuration>


