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
public class User extends BasePojo implements Serializable {
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
    @OneToMany(cascade=CascadeType.ALL,fetch= FetchType.LAZY,targetEntity=Role.class)
    @JoinColumn(name="employeeId",nullable=false)
    private Set<Role> roles;
}
