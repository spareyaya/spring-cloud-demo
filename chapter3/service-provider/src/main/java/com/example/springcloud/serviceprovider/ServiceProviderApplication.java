package com.example.springcloud.serviceprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceProviderApplication {

    @Value("${server.port}")
    private int port;

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApplication.class, args);
    }

    @RequestMapping("/callServiceProvider")
    public String callServiceProvider(@RequestParam("uid") String uid) {
//        return "用户" + uid + "调用了此服务";
        return "服务" + port + "的消息：用户" + uid + "调用了此服务";
    }
}
