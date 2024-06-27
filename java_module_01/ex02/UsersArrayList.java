package java_module_01.ex02;

public class UsersArrayList implements UsersList {
    private User inventory[];
    private int index;
    private int size;

    private void realloc(int new_cap) {
        User temp[];

        temp = inventory;
        inventory = new User[new_cap];
        size = new_cap;

        for (int i = 0; i < index; i++) {
            inventory[i] = temp[i];
        }
    }

    public UsersArrayList() {
        this.inventory = new User[10];
        this.index = 0;
        this.size = 10;
    }

    public void AddUser(User user) {
        if (index == size) {
            realloc(index * 2);
        }
        inventory[index++] = user;
    };

    public User findUserById(int id) throws UserNotFoundException {
        for (int i = 0; i < index; i++) {
            if (inventory[i].getId() == id) {
                return inventory[i];
            }
        }
        throw new UserNotFoundException("User with ID " + id + " not found.");
    };

    public User findUserByIndex(int index) throws UserNotFoundException {
        if (index < 0 || index > this.index) {
            throw new UserNotFoundException("User at index " + index + " not found.");
        }
        return inventory[index];
    };

    public int length() {
        return index;
    };

    @Override
    public String toString() {
        String output = new String();

        for (int i = 0; i < index; i++) {
            output += "User{id=" + inventory[i].getId() + ", name='" + inventory[i].getName() + "', balance="
                    + inventory[i].getBalance() + "}\n";
        }

        return output;
    }
}
