package org.msdemt.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.msdemt.demo.design.goods.DeliverReq;
import org.msdemt.demo.design.goods.GoodsService;
import org.msdemt.demo.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class GoodCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if(!isSuccess) throw new RuntimeException("实物商品发放失败");
    }

    private String queryUserPhoneNumber(String uId) {
        return "123456";
    }

    private String queryUserName(String uId) {
        return "小小";
    }
}