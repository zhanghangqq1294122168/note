package cn.zh.upload.service.entity;

import entity.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zhanghang
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class UpFile  extends BasePojo implements Serializable {

    private static final long serialVersionUID = 6786342193766039511L;

    public String fileName;

    public String url;
}
