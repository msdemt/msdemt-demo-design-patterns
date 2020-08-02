package org.msdemt.demo.test;

import org.junit.jupiter.api.Test;
import org.msdemt.demo.design.service.CacheService;
import org.msdemt.demo.design.service.impl.CacheServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void testCacheService(){
        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("name", "小小", 1);
        String value = cacheService.get("name", 1);
        System.out.println("测试结果：" + value);
    }
}
