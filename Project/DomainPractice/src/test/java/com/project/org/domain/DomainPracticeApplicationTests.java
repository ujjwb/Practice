package com.project.org.domain;

import com.project.org.domain.entities.Customer;
import com.project.org.domain.entities.Role;
import com.project.org.domain.entities.Seller;
import com.project.org.domain.entities.User;
import com.project.org.domain.repositories.CustomerRepository;
import com.project.org.domain.repositories.SellerRepository;
import com.project.org.domain.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.Arrays;

@SpringBootTest
class DomainPracticeApplicationTests {


	@Autowired
	UserRepository userRepository;

	@Autowired
	SellerRepository sellerRepository;

	@Autowired
	CustomerRepository customerRepository;
	@Transactional
	@Rollback(value = false)
	@Test
	void contextLoads() {
		User u1=new User();

		Role r1=new Role();
		r1.setName("Cutomer");
		Role r2=new Role();
		r2.setName("Seller");

		u1.setEmail("Ujjwb@ttn.com");
		u1.setRoles(Arrays.asList(r1,r2));

		Seller s1=new Seller();
		s1.setGst(12338423874l);
		s1.setUser(u1);
		s1.setId(u1.getId());
		sellerRepository.save(s1);


//		User u2=new User();
//		u2.setEmail("yoyo@ttn.com");
//		u2.setRoles(Arrays.asList(r1,r2));
//		userRepository.save(u2);
	}

	@Test
	public void yoyo() {


		User u1=new User();
		u1.setEmail("Ujjwb@ttn.com");
		u1.setRoles(Arrays.asList());
	}
}
