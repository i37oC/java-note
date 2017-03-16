## 步骤
- 1、加载包

- 2、xml配置文件

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.jdbc.Driver"/>
                <property name="url" value="jdbc:mysql://192.168.1.212:3306/test?useUnicode=true"/>
                <property name="username" value="scrm"/>
                <property name="password" value="scrm@123"/>
            </dataSource>
        </environment>
    </environments>
    <mappers>
        <mapper resource="UserMapper.xml"/>
    </mappers>
</configuration>

- 3、xml 映射文件

## 使用 log4j 输出SQL日志

## 使用 mybatis generator

