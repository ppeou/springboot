package me.home.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:tables.xml")
public class XmlConfiguration {
    @Autowired
    public String myAbc;
}
