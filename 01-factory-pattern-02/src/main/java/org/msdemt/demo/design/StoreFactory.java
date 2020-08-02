package org.msdemt.demo.design;

import org.msdemt.demo.design.store.ICommodity;
import org.msdemt.demo.design.store.impl.CardCommodityService;
import org.msdemt.demo.design.store.impl.CouponCommodityService;
import org.msdemt.demo.design.store.impl.GoodCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
