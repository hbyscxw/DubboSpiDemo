package com.sq.cxw;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author chengxuwei
 * @date 2019-09-29 10:46
 * @description
 */
@SPI
public interface Shape {
    void draw();
    @Adaptive
    void draw(URL url);
}