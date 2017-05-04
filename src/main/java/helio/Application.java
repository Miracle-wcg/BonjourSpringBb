package helio;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author chengangw
 * @date 3/5/2017 2:33 PM
 */
@SpringBootApplication
public class Application {

    public static final Logger log = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

   /* @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "Palmer"));
            repository.save(new Customer("Kim", "Bauer"));

            log.info("Customers found with findAll()");
            log.info("--------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");
            Customer customer = repository.findOne(1l);
            log.info("Customer found with findOne()");
            log.info("----------------------------");
            log.info(customer.toString());
            log.info("");

            log.info("Customers found with findByLastName()");
            log.info("-------------------------------------");
            for (Customer cum : repository.findByLastName("Bauer")) {
                log.info(cum.toString());
            }
            log.info("");

        };

    }*/
}
