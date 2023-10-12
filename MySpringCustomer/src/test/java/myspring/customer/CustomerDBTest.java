package myspring.customer;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.customer.dao.mapper.CustomerMapper;
import myspring.customer.service.CustomerService;
import myspring.customer.vo.CustomerVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-beans-customer.xml")
public class CustomerDBTest {
	@Autowired
	DataSource dataSource;

	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	CustomerService customerService;
	
	@Test
	public void service() {
		List<CustomerVO> customerList = customerService.getCustomerList();
		System.out.println(customerList);
	}
	
	@Test
	public void mapper() {
		List<CustomerVO> selectCustomerList = customerMapper.selectCustomerList();
		System.out.println(selectCustomerList);
	}
	
	@Test
	public void session() {
		List<Object> selectList = sqlSession.selectList("myspring.customer.dao.mapper.CustomerMapper.selectCustomerList");
		System.out.println(selectList);
	}
	
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@Test
	public void sessionFactory() {
		System.out.println(sessionFactory.getClass().getName());
	}
	
	@Test
	public void conn() {
		try {
			Connection connection = dataSource.getConnection();
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println("DB Product Name : " + metaData.getDatabaseProductName());
			System.out.println("DB Driver : " + metaData.getDriverName());
			System.out.println("DB URL : " + metaData.getURL());
			System.out.println("DB UserName : " + metaData.getUserName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}//conn()

}//class
