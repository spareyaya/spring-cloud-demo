package com.example.springcloud.serviceconsumerfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 * <p>
 * Created on 2019/11/25.
 *
 * @author ONCEsama.M
 */
@RestController
public class RibbonConsumerController {
    @Autowired
    private FeignConsumerService feignConsumerService;

    @RequestMapping("/index")
    public String index(@RequestParam("uid") String uid) {
        return feignConsumerService.index(uid);
    }
}
