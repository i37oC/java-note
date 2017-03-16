package xyy.note.jdbc.dao;

import xyy.note.jdbc.DBUtil;
import xyy.note.jdbc.connectPool.DBCPUtil;
import xyy.note.jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xyy on 2017/2/28.
 */
public class UserDao {

    /**
     * 接口定义规范；如果使用主键ID 去查询用户；
     * 如果返回对象是空的话；那么是否该报错。
     * @param id
     * @return
     * @throws SQLException
     */
    public User get(int id) throws SQLException {
        User user = new User();
        Connection conn = DBUtil.getConnect();
        String sql = "select * from user where id = ?;";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, id);
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()){
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
        }
        return user;
    }

    public void add(User user) throws SQLException {
        Connection conn = DBUtil.getConnect();
        // ?? 奇怪，还区分大小写
        String sql = "insert into user (name, age) VALUES (?,?);";
        /**
         * 预编译SQL语句
         */
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setString(1,user.getName());
        ptmt.setInt(2,user.getAge());
        ptmt.execute();

    }

    public void update(User user) throws SQLException {
        Connection conn = DBUtil.getConnect();
        // ?? 奇怪，还区分大小写
        String sql = "update user set name = ?, age = ? where id = ?;";
        /**
         * 预编译SQL语句
         */
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setString(1,user.getName());
        ptmt.setInt(2,user.getAge());
        ptmt.setInt(3,user.getId());
        ptmt.execute();
    }

    public void delete(int id) throws SQLException {
        Connection conn = DBUtil.getConnect();
        String sql = "delete from user where id = ?;";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, id);
        ptmt.execute();
    }

    public List<User> query() throws SQLException {
        Connection conn = DBUtil.getConnect();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from user");
        List<User> users = new ArrayList<User>();
        while (rs.next()){
            User user = new User();
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            users.add(user);
        }
        return users;
    }

    public List<User> queryByDBCP() throws SQLException {
        //DBCPUtil dbcpUtil = new DBCPUtil();
        Connection conn = DBCPUtil.getConn();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from user");
        List<User> users = new ArrayList<User>();
        while (rs.next()){
            User user = new User();
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            users.add(user);
        }
        return users;
    }
}
