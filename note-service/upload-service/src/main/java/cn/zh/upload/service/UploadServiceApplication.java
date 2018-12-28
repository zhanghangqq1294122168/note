package cn.zh.upload.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author zh
 */
@EnableEurekaClient
@SpringBootApplication
@EnableJpaAuditing
public class UploadServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadServiceApplication.class, args);
    }
}
