package me.home.app;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.Map;

import me.home.app.CmdbProperties;

import static java.lang.String.format;

@SpringBootApplication
public class Main {

    @Autowired
    @Qualifier("myAbc")
    public String myAbc;

    @Autowired
    @Qualifier("myMap")
    public Map<?, ?> myMap;

    @Value("${amazon.dynamodb.endpoint}")
    public String string2;


    /*@Autowired
    private XmlConfiguration xmlConfiguration;
    @Autowired
    private CmdbProperties cmdbProperties;
    */



    public static void main(String[] args) {
        System.out.println("Start xconfig");
        SpringApplication.run(Main.class, args);
        System.out.println("End xconfig");

    }

    /*@PostConstruct
    public void init() {
        System.out.println(cmdbProperties.toString());
        System.out.println("-- myAbc : " + myAbc + "--");
        //System.out.println("-- myAbc : " + xmlConfiguration.myAbc + "--");
        System.out.println("-- string2 : " + string2 + "--");
    }*/

    @PostConstruct
    public void init() {
        System.out.println("-- myAbc : " + myAbc + "--");
        System.out.println("-- string2 : " + string2 + "--");
        System.out.println("-- string2 : " + myMap.size() + "--");
        for(Map.Entry<?, ?> a : myMap.entrySet()) {
            System.out.println(format("%s : %s", a.getKey(), a.getValue()));
        }
    }

}
