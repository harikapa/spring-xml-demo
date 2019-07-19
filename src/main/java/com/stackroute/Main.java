package main.java.com.stackroute;

import main.java.com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args)
    {
        //initializing context with beans.xml resource
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        //get movie objects
        Movie ismartShankar = context.getBean("ismartShankar",Movie.class);
        ismartShankar.displayActorDetails();

        Movie ismartShankar1 = context.getBean("ismartshankar1",Movie.class);
        ismartShankar1.displayActorDetails();

        Movie maharshi = context.getBean("maharshi",Movie.class);
        maharshi.displayActorDetails();

        Movie maharshi1 = context.getBean("maharshi1",Movie.class);
        maharshi1.displayActorDetails();

        System.out.println("using prototype scope:");
        System.out.println(ismartShankar == ismartShankar1);
        System.out.println("using singleton scope:");
        System.out.println(maharshi == maharshi1);
    }
}
