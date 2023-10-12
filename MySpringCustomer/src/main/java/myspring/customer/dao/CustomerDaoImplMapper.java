package myspring.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.customer.dao.mapper.CustomerMapper;
import myspring.customer.vo.CustomerVO;


@Repository("customerDao")
public class CustomerDaoImplMapper implements CustomerDao {
	
	@Autowired
	private CustomerMapper customerMapper;	
	

	
	public List<CustomerVO> readAll() {
		List<CustomerVO> customerList = customerMapper.selectCustomerList();
		return customerList;
	}

}