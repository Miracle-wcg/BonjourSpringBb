package helio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chengangw
 * @date 4/5/2017 6:31 PM
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/customers")
    public List<Customer> customers(@RequestParam(value = "lastName") String lastName) {
        customerRepository.save(new Customer("Jack", "Bauer"));
        customerRepository.save(new Customer("Chloe", "Palmer"));
        customerRepository.save(new Customer("Kim", "Bauer"));
        return customerRepository.findByLastName(lastName);
    }
}
