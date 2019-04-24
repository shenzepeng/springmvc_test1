package com.example.springmvc_test1.utils;

import lombok.extern.slf4j.Slf4j;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

/**
 * 参数清洗
 * 讲bean转换为map
 * 并且清洗其中为null的值
 * 减少带宽中无用数据的传输提升性能
 * 打印日志可以使用lombok
 */
//@Slf4j
public class ClearBeanNullToMap {
    /**
     * 将JavaBean对象封装到Map集合当中
     *
     * @param bean
     * @return
     * @throws Exception
     */
    public static Map<String, Object> bean2map(Object bean) throws Exception {
        //创建Map集合对象
        Map<String, Object> map = new HashMap<String, Object>();
        //获取对象字节码信息,不要Object的属性
        BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass(), Object.class);
        //获取bean对象中的所有属性
        PropertyDescriptor[] list = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd : list) {
            String key = pd.getName();//获取属性名
            Object value=null;
            try {
                value= pd.getReadMethod().invoke(bean);//调用getter()方法,获取内容
            }catch (Exception e){
              //  log.info("转换参数为null,key：",key);
            }
            if (value!=null){
                map.put(key, value);//增加到map集合当中
            }else {
                continue;
            }

        }
        return map;
    }
}
