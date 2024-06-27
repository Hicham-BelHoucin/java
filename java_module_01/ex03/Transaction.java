package java_module_01.ex03;

import java.util.UUID;

class Transaction {
    private String id;
    private User recipient;
    private User sender;
    private String transferCategory;
    private double amount;

    public Transaction(User sender, User recipient, String transferCategory, double amount) {
        this.id = UUID.randomUUID().toString();
        this.sender = sender;
        this.recipient = recipient;
        this.transferCategory = transferCategory;
        if (transferCategory.equals("debits")) {
            if (sender.getBalance() < amount) {
                throw new IllegalArgumentException("Insufficient balance for the transaction");
            }
            sender.setBalance(sender.getBalance() - amount);
            recipient.setBalance(recipient.getBalance() + amount);
        } else if (transferCategory.equals("credits")) {
            sender.setBalance(sender.getBalance() + amount);
            recipient.setBalance(recipient.getBalance() - amount);
        }
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", recipient=" + recipient + ", sender=" + sender + ", transferCategory='"
                + transferCategory + "', amount=" + amount + "}";
    }
}
