package com.xiongben.factory;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties props;
    private static Map<String,Object> beans;
    static {
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }
}
