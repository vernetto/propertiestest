package org.pierre.propertiestest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class PropertiestestApplication implements CommandLineRunner {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(PropertiestestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myService.printProperties();
    }
}
