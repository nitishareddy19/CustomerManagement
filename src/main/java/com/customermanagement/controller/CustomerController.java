package com.customermanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customermanagement.model.Customer;

@RestController
public class CustomerController {
	
	@PostMapping("/create/customer")
	public String createCustomer(@RequestBody Customer customer) {
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getPhone());
		return "created";
	}
	@PutMapping("/update/customer")
	public String updateCustomer(@RequestBody Customer customer) {
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getPhone());
		return "updated";
	}
	@DeleteMapping("/delete/{customerId}")
	public String deleteProduct(@PathVariable int customerId) {
		System.out.println(customerId);
		return "Successfully Deleted the product";
	}
	@GetMapping("/get/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
	Customer cust= new Customer();
	cust.setId(10);
	cust.setName("neetu");
	cust.setPhone(12335678);
	return cust;
	}
	@GetMapping("/getAllCustomer")
	public List<Customer> getCustomer(){
	Customer cust= new Customer();
	cust.setId(10);
	cust.setName("neetu");
	cust.setPhone(12335678);

	Customer cust1= new Customer();
	cust1.setId(10);
	cust1.setName("neetu");
	cust1.setPhone(12335678);
	
	List<Customer> custList=new ArrayList<Customer>();
	custList.add(cust1);
	custList.add(cust1);
	return custList;
}
}