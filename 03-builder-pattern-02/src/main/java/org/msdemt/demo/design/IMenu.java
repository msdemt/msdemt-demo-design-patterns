package org.msdemt.demo.design;

public interface IMenu {

    /**
     * 吊顶
     * @param matter
     * @return
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     * @param matter
     * @return
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     * @param matter
     * @return
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     * @param matter
     * @return
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     * @return
     */
    String getDetail();
}
