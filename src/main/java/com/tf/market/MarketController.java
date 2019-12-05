package com.tf.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author swy
 * @date 2019/12/04
 */
@RestController
public class MarketController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private SvcUrlProperties svcUrlProperties;
    
    @GetMapping("test")
    public String test() {
        return "success";
    }
    
    @GetMapping("test2")
    public String test2() {
        return "success2";
    }
    
    @GetMapping("listGoods")
    public String listGoods() {
        String listGoodsUrl = svcUrlProperties.getGoods() + "listGoods";
        return restTemplate.getForObject(listGoodsUrl, String.class);
    }
}
