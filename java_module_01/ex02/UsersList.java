package java_module_01.ex02;

public interface UsersList {
    public void AddUser(User user);

    public User findUserById(int id) throws UserNotFoundException;

    public User findUserByIndex(int index) throws UserNotFoundException;

    public int length();
}
