package cn.zh.auth.service.repository;

import cn.zh.auth.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanghang
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 根据名称查找User
     *  @param userName 用户名称
     *  @return User
     */
    User findByMemberName(String userName);
}
