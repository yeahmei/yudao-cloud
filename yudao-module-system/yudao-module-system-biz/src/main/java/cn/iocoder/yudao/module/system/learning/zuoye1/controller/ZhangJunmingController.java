package cn.iocoder.yudao.module.system.learning.zuoye1.controller;

import cn.iocoder.yudao.module.system.learning.zuoye1.service.UserService;
import cn.iocoder.yudao.module.system.learning.zuoye1.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ZhangJunmingController {

    @Autowired
    private UserService userService;

    @GetMapping("/zuoye/userid")
    public User getUserById(@RequestParam("id") int id) {
        return userService.queryUserById(id);
    }

    @GetMapping("/zuoye/username")
    public List<User> getUserByUsername(@RequestParam("username") String username) {
        return userService.queryUserByName(username);
    }
}

