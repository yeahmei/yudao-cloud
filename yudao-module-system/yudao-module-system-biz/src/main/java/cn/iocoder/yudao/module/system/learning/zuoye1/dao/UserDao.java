package cn.iocoder.yudao.module.system.learning.zuoye1.dao;

import cn.iocoder.yudao.module.system.learning.zuoye1.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    public User getUserById(@Param("id") int id);

    public List<User> getUserByAge(@Param("age") int age);

    public List<User> getUserByName(@Param("username") String username);

}
