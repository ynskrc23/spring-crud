package com.springcrud.springcrud.controller;

import com.springcrud.springcrud.entity.Customer;
import com.springcrud.springcrud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer addCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<Customer>(addCustomer, HttpStatus.CREATED);
    }

    // http:localhost:8080/api/customer/all
    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> allCustomer = customerService.getAllCustomer();
        return new ResponseEntity<List<Customer>>(allCustomer,HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> getOneCustomer(@PathVariable("id") Long id){
        Customer customerOne = customerService.getOneCustomer(id);
        return new ResponseEntity<Customer>(customerOne,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("id") Long id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
