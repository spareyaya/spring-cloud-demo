package com.example.springcloud.serviceconsumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述：
 * <p>
 * Created on 2019/11/25.
 *
 * @author ONCEsama.M
 */
@FeignClient(value = "service-provider", fallback = FeignConsumerServiceImpl.class)
public interface FeignConsumerService {

    @RequestMapping("/callServiceProvider")
    String index(@RequestParam("uid") String uid);
}
