package cn.zh.auth.service.entity;

import entity.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author zhanghang
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class Member extends BasePojo implements Serializable {
    private static final long serialVersionUID = 1904094591712926019L;
    private String memberName;
    private String password;
    private String mobile;
    private String email;
    private short sex;
    private Date birthday;
    /**
     * 一个用户对应多个角色
     */
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE,targetEntity = Role.class)
    @JoinColumn(name = "role_id")
    private Set<Role> roles;
}
