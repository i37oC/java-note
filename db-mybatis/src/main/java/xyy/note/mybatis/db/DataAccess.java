package xyy.note.mybatis.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by xyy on 2017/3/2.
 */
public class DataAccess {

    public static SqlSession getSqlSession(){
        // 通过配置获取数据库连接信息
        InputStream reader = null;
        try {
            reader = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 通过配置信息构建一个 SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        // 通过 sqlSessionFactory 打开一个数据库会话
        SqlSession session = factory.openSession();
        return session;
    }

    public static void main(String[] args) {
        DataAccess access = new DataAccess();
        SqlSession session = access.getSqlSession();
        Map user = session.selectOne("UserMapper.selectUser",1);
        System.out.println(user.toString());
        session.close();
    }
}
