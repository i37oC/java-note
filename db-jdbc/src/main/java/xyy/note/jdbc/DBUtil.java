package xyy.note.jdbc;

import java.sql.*;

/**
 * Created by xyy on 2017/2/28.
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://192.168.1.212:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static final String USER = "scrm";
    private static final String PASSWORD = "scrm@123";
    //private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static Connection conn;
    static {
        //1 加载驱动程序
        //Class.forName(JDBC_DRIVER);
        //2 获得数据库连接
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("获取数据库连接错误",e);
        }
    }

    public static Connection getConnect(){
        return conn;
    }
}
