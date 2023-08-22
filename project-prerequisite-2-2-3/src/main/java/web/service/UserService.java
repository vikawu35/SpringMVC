package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUser(long id, User user);
    void deleteUser(long id);
    User getUserById(long id);
    List<User> getUsers();
}
