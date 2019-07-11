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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie ismartShankar = context.getBean("ismartShankar",Movie.class);
        ismartShankar.displayActorDetails();

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie maharshi = beanFactory.getBean("maharshi",Movie.class);
        maharshi.displayActorDetails();

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionRegistry beanDefinitionRegistry = new GenericApplicationContext(factory);
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions("beans.xml");
        Movie ismartShankar2 = factory.getBean("ismartShankar",Movie.class);
        ismartShankar2.displayActorDetails();

    }
}
