package cn.iocoder.yudao.module.system.learning.zuoye1.service;

import cn.iocoder.yudao.module.system.learning.zuoye1.vo.User;

import java.util.List;

public interface UserService {
    public User queryUserById(int id);

    public List<User> queryUserByAge(int age);

    public List<User> queryUserByName(String username);

}
