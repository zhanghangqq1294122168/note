package cn.zh.core.service.service;

import cn.zh.core.service.entity.FolderTree;

import java.util.List;

/**
 * @author zh
 */
public interface FolderTreeService {

    List<FolderTree> getFolderTree(Integer topId);

}
