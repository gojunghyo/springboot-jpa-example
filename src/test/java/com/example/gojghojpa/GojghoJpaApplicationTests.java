package com.example.gojghojpa;

import com.example.gojghojpa.entity.Customer;
import com.example.gojghojpa.repository.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@DataJpaTest
class GojghoJpaApplicationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testFindByLastName() {
        Customer customer = new Customer("first", "last");
        System.out.println("customer = " + customer);
        entityManager.persist(customer);

        List<Customer> findByLastNames = customerRepository.findByLastName(customer.getLastName());

        Assertions.assertThat(findByLastNames)
                .extracting(Customer::getLastName)
                .containsOnly(customer.getLastName());


    }


}
