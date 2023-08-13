package cn.iocoder.yudao.module.system.learning.zuoye1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类就等同以前的配置文件
 */
@Configuration //告诉Spring这是一个配置类
@ComponentScan(value = "cn.iocoder.yudao.module.system")//相当于是xml配置文件里面的<context:component-scan base-package="com.ldc"/>
public class ZuoyeAutoConfig {

}

