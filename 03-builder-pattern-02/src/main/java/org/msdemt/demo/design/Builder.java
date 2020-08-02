package org.msdemt.demo.design;

import org.msdemt.demo.design.ceiling.LevelOneCeiling;
import org.msdemt.demo.design.ceiling.LevelTwoCeiling;
import org.msdemt.demo.design.coat.DuluxCoat;
import org.msdemt.demo.design.coat.LiBangCoat;
import org.msdemt.demo.design.floor.ShengXiangFloor;
import org.msdemt.demo.design.tile.DongPengTile;
import org.msdemt.demo.design.tile.MarcoPoloTile;

public class Builder {

    public IMenu levelOne(Double area){
        return new DecorationPackageMenu(area, "欧式豪华")
                .appendCeiling(new LevelOneCeiling())
                .appendCeiling(new DuluxCoat())
                .appendCeiling(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new DongPengTile());
    }
}
