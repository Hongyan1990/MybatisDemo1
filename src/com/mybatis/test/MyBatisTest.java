package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.po.MyUser;
import com.mybatis.po.UserQueryInfo;

public class MyBatisTest {

	public static void main(String[] args) {
		InputStream resource;
		try {
			resource = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resource);
			SqlSession ss = ssf.openSession();
			
//			ShoppingCar sc = ss.selectOne("com.mybatis.mapper.ShoppingCarMapper.queryShoppingCar", 1);
//			System.out.println(sc);
			
//			Goods g = ss.selectOne("com.mybatis.mapper.ShoppingCarMapper.queryGoodsInfo", 1);
//			System.out.println(g);
			
//			Gamer g = ss.selectOne("com.mybatis.mapper.GamePlayerMapper.queryMarriorGamePlayer", 1);
//			System.out.println("name=" + g.getName() + ", profession=" + g.getProfession());
//			Map m = g.getProfessionalAttributes();
//			System.out.println("power=" + m.get("power"));
//			
//			Gamer g2 = ss.selectOne("com.mybatis.mapper.GamePlayerMapper.queryMagicianGamePlayer", 2);
//			System.out.println("name=" + g2.getName() + ", profession=" + g2.getProfession());
//			Map m2 = g2.getProfessionalAttributes();
//			System.out.println("rang=" + m2.get("rang"));
			
			
			MyUser myUser = new MyUser();
			UserQueryInfo userInstance = new UserQueryInfo();
			myUser.setUid(6);
			myUser.setUsex("��");
			userInstance.setUserInstance(myUser);
			List<MyUser>  mus = ss.selectList("com.mybatis.mapper.UserMapper.findUserList", userInstance);
			for(MyUser mu : mus) {
				System.out.println(mu);
			}
//			
//			//ģ����ѯ
//			List<MyUser> users = ss.selectList("com.mybatis.mapper.UserMapper.selectUserByName", "��");
//			for(MyUser user : users) {
//				System.out.println(user);
//			}
			
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
