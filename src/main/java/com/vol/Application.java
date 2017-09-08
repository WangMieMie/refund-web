package com.vol;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @Class Application
 * @Descriptions 程序入口
 * @Author vol
 * @Date 2017/9/6 10:06
 */
@MapperScan("com.vol.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class Application {

    private static Logger logger = LogManager.getLogger(Application.class);

    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }
}
