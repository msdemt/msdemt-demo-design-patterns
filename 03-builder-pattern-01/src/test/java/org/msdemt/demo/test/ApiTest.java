package org.msdemt.demo.test;

import org.junit.jupiter.api.Test;
import org.msdemt.demo.design.DecorationPackageController;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void testDecorationPackageController(){
        DecorationPackageController decorationPackage = new DecorationPackageController();

        //欧式豪华
        System.out.println(decorationPackage.getMatterList(new BigDecimal("123.52"), 1));

        //轻奢田园
        System.out.println(decorationPackage.getMatterList(new BigDecimal("98.25"), 2));

        //现代简约
        System.out.println(decorationPackage.getMatterList(new BigDecimal("85.43"), 3));
    }
}
