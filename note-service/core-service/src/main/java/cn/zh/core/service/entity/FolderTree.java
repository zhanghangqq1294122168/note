package cn.zh.core.service.entity;

import entity.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghang
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(indexes = {@Index(columnList = "id")})
public class FolderTree extends BasePojo implements Serializable {

    private static final long serialVersionUID = 6130029268300997273L;

    private Integer parentId;

    private String label;

    @Transient
    private List<FolderTree> children = new ArrayList<>();

}
