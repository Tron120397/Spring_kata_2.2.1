package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
   void add(User user);

   User findByCar(String model, Integer series);

   List<User> listUsers();
}
