jdbc:

连接  java程序和数据库的桥梁。

课程大纲：
## 一、JDBC 简介
jdbc -> java database connectivity (java 数据库链接)  
可以为多种数据库提供统一的访问。  
体现了java 一次编程，处处运行。  


java应用 -> jdbc --> mysql / oracle / sql server

## 二、使用详情
- 1、jdbc常用接口
- 2、jdbc变成步骤  
- 3、执行SQL语句
- 4、管理结果集
- 5、事物管理

## 三、高级应用
- 1、分页
- 2、高级查询
- 3、高级函数使用

## 整理总结


### jdbc 使用步骤
1、加载驱动程序： class.forName(driveName)  
2、获的数据链接  
3、创建 Statement 对象 

### JDBC 各种连接方式的对比  == 不懂
1、JDBC + ODBC 桥的方式  
2、JDBC + 厂商 API 的形式 （每个厂商）  
3、JDBC + 厂商 DATABASE SERVER + DATABASE  
4、JDBC + DATABASE的连接方式 (推荐方式。)  
****
可以简单的理解为：mysql的jdbc实现了 java sql 的一些接口。  
在dao的业务代码中，是不需要出现 jdbc.mysql 这个jar 包里的类。 
