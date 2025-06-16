package com.cg.tourmanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.repository.CustomerRepository;
import com.cg.tourmanagement.service.CustomerService;
import com.cg.tourmanagement.service.CustomerServiceImpl;

@SpringBootTest
 class CustomerDaoTest {
	@Autowired
	CustomerRepository custrepo;
	@Autowired
	CustomerService custservice=new CustomerServiceImpl();
	@Test
	 void testAddCust() {
		CustomerDto cust=new CustomerDto();
		cust.setMobileNo(9886767223l);
		//cust.setPassword(1324);
		cust.setGender("male");
		int custId=custservice.addCustomer(cust);
		assertEquals(9886767223l, custrepo.findById(custId).get().getMobileNo());
		assertEquals(1324, custrepo.findById(custId).get().getPassword());
		assertEquals("male", custrepo.getById(custId).getGender());
		
		}

	@Test
	 void testGetByCustId() {
		Customer cust=custrepo.findById(1).get();
		assertEquals(cust.getId(), 1);
	}
	@Test

      void  testCustTableIsNotNull() {
		List<Customer> custlist=custrepo.findAll();
	   assertNotNull(custlist);
		
	}
	@Test
	void testDeleteId() {
		custrepo.deleteById(2);
		Customer cust=custrepo.findById(2).get();
		assertNull(cust);
	}
	
	
	}


