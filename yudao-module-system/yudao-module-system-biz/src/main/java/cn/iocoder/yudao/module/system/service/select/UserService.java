package cn.iocoder.yudao.module.system.service.select;

import cn.iocoder.yudao.module.system.controller.select.vo.User;

import java.util.List;

public interface UserService {
    public User queryUserById(int id);
    public List<User> queryUserByAge(int age);
    public List<User> queryUserByName(String username);
    public int insertUser(User user);
}
