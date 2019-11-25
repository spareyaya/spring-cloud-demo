package com.example.springcloud.serviceconsumerribbon;

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

    public String index(String uid) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/callServiceProvider?uid=" + uid, String.class);
    }
}
