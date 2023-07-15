package com.example.simplecrm;

import java.util.ArrayList;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    public Customer getCustomer(int id);

    public ArrayList<Customer> getAllCustomers();

    public Customer updateCustomer(int id, Customer customer);

    public void deleteCustomer(int id);

    Interaction addInteractionToCustomer(int id, Interaction interaction);
}
