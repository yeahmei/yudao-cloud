package cn.iocoder.yudao.module.system.learning.zuoye1.controller;

import cn.iocoder.yudao.module.system.learning.zuoye1.service.JtleeUserService;
import cn.iocoder.yudao.module.system.learning.zuoye1.vo.JtleeUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/zuoye")
public class JtleeController {
    @Resource
    private JtleeUserService jtleeUserService;

    @GetMapping("/jtuser")
    public JtleeUser getUserById(@RequestParam("id")int id){
        return jtleeUserService.getUserById(id);
    }
}
