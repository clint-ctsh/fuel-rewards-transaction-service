package fuel.rewards.transaction.service.controllers;

import fuel.rewards.transaction.service.forms.AddTransactionForm;
import fuel.rewards.transaction.service.model.Transaction;
import fuel.rewards.transaction.service.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class TransactionController {


    @Autowired
    private TransactionService transactionService;

    @CrossOrigin
    @GetMapping("/api/transactions")
    public List<Transaction> getAllTransactionsForUser(String cardNumber) {
        return transactionService.getAllTransactions(cardNumber);
    }

    @CrossOrigin
    @GetMapping("/api/transactions/all")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }


    //    format of post body
//    {
//        "name": "Some identifying details",
//        "amount": 20.01,
//        "cardNumber": "asdas1234"
//    }
    @CrossOrigin
    @PostMapping("/api/transaction")
    public ResponseEntity addTransaction(@RequestBody AddTransactionForm addTransactionForm) {

        Transaction transaction = new Transaction();
        transaction.setName(addTransactionForm.getName());
        transaction.setAmount(addTransactionForm.getAmount());
        transaction.setCardNumber(addTransactionForm.getCardNumber());
        transaction.setDate(new Date(System.currentTimeMillis())); // always default to current date

        return ResponseEntity.ok( transactionService.addTransaction(transaction));
    }
}
