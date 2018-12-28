package cn.zh.core.service.repository;

import cn.zh.core.service.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zh
 */
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
