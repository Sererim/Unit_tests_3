package src.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private List<User> data = new ArrayList<>();

    public void addUser(User user) {
      data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Getter for data

    public List<User> getDataList() {
        return this.data;
    }

    public void delogger () {
        Iterator<User> iterator = data.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (!user.getUserGroup()) {
                iterator.remove();
            }
        }
    }
}
