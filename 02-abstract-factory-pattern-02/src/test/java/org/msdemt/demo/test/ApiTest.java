package org.msdemt.demo.test;

import org.junit.jupiter.api.Test;
import org.msdemt.demo.design.factory.JDKProxy;
import org.msdemt.demo.design.factory.impl.EGMCacheAdapter;
import org.msdemt.demo.design.factory.impl.IIRCacheAdapter;
import org.msdemt.demo.design.service.CacheService;
import org.msdemt.demo.design.service.impl.CacheServiceImpl;

public class ApiTest {

    @Test
    public void testCacheService(){
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("name", "小小");
        String value01 = proxy_EGM.get("name");
        System.out.println("测试结果：" + value01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("name", "小小小");
        String value02 = proxy_IIR.get("name");
        System.out.println("测试结果：" + value02);
    }
}
