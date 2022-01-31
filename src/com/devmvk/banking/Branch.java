package com.devmvk.banking;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;

    public Branch() {
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String customerName, double initialTransaction){
        Customer customer = new Customer(customerName);
        customer.addTransaction(initialTransaction);
        getCustomers().add(customer);
    }
}
