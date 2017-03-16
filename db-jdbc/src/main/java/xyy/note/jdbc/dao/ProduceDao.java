package xyy.note.jdbc.dao;

import xyy.note.jdbc.DBUtil;
import xyy.note.jdbc.model.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by xyy on 2017/3/1.
 */
public class ProduceDao {
    public static List<User> selectProduce() throws SQLException {
        Connection conn = DBUtil.getConnect();
        CallableStatement cs = conn.prepareCall("call sp_select");
        cs.execute();
        ResultSet rs = cs.getResultSet();
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        return null;

    }

    public static void main(String[] args) throws SQLException {
        ProduceDao.selectProduce();
    }
}
