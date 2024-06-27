package java_module_01.ex03;

public interface TransactionsLinkedList {
    public TransactionsList addTransaction(TransactionsList list, int data);

    public Transaction removeTransactionById(String id) throws TransactionNotFoundException;

    public void toArray();
}
