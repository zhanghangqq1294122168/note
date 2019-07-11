package cn.zh.auth.service.entity;

import entity.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author zh
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class Permission extends BasePojo implements Serializable {

    private static final long serialVersionUID = 2962710565289699022L;

    private String zuulPrefix;

    private String servicePrefix;

    private String method;

    private String uri;

}
