package com.example.springcloud.serviceconsumerfeign;

import org.springframework.stereotype.Component;

/**
 * 功能描述：
 * <p>
 * Created on 2019/11/26.
 *
 * @author ONCEsama.M
 */
@Component
public class FeignConsumerServiceImpl implements FeignConsumerService {

    @Override
    public String index(String uid) {
        return uid + "，你好，服务提供者出错了，直接返回错误信息";
    }
}
