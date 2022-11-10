package com.springcrud.springcrud.service;

import com.springcrud.springcrud.entity.Customer;
import com.springcrud.springcrud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){

        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer(){

        return customerRepository.findAll();
    }

    public Customer getOneCustomer(Long customerId){
        return customerRepository.findById(customerId).get();
    }

    public void deleteCustomer(Long customerId){
        customerRepository.deleteById(customerId);
    }

}
