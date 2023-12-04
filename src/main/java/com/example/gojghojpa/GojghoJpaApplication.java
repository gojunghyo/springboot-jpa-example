package com.example.gojghojpa;

import com.example.gojghojpa.entity.Customer;
import com.example.gojghojpa.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class GojghoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GojghoJpaApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository) {
      return (args) -> {
          Customer cu = Customer.builder().firstName("go4").lastName("junghyo").build();
          customerRepository.save(cu);

          customerRepository.findByLastName("junghyo")
                  .forEach(customer -> {
                      log.info("customer -> {}", customer);
                  });
      };
    }
}
