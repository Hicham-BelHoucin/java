package java_module_01.ex01;

import java_module_01.ex01.User;

public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            User user = new User("User" + (i + 1), (double) 1000 + i * 100);
            System.out.println(user);
        }
    }
}
