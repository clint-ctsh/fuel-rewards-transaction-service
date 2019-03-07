package fuel.rewards.transaction.service.services;

import fuel.rewards.transaction.service.model.Transaction;
import fuel.rewards.transaction.service.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
       return  (List<Transaction>) transactionRepository.findAll();
    }
}
