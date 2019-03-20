package fuel.rewards.transaction.service.forms;

import javax.validation.constraints.NotBlank;

public class AddTransactionForm {
    @NotBlank
    private String name;

    @NotBlank
    private Double amount;

    @NotBlank
    private String cardNumber;

    public AddTransactionForm() {}

    public AddTransactionForm(@NotBlank String name, @NotBlank Double amount, @NotBlank String cardNumber) {
        this.name = name;
        this.amount = amount;
        this.cardNumber = cardNumber;
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
}
