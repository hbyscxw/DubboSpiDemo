package com.sq.cxw;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.List;

/**
 * @author chengxuwei
 * @date 2019-09-29 10:49
 * @description
 */
public class ShapeDemo {
    public static void main(String[] args) {
        ExtensionLoader<Shape> extensionLoader = ExtensionLoader.getExtensionLoader(Shape.class);
//        Shape shape = extensionLoader.getExtension("circle");
//        shape.draw();

        URL url = URL.valueOf("dubbo://localhost/test?shape=circle");
//        String shapeName = url.getParameter("shape");
//        Shape shape = extensionLoader.getExtension(shapeName);
        Shape shape = extensionLoader.getAdaptiveExtension();
        shape.draw(url);
    }
}