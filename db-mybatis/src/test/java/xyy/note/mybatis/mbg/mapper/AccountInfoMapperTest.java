package xyy.note.mybatis.mbg.mapper;


import org.apache.ibatis.session.SqlSession;
import xyy.note.mybatis.db.DataAccess;
import xyy.note.mybatis.mbg.model.AccountInfo;
import xyy.note.mybatis.mbg.model.AccountInfoExample;

import java.util.List;

/**
 * @author xyy
 * @version 1.0 2017/3/11.
 * @since 1.0
 */
public class AccountInfoMapperTest {
    SqlSession sqlSession = DataAccess.getSqlSession();
    AccountInfoMapper mapper = sqlSession.getMapper(AccountInfoMapper.class);

    @org.junit.Test
    public void countByExample() throws Exception {

        AccountInfoExample example = new AccountInfoExample();

        example.createCriteria();

        List<AccountInfo> accountInfos = mapper.selectByExample(example);
        System.out.println(accountInfos.get(0).getAccount());
        System.out.println(accountInfos.get(1).getAccount());
    }

    @org.junit.Test
    public void deleteByExample() throws Exception {

    }

    @org.junit.Test
    public void insert() throws Exception {

    }

    @org.junit.Test
    public void insertSelective() throws Exception {

    }

    @org.junit.Test
    public void selectByExample() throws Exception {

    }

    @org.junit.Test
    public void updateByExampleSelective() throws Exception {

    }

    @org.junit.Test
    public void updateByExample() throws Exception {

    }

}