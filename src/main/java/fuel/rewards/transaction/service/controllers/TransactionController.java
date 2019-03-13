package fuel.rewards.transaction.service.controllers;

import fuel.rewards.transaction.service.model.Transaction;
import fuel.rewards.transaction.service.services.TransactionService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {


    @Autowired
    private TransactionService transactionService;

    @GetMapping("/api/transactions")
    public List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }



//    format of post body
//    {
//        "date": "yyyy-mm-dd",
//        "amount": 20.01,
//        "cardNumber": "asdas1234"
//    }
    @PostMapping("/api/transaction")
    public ResponseEntity addTransaction(@RequestBody Transaction transaction){

        transactionService.addTransaction(transaction);

        return new ResponseEntity(HttpStatus.OK);
    }
}
