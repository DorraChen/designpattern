package com.example.designpattern;

import org.junit.Test;

/**
 * @author Dorra
 * @date 2021/06/06 21:58
 * @description
 */
public class ResourcePoolConfigTest {
    @Test
    public void resourcePoolTest() {
        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}
