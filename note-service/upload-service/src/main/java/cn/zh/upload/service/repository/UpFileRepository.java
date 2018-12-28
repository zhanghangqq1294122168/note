package cn.zh.upload.service.repository;

import cn.zh.upload.service.entity.UpFile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanghang
 */
public interface UpFileRepository extends JpaRepository<UpFile, Integer> {

}
