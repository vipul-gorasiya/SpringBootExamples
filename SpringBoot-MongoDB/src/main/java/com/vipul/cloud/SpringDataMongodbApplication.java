package com.vipul.cloud;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringDataMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongodbApplication.class, args);
	}

	@Autowired
	private CustomerRepository repository;

	@RequestMapping("/customer/count")
	public long count() {
		return repository.count();
	}
	
	@RequestMapping("/customer/createrandom")
	public String createrandom() {
		Random random = new Random();
		Customer customer = new Customer(String.valueOf(random.nextInt(20)), "Smith");		
		repository.save(customer);
		return customer.toString();
	}

}
