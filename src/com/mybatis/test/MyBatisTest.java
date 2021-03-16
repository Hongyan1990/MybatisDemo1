package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.po.MyUser;

public class MyBatisTest {

	public static void main(String[] args) {
		InputStream resource;
		try {
			resource = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resource);
			SqlSession ss = ssf.openSession();
			MyUser mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 6);
			System.out.println(mu);
			
			//模糊查询
			List<MyUser> users = ss.selectList("com.mybatis.mapper.UserMapper.selectUserByName", "红");
			for(MyUser user : users) {
				System.out.println(user);
			}
			
			// 添加一个用户
//			MyUser addmu = new MyUser();
//			addmu.setUname("张三");
//			addmu.setUsex("男");
//			ss.insert("com.mybatis.mapper.UserMapper.addUser", addmu);
//			System.out.println(addmu.getUid());
			//修改一个用户
//			MyUser updatemu = new MyUser();
//			updatemu.setUid(6);
//			updatemu.setUname("小红");
//			updatemu.setUsex("女");
//			ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
//			List<MyUser> users = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
//			for(MyUser user: users) {
//				System.out.println(user);
//			}
			//删除用户
//			ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 8);
			// 提交事务
            ss.commit();
            // 关闭 SqlSession
            ss.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
