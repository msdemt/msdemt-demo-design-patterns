package org.msdemt.demo.design.card;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟放发爱奇艺会员卡一张：" + bindMobileNumber + ", " + cardId);
    }
}
