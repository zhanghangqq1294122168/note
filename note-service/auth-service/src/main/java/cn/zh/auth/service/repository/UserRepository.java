package cn.zh.auth.service.repository;

import cn.zh.auth.service.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanghang
 */
public interface UserRepository extends JpaRepository<Member, Integer> {
    /**
     * 根据名称查找User
     *  @param userName 用户名称
     *  @return User
     */
    Member findByMemberName(String userName);
}
