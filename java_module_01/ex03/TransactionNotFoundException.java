package java_module_01.ex03;

public class TransactionNotFoundException extends Exception {
    public TransactionNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
