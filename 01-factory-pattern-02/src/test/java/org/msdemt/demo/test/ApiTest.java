package org.msdemt.demo.test;

import org.junit.jupiter.api.Test;
import org.msdemt.demo.design.StoreFactory;
import org.msdemt.demo.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void testCommodity() {
        StoreFactory storeFactory = new StoreFactory();

        //1.优惠券
        ICommodity commodity1 = storeFactory.getCommodityService(1);
        try {
            commodity1.sendCommodity("1001", "EGM1023938910232121323432", "791098764902132", null);
        } catch (Exception e) {
            logger.error("优惠券发放失败：{}", e.getMessage());
        }

        //2.实物商品
        ICommodity commodity2 = storeFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "123321");
        extMap.put("consigneeUserAddress", "xx省xx市xx");
        try {
            commodity2.sendCommodity("1001", "9820198721311", "1023000020112221113", extMap);
        } catch (Exception e) {
            logger.error("实物商品发放失败：{}", e.getMessage());
        }

        //3.第三方兑换卡（爱奇艺）
        ICommodity commodity3 = storeFactory.getCommodityService(3);
        try {
            commodity3.sendCommodity("1001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
        } catch (Exception e) {
            logger.error("第三方兑换卡发放失败：{}", e.getMessage());
        }

    }
}
