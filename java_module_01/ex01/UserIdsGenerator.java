package java_module_01.ex01;

public class UserIdsGenerator {
    private static int id = 0;
    private static final UserIdsGenerator instance = new UserIdsGenerator();

    private UserIdsGenerator() {
    }

    public static UserIdsGenerator getInstance() {
        return instance;
    }

    public int generateId() {
        return getAndIncrement();
    }

    public static int getAndIncrement() {
        return id++;
    }
}
