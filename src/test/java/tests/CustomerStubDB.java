package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import classes.*;

public class CustomerStubDB {
    private final Map<Integer, Customer> customers = new HashMap<>(); // Using userID as key

    // Method to add a customer
    public void addCustomer(Customer customer) {
        customers.put(customer.getUserID(), customer);
    }

    // Method to remove a customer
    public boolean removeCustomer(int userID) {
        if (customers.containsKey(userID)) {
            customers.remove(userID);
            return true;
        }
        return false;
    }

    // Method to update a customer
    public boolean updateCustomer(int userID, Customer updatedCustomer) {
        if (customers.containsKey(userID)) {
            customers.put(userID, updatedCustomer);
            return true;
        }
        return false;
    }

    // Method to retrieve a customer by userID
    public Customer getCustomer(int userID) {
        return customers.get(userID);
    }

    // Method to retrieve all customers
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    // Method to find customers by a specific attribute, e.g., address
    public List<Customer> findCustomersByAddress(String address) {
        return customers.values().stream()
                .filter(customer -> customer.getAddress().equals(address))
                .collect(Collectors.toList());
    }

    public List<Customer> findCustomersBySex(String sex) {
        return customers.values().stream()
                .filter(customer -> customer.getSex().equals(sex))
                .collect(Collectors.toList());
    }

    public List<Customer> findCustomersByPhoneNumber(String phoneNumber) {
        return customers.values().stream()
                .filter(customer -> customer.getPhoneNumber().equals(phoneNumber))
                .collect(Collectors.toList());
    }

    
}