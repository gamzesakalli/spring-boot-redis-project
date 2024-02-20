package com.gamze.redisdemo.component;

import com.gamze.redisdemo.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CacheCleanupTask {

    private static final long CLEANUP_INTERVAL = 60000; // 1 dakika (milisaniye cinsinden)

    @Autowired
    private RedisCacheService redisCacheService;

    @Scheduled(fixedDelay = CLEANUP_INTERVAL)
    public void cleanupCache() {
        redisCacheService.clearCache();
    }
}