package com.sq.cxw;

import org.apache.dubbo.common.URL;

/**
 * @author chengxuwei
 * @date 2019-09-29 10:48
 * @description
 */
public class Circle implements Shape{
    public void draw() {
        System.out.println("circle");
    }

    public void draw(URL url) {
        System.out.println("circle " +url);
    }
}