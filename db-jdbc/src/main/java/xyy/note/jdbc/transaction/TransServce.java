package xyy.note.jdbc.transaction;

import xyy.note.jdbc.DBUtil;
import xyy.note.jdbc.dao.AccountInfoDao;
import xyy.note.jdbc.dao.TransInfoDao;
import xyy.note.jdbc.model.AccountInfo;
import xyy.note.jdbc.model.TransInfo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by xyy on 2017/3/2.
 */
public class TransServce {
    /**
     * 转账
     * 1、更新 表 accountInfo
     * 2、更新 表 accountInfo
     * 3、插入 transInfo
     */
    public void trans() throws SQLException {
        Connection conn = DBUtil.getConnect();
        conn.setAutoCommit(false);

        try {
            // 减钱
            AccountInfoDao.update(new AccountInfo());

            // 加钱
            AccountInfoDao.update(new AccountInfo());

            // 插入日志表
            TransInfoDao.add(new TransInfo());

            conn.commit();

        }catch (Exception e){
            conn.rollback();
        }
    }
}
