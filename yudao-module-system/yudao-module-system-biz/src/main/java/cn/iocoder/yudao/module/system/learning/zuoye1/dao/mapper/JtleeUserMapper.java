package cn.iocoder.yudao.module.system.learning.zuoye1.dao.mapper;

import cn.iocoder.yudao.module.system.learning.zuoye1.vo.JtleeUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import org.springframework.data.repository.query.Param;

@Mapper
public interface JtleeUserMapper {
    @Select("select * from system_users where id = #{id}")
    JtleeUser getUserById(@Param("id")int id);

}
