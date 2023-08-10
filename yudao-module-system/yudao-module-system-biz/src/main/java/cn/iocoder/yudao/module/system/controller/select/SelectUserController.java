package cn.iocoder.yudao.module.system.controller.select;

import cn.iocoder.yudao.module.system.controller.select.vo.User;
import cn.iocoder.yudao.module.system.service.select.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SelectUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userid")
    public User getUserById(@RequestParam("id") int id){
        return userService.queryUserById(id);
    }

    @GetMapping("/username")
    public List<User> getUserByUsername(@RequestParam("username") String username){
        return userService.queryUserByName(username);
    }

    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public User insertUser(@RequestBody User user){
        int x = userService.insertUser(user);
        return user;
    }
}

