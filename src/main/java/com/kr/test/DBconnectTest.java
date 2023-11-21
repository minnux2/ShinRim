package com.kr.test;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class DBconnectTest {
	// SqlSessionFactory ��ü�� �ڵ����� ����
	@Inject
	private SqlSessionFactory sqlFactory;

	// SqlSessionFactory ��ü�� ����� ����������� Test
	@Test
	public void testFactory() {
		System.out.println(sqlFactory);
	}

	// MyBatis�� Mysql ������ ����� ����Ǿ����� Test
	@Test
	public void testSession() throws Exception {
		try (SqlSession session = sqlFactory.openSession()) {
			System.out.println("�αԾ� �س´�!!");
			System.out.println(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
