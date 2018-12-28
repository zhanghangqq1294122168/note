package entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhanghang
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BasePojo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;
}
