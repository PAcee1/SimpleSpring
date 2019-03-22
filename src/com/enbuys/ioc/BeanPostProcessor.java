package com.enbuys.ioc;

/**
 * Created by code4wt on 17/8/3.
 */
/* 通知接口 */
public interface BeanPostProcessor {

    // 前置通知
    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    // 后置通知
    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
