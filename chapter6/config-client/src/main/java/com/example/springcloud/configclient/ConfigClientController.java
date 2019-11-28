package com.example.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 * <p>
 * Created on 2019/11/28.
 *
 * @author ONCEsama.M
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/getFoo")
    public String getFoo() {
        return foo;
    }
}
