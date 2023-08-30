package cn.iocoder.yudao.module.system.learning.zuoye1.service.impl;

import cn.iocoder.yudao.module.system.learning.zuoye1.dao.mapper.JtleeUserMapper;
import cn.iocoder.yudao.module.system.learning.zuoye1.service.JtleeUserService;
import cn.iocoder.yudao.module.system.learning.zuoye1.vo.JtleeUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("jtleeUserService")
public class JtleeUserServiceImpl implements JtleeUserService {

    @Resource
    private JtleeUserMapper jtleeUserMapper;

    @Override
    public JtleeUser getUserById(int id) {
        return jtleeUserMapper.getUserById(id);
    }
}
