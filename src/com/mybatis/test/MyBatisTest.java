package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.po.Batch;
import com.mybatis.po.BatchDetail;
import com.mybatis.po.Customer;
import com.mybatis.po.FinacialProduct;

public class MyBatisTest {

	public static void main(String[] args) {
		InputStream resource;
		try {
			resource = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(resource);
			SqlSession ss = ssf.openSession();
			
			List<Customer> cs = ss.selectList("com.mybatis.mapper.FinancialMapper.queryCustomerInfo");
			System.out.println(cs.get(0).getUsername());
			for(Customer c: cs) {
				System.out.println("username=" + c.getUsername() + ", acno=" + c.getAcno());
				List<Batch> bs = c.getBatchs();
				for(Batch b: bs) {
					System.out.println("batch_id=" + b.getBatch_id() + ", number=" + b.getNumber() + ", createtime=" + b.getCreatetime());
					List<BatchDetail> bds = b.getBatchDetails();
					for(BatchDetail bd : bds) {
						System.out.println("product_id=" + bd.getProduct_id() + ", product_num=" + bd.getProduct_num());
						FinacialProduct fp = bd.getFinacialProduct();
						System.out.println("name=" + fp.getName() + ", price=" + fp.getPrice());
					}
				}
			}
			
//			BatchItem bi = ss.selectOne("com.mybatis.mapper.FinancialMapper.queryBatchAndBatchDetail", 1);
//			
//			if(bi != null) {
//				
//				Customer customer = bi.getCustomer();
//				List<BatchDetail> bds = bi.getBatchDetails();
//				System.out.println("batch_id=" + bi.getBatch_id() + ", username=" + customer.getUsername());
//				for(BatchDetail bd : bds) {
//					System.out.println("product_id=" + bd.getProduct_id() + ", product_num=" + bd.getProduct_num());
//				}
//			}
			
//			List<BatchItem> bcs = ss.selectList("com.mybatis.mapper.FinancialMapper.queryBatchCustomer");
//			
//			for(BatchItem bc : bcs) {
//				System.out.println("batch_id=" + bc.getBatch_id() + ", createtime=" + bc.getCreatetime() + ", username=" + bc.getCustomer().getUsername());
//			}
			
			
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
			
			
//			MyUser myUser = new MyUser();
//			UserQueryInfo userInstance = new UserQueryInfo();
//			myUser.setUid(6);
//			myUser.setUsex("男");
//			userInstance.setUserInstance(myUser);
//			List<MyUser>  mus = ss.selectList("com.mybatis.mapper.UserMapper.findUserList", userInstance);
//			for(MyUser mu : mus) {
//				System.out.println(mu);
//			}
//			
//			//模糊查询
//			List<MyUser> users = ss.selectList("com.mybatis.mapper.UserMapper.selectUserByName", "红");
//			for(MyUser user : users) {
//				System.out.println(user);
//			}
			
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
