## JDBC 存储过程的实现
1、JDBC 调用无参存储过程  
2、JDBC 调用含输入参数存储过程  
3、JDBC 调用含输出参数存储过程  
4、JDBC 调用含输入输出参数存储过程  

## JDBC 

### 事物的概念
事物(TRANSACTION)是作为单个逻辑工作单元执行的一系列操作。  
这些操作作为一个整体一起向系统提交，要么都执行，要么都不执行。

### 事物的特点
- 原子性 Atomicity
- 一致性 Consisitency
- 隔离性
- 永久性 

### JDBC 对事物的支持（实现）
- 1、通过 commit() 或者 rollback() 提交/回滚
- 2、事物默认是自动提交的
- 3、setAutoCommit(false) 禁止自动提交


### JDBC 连接池




## 替代产品 HIBERNATE / MYBATIS