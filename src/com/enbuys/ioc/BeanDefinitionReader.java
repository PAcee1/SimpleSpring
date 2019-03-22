package com.enbuys.ioc;

import java.io.FileNotFoundException;

/**
 * Created by code4wt on 17/8/2.
 */
/* 读取xml文件接口 */
public interface BeanDefinitionReader {

    // 读取xml配置
    void loadBeanDefinitions(String location) throws FileNotFoundException, Exception;

}
