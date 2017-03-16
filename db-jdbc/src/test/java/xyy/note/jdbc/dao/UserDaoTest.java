package xyy.note.jdbc.dao;

import org.junit.jupiter.api.Test;
import xyy.note.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by xyy on 2017/3/1.
 */
class UserDaoTest {
    @Test
    void get() {

    }

    @Test
    void add() throws SQLException {
        UserDao dao = new UserDao();
        User user = new User();
        user.setName("西涯侠");
        user.setAge(23);
        dao.add(user);
    }

    @Test
    void update() {

    }

    @Test
    void delete() {

    }

    @Test
    void query() throws SQLException {
        UserDao userDao = new UserDao();
        List<User> users = userDao.query();
        users.stream().forEach(e->{
            System.out.println(e.getName());
        });
    }

}