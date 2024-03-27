package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.SessionFactory;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

        final SessionFactory sessionFactory ;

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 27);

        userService.saveUser("Андрей", "Андреев", (byte) 37);

        userService.saveUser("Петр", "Петров", (byte) 47);

        userService.saveUser("Сидр", "Сидоров", (byte) 57);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();


    }
}
