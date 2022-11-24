package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements  CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("DROUHIN Vincent")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customer) {
        log.debug("Creating Customer:" + customer);
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void deleteCustomerById(UUID uuid) {
        log.debug("Deleting Customer:" + uuid);
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customer) {
        log.debug("Updating Customer:" + customer);
    }
}
