package main.java.com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("After properties set entered..");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroy method entered..");
    }

    public void customInit()
    {
        System.out.println("Custom init entered...");
    }

    public void customDestroy()
    {
        System.out.println("Custom Destroy entered...");
    }
}
