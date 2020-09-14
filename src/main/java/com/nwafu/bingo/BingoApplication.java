package com.nwafu.bingo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@MapperScan("com.nwafu.bingo.dao")
public class BingoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BingoApplication.class, args);
    }

    // 如果您正在构建WAR文件并部署它，则需要WebApplicationInitializer
    // 继承WebApplicationInitializer并重写configure方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BingoApplication.class);
    }

    @RequestMapping
    public String index() {
        return "index";
    }

}
