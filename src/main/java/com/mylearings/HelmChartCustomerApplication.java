package com.mylearings;

import com.mylearings.dto.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/customer")
public class HelmChartCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelmChartCustomerApplication.class, args);
	}


	@GetMapping("/getCustomers")
	public List<Customer> getCustomers(){
		return Arrays.asList(
				new Customer(124,"Mahesh","435345345345"),
				new Customer(125,"Vardhan","54645534535"),
				new Customer(126,"Mahalakshmi","7576666666"),
				new Customer(127,"Sukanya","123333333")
		);
	}

}
