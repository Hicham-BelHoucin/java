package java_module_01.ex02;

public class Program {
    public static void main(String[] args) {
        try {
            UsersArrayList list = new UsersArrayList();
            // User user = new User("hicham", 0);

            for (int i = 0; i < 50; i++) {
                list.AddUser(new User("hicham" + i, 0));
            }

            {

                User user = list.findUserByIndex(10);
                System.out.println(user);
            }

            {

                User user = list.findUserById(12);
                System.out.println(user);
            }

            System.out.println(list.length());
            // System.out.println(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
