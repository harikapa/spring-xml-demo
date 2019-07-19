package main.java.com.stackroute;

import main.java.com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        //initializing context with beans.xml resource
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
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

        Movie jersey = context.getBean("jersey",Movie.class);
        jersey.displayActorDetails();

        //destroying context
        ((ClassPathXmlApplicationContext) context).close();

    }
}
