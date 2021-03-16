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
			
			//ģ����ѯ
			List<MyUser> users = ss.selectList("com.mybatis.mapper.UserMapper.selectUserByName", "��");
			for(MyUser user : users) {
				System.out.println(user);
			}
			
			// ���һ���û�
//			MyUser addmu = new MyUser();
//			addmu.setUname("����");
//			addmu.setUsex("��");
//			ss.insert("com.mybatis.mapper.UserMapper.addUser", addmu);
//			System.out.println(addmu.getUid());
			//�޸�һ���û�
//			MyUser updatemu = new MyUser();
//			updatemu.setUid(6);
//			updatemu.setUname("С��");
//			updatemu.setUsex("Ů");
//			ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
//			List<MyUser> users = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
//			for(MyUser user: users) {
//				System.out.println(user);
//			}
			//ɾ���û�
//			ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 8);
			// �ύ����
            ss.commit();
            // �ر� SqlSession
            ss.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
