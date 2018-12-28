package cn.zh.upload.service.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhanghang
 */
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class UpFile implements Serializable {

    private static final long serialVersionUID = 6786342193766039511L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;

    public String fileName;

    public String url;
}
