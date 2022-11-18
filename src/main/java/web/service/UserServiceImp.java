package web.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }

    @Override
    @Transactional(readOnly = true)
    public User show(long id) {
        return userDao.show(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> find(User user) {
        return userDao.find(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getList() {
        return userDao.getList();
    }


    // требуется библиотека javax.annotation
    @PostConstruct
    private void init() {
        System.out.println("Получена зависимость: " + userDao);
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Уничтожен компонент UserService");
    }
//    private final List<User> listUsers;
//
//    public UserServiceImp() {
//        listUsers = new ArrayList<>();
//        listUsers.add(new User(1, "Den", "Leontev"));
//        listUsers.add(new User(2, "Kat", "Leonteva"));
//        listUsers.add(new User(3, "Yan", "Leontev"));
//        listUsers.add(new User(4, "Masha", "Leonteva"));
//        listUsers.add(new User(5, "Tom", "Leontev"));
//    }
//    // метод выводит список юзеров
//
//
//    public List<User> getAllUsers() {
//        return listUsers;
//    }
//
//    @Override
//    public List<User> getAmountUsers(int amount) {
//        return listUsers.stream().limit(amount).collect(Collectors.toList());
//    }
//
//   //  метод выводит список юзеров
//   @Override
//    public List<User> index() {
//        return listUsers;
//    }
//
//    // метод выводит юзера по его id
//    @Override
//    public List<User> show(int id) {
//        return (List<User>) listUsers.stream().filter(users -> users.getId() == id).findAny().orElse(null);
//    }

}
