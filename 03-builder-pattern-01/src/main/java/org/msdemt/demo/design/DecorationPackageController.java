package org.msdemt.demo.design;

import org.msdemt.demo.design.ceiling.LevelOneCeiling;
import org.msdemt.demo.design.ceiling.LevelTwoCeiling;
import org.msdemt.demo.design.coat.DuluxCoat;
import org.msdemt.demo.design.coat.LiBangCoat;
import org.msdemt.demo.design.floor.ShengXiangFloor;
import org.msdemt.demo.design.tile.DongPengTile;
import org.msdemt.demo.design.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageController {

    public String getMatterList(BigDecimal area, Integer level){
        List<Matter> list = new ArrayList<>();      //装修清单
        BigDecimal price = BigDecimal.ZERO;         //装修价格

        //豪华欧式
        if(1 == level){
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();        //吊顶
            DuluxCoat duluxCoat = new DuluxCoat();                          //涂料
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();        //地板

            list.add(levelTwoCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }

        //轻奢田园
        if(2 == level){
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();        //吊顶
            LiBangCoat liBangCoat = new LiBangCoat();                       //涂料
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();              //地砖

            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        if(3 == level){
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();

            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\r\n------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + level + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + "元\r\n" +
                "房屋面积：" + area.doubleValue() + "平米\r\n" +
                "材料清单：\r\n");

        for(Matter matter : list){
            detail.append(
                    matter.scene())
                    .append(":")
                    .append(matter.brand())
                    .append("、")
                    .append(matter.model())
                    .append("、平米价格：")
                    .append(matter.price())
                    .append("元。\n");
        }
        return detail.toString();
    }
}
