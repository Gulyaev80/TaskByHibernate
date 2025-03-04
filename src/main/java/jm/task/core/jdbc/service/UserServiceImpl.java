package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoHibernateImpl userDaoHibernate  = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
            userDaoHibernate.saveUser(name, lastName,  age);


    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users =  userDaoHibernate.getAllUsers();
        return users;
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}
