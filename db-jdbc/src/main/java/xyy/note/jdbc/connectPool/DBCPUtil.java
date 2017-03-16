package xyy.note.jdbc.connectPool;


import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by xyy on 2017/3/2.
 * DBCP: database connection pool
 *
 * 1、导入jar包
 * commons-dbcp2-2.1.1.jar
 * commons-pool2-2.4.2.jar
 * commons-logging-1.2.jar
 *
 * 2、在项目根路径下添加配置文件
 *
 */
public class DBCPUtil {
    private static DataSource DS;

    private static final String cofigFile = "/dbcp.properties";

    public DBCPUtil(){
        //iniDbcp();
    }

    public static Connection getConn(){
        Connection conn = null;
        if(DS != null){
            try {
                conn = DS.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                conn.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }
        return conn;
    }

    static {
        Properties pros = new Properties();
        try {
            pros.load(Object.class.getResourceAsStream(cofigFile));
            DS = BasicDataSourceFactory.createDataSource(pros);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
