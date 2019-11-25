package com.example.springcloud.serviceconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    private RibbonConsumerService ribbonConsumerService;

    @RequestMapping("/index")
    public String index(@RequestParam("uid") String uid) {
        return ribbonConsumerService.index(uid);
    }
}
