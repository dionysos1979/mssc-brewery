package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);

    CustomerDto createCustomer(CustomerDto customer);

    void updateCustomer(UUID customerId, CustomerDto customer);

    void deleteCustomerById(UUID customerId);
}
