package cn.zh.core.service.service.impl;

import cn.zh.core.service.entity.FolderTree;
import cn.zh.core.service.repository.FolderTreeRepository;
import cn.zh.core.service.service.FolderTreeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author zh
 */
@Service
public class FolderTreeServiceImpl implements FolderTreeService {

    private final FolderTreeRepository repository;

    public FolderTreeServiceImpl(FolderTreeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<FolderTree> getFolderTree(Integer topId) {
        List<FolderTree> resultList = new ArrayList<>();
        Map<Integer, FolderTree> treeMap = new HashMap<>();
        List<FolderTree> folderTrees = repository.findAll();
        folderTrees.forEach(item -> treeMap.put(item.getId(), item));
        folderTrees.stream()
                .filter(p -> topId.equals(p.getParentId()))
                .forEach(resultList::add);
        folderTrees.stream()
                .filter(p -> !topId.equals(p.getParentId()))
                .forEach(item -> treeMap.get(item.getParentId()).getChildren().add(item));
        return resultList;

    }

}
