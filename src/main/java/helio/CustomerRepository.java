package helio;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author chengangw
 * @date 4/5/2017 5:10 PM
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
