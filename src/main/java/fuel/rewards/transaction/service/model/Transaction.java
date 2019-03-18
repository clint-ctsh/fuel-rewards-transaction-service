package fuel.rewards.transaction.service.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_date")
    private Date date;

    @Column(name = "transaction_name")
    private String name;

    @Column(name = "transaction_amount")
    private Double amount;

    @Column(name = "card_number")
    private String cardNumber;

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", date=" + name +
                ", amount=" + amount +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
