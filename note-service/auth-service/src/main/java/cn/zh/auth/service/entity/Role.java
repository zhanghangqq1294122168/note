package cn.zh.auth.service.entity;

import entity.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author zhanghang
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class Role extends BasePojo implements Serializable {
    private static final long serialVersionUID = -5213672557261581097L;
    private String roleName;
    private short valid;
    /**
     * 用一个角色对应多个权限
     */
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE,targetEntity = Permission.class)
    @JoinColumn(name = "permission_id")
    private Set<Permission> permissions;
}
