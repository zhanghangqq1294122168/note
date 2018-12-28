package cn.zh.note.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhanghang
 */
@SpringBootApplication
@EnableEurekaClient
public class NoteGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteGatewayApplication.class, args);
    }

}

