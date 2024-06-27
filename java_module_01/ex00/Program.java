package java_module_01.ex00;

import java_module_01.ex00.Transaction;
import java_module_01.ex00.User;

public class Program {
    public static void main(String[] args) {
        User user1 = new User(0, "Hicham", 3000);
        User user2 = new User(0, "Mohamed", 2300);

        System.out.println(user1);
        System.out.println(user2);

        Transaction transaction1 = new Transaction(user1, user2, "debits", 200);
        System.out.println(transaction1);

        System.out.println(user1);
        System.out.println(user2);

        Transaction transaction2 = new Transaction(user1, user2, "credits", 200);
        System.out.println(transaction2);

        System.out.println(user1);
        System.out.println(user2);
    }
}
