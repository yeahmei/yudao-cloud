package cn.iocoder.yudao.module.system.learning.zuoye1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JtleeUser {
    /**
     * 用户ID
     */
    private int id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号码
     */
    private String mobile;

}
