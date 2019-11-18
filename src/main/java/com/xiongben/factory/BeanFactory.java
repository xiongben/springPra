package com.xiongben.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties props;
    private static Map<String,Object> beans;
    static {
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            beans = new HashMap<String, Object>();
            Enumeration keys = props.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }




    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

//    public static Object getBean(String beanName){
//        Object bean = null;
//        try {
//            String beanPath = props.getProperty(beanName);
//            bean = Class.forName(beanPath).newInstance();//每次都会调用默认构造函数创建对象
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return bean;
//    }
}
