package cn.iocoder.yudao.module.system.service.select.impl;

import cn.iocoder.yudao.module.system.controller.select.dao.UserDao;
import cn.iocoder.yudao.module.system.controller.select.vo.User;
import cn.iocoder.yudao.module.system.service.select.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> queryUserByAge(int age) {
        return userDao.getUserByAge(age);
    }

    @Override
    public List<User> queryUserByName(String username) {
        return userDao.getUserByName(username);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}

