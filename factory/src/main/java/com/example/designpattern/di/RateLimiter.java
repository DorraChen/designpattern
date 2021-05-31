package com.example.designpattern.di;

/**
 * @author dorra
 * @date 2021/5/26 17:29
 * @description
 */
public class RateLimiter {
    private RedisCounter redisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }

    public boolean isValid() {
        this.redisCounter.increamentAndGet();
        return true;
    }
}
