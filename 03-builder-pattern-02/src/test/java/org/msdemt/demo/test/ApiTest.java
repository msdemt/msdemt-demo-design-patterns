package org.msdemt.demo.test;

import org.junit.jupiter.api.Test;
import org.msdemt.demo.design.Builder;

public class ApiTest {

    @Test
    public void testBuilder(){
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
