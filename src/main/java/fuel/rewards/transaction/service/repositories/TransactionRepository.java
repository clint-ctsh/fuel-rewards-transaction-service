package fuel.rewards.transaction.service.repositories;

import fuel.rewards.transaction.service.model.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

   // @Query("SELECT * FROM transaction t where card_number = :cardNumber")
    public List<Transaction> findAllByCardNumber(/*@Param("cardNumber")*/ String cardNumber);
}
