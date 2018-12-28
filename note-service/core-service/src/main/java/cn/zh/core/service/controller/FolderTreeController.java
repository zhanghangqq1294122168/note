package cn.zh.core.service.controller;

import cn.zh.core.service.entity.FolderTree;
import cn.zh.core.service.repository.FolderTreeRepository;
import cn.zh.core.service.service.FolderTreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import utils.Result;


/**
 * @author zhanghang
 */
@Controller
@RequestMapping("/folderTree")
public class FolderTreeController {

    private final FolderTreeRepository repository;

    private final FolderTreeService treeService;

    public FolderTreeController(FolderTreeRepository repository, FolderTreeService treeService) {
        this.repository = repository;
        this.treeService = treeService;
    }


    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    @PostMapping("/add")
    @ResponseBody
    public Result add(FolderTree folderTree) {
        return Result.ok(repository.save(folderTree));
    }

    @GetMapping("/folderTreeList")
    @ResponseBody
    public Result folderTreeList() {
        return Result.ok(treeService.getFolderTree(0));
    }

}
