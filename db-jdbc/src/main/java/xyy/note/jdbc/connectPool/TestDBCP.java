package xyy.note.jdbc.connectPool;

import xyy.note.jdbc.dao.UserDao;
import xyy.note.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by xyy on 2017/3/2.
 */
public class TestDBCP {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        getByDBCP();
        long b = System.currentTimeMillis();
        System.out.println("直连: " + (b-a));
        /*getByDBCP();
        long c = System.currentTimeMillis();
        System.out.println("通过DBCP: " + (c-b));*/
    }


    private static void getByDirect(){
        UserDao userDao = new UserDao();
        try {
            List<User> users = userDao.query();
            System.out.println(users.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void getByDBCP(){
        UserDao userDao = new UserDao();
        try {
            List<User> users = userDao.queryByDBCP();
            System.out.println(users.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
