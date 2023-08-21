package cn.iocoder.yudao.module.system.learning.zuoye1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

/**
 * 配置类就等同以前的配置文件
 */
@Configuration //告诉Spring这是一个配置类
@ComponentScan(value = "cn.iocoder.yudao.module.system")
public class ZuoyeAutoConfig {
    @Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/zuoye/**");
    }
}

