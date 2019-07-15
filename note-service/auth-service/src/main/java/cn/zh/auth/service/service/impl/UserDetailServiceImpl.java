package cn.zh.auth.service.service.impl;

import cn.zh.auth.service.repository.UserRepository;
import cn.zh.auth.service.entity.Permission;
import cn.zh.auth.service.entity.Role;
import cn.zh.auth.service.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhanghang
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByMemberName(userName);
        if (user == null) {
            return null;
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : user.getRoles()) {
            //角色必须是ROLE_开头，可以在数据库中设置
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleName());
            grantedAuthorities.add(grantedAuthority);
            //获取权限
            for (Permission permission : role.getPermissions()) {
                GrantedAuthority authority = new SimpleGrantedAuthority(permission.getUri());
                grantedAuthorities.add(authority);
            }
        }
        //可用性:enabled 过期性:accountNonExpired 有效性:credentialsNonExpired 锁定性:accountNonLocked
        return new org.springframework.security.core.userdetails.User(user.getMemberName(), user.getPassword(), true, true, true, true, grantedAuthorities);
    }
}
