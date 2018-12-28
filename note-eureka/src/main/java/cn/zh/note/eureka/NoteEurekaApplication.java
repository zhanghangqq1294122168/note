package cn.zh.note.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zh
 */
@SpringBootApplication
@EnableEurekaServer
public class NoteEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteEurekaApplication.class, args);
    }
}
