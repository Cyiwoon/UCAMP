package myspring.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.customer.dao.CustomerDao;
import myspring.customer.vo.CustomerVO;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerdao;
	

	public List<CustomerVO> getCustomerList() {
		return customerdao.readAll();
	}


}
