package cn.zh.auth.service.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 〈security配置〉
 * 配置Spring Security
 * ResourceServerConfig 是比SecurityConfig 的优先级低的
 * @author wangmx
 * @since 1.0.0
 */
@Configuration
@EnableWebSecurity
@Order(2)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

}
