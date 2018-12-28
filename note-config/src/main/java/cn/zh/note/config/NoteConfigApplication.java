package cn.zh.note.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zh
 */
@EnableConfigServer
@SpringBootApplication
public class NoteConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteConfigApplication.class, args);
    }

}

