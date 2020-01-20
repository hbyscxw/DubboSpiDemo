package com.sq.cxw;

import org.apache.dubbo.common.URL;

/**
 * @author chengxuwei
 * @date 2019-09-29 10:48
 * @description
 */
public class Rect implements Shape{
    public void draw() {
        System.out.println("rect");
    }

    public void draw(URL url) {
        System.out.println("rect " +url);
    }
}