package com.example.springcloud.serviceconsumerribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 * <p>
 * Created on 2019/11/25.
 *
 * @author ONCEsama.M
 */
@Service
public class RibbonConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexError")
    public String index(String uid) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/callServiceProvider?uid=" + uid, String.class);
    }

    public String indexError(String uid) {
        return uid + "，你好，服务提供者出错了，直接返回错误信息";
    }
}
