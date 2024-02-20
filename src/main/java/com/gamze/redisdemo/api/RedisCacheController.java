package com.gamze.redisdemo.api;

import com.gamze.redisdemo.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/test")
public class RedisCacheController {
    //private int sayac=0;

    @Autowired
    private RedisCacheService redisCacheService;
    @GetMapping
    public String cacheControl() throws InterruptedException {
        //if(sayac==5){
          //  redisCacheService.clearCache();
           // sayac=0;
        //}
        //sayac++;
    return redisCacheService.longRunningMethod();
    }




}
