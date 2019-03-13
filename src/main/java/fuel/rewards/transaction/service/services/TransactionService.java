package fuel.rewards.transaction.service.services;

import fuel.rewards.transaction.service.model.Transaction;
import fuel.rewards.transaction.service.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return (List<Transaction>) transactionRepository.findAll();
    }

    public void addTransaction(Transaction transaction) {

        String cardNumber = transaction.getCardNumber();
        Date transactionDate = transaction.getDate();
        Double amount = transaction.getAmount();

        if (isCardValid(transaction.getCardNumber()) && isDateBeforeToday(transactionDate) && amount > 0.0) {
            transactionRepository.save(transaction);
        }
    }

    private boolean isDateBeforeToday(Date transactionDate) {

        if (transactionDate.after(new Date(System.currentTimeMillis()))) {
            System.out.println("Date cannot be after today");
            return false;
        }
        return true;

    }

    private boolean isCardValid(String cardNumber) {

        boolean valid = false;

        // TODO: verify card validity from the user service and set the valid flag to TRUE
        valid = true;

        return valid;
    }
}
