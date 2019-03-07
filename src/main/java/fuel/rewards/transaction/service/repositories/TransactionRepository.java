package fuel.rewards.transaction.service.repositories;

import fuel.rewards.transaction.service.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
