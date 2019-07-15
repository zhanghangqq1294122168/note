package cn.zh.auth.service.controller;

import cn.zh.auth.service.service.impl.UserDetailServiceImpl;
import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.Result;

import java.security.Principal;

/**
 * @author zhanghang
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserDetailServiceImpl userDetailService;

    private final ConsumerTokenServices consumerTokenServices;

    @Autowired
    public UserController(UserDetailServiceImpl userDetailService, ConsumerTokenServices consumerTokenServices) {
        this.userDetailService = userDetailService;
        this.consumerTokenServices = consumerTokenServices;
    }

    @GetMapping("/getUser")
    public Principal user(Principal user) {
        //获取当前用户信息
        return user;
    }

    @DeleteMapping(value = "/exit")
    public Result revokeToken(String accessToken) {
        //注销当前用户
        if (consumerTokenServices.revokeToken(accessToken)) {
            return Result.ok("注销成功");
        } else {
            return Result.ok("注销失败");
        }
    }

}
