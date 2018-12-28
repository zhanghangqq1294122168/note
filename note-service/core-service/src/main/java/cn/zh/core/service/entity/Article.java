package cn.zh.core.service.entity;

import entity.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author zh
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class Article extends BasePojo {

    private static final long serialVersionUID = -855338693283688919L;

    private String title;

    private String classify;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;
}
