package cn.zh.core.service.controller;

import cn.zh.core.service.entity.Article;
import cn.zh.core.service.repository.ArticleRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import utils.Result;

/**
 * @author zh
 */
@RequestMapping("/article")
@Controller
public class ArticleController {
    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @PostMapping("/save")
    @ResponseBody
    public Result save(@RequestBody Article article) {
        return Result.ok(articleRepository.save(article));
    }

    @ResponseBody
    @GetMapping("/findList")
    public Result findList(@PageableDefault(direction = Sort.Direction.DESC) Pageable pageable) {
        return Result.ok(articleRepository.findAll(pageable));
    }
}
