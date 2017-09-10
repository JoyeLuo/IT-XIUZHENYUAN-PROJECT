package com.test.mybatis.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.beans.UserBean;
import com.test.mybatis.mapper.UserMapper;
import com.test.mybatis.tools.DBTools;

public class UserService {

    public static void main(String[] args) {
        insertUser();
        //deleteUser(1);
        //selectUserById(2);
        //selectAllUser();
    }

    
    /**
     * 新增用户
     */
    private static boolean  insertUser(){
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserBean user = new UserBean(1,"test01", "123456", 7000.0);
        try {
            int index=mapper.insertUser(user);
            boolean bool=index>0?true:false;
             session.commit();
             return bool;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
    
    /**
     * 删除用户
     * @param id 用户ID
     */
    private static boolean deleteUser(int id){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            int index=mapper.deleteUser(id); 
            boolean bool=index>0?true:false;
            session.commit(); 
            return bool;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback(); 
            return false;
        }finally{
            session.close();
        }
    }
    
    
    /**
     * 根据id查询用户
     * @param id
     */
    private static void selectUserById(int id){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
        UserBean user= mapper.selectUserById(id);
        session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally{
            session.close();
        }
    }
    
    /**
     * 查询所有的用户
     */
    private static void selectAllUser(){
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
        List<UserBean> user=mapper.selectAllUser();
        session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally{
            session.close();
        }
    }
}