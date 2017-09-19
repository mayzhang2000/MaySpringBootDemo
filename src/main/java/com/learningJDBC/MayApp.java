package com.learningJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by mayz985 on 9/15/17.
 */
public class MayApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MayConfig.class);

        DataSource dataSource = ctx.getBean(DataSource.class);

        MayRepository mayRepository = ctx.getBean(MayRepository.class);
        mayRepository.createTable();

        MayRegistration registration = new MayRegistration();
        registration.first = "firstMay";
        registration.last = "lastMay";
        registration.age = 0;
        mayRepository.insert(registration);

        mayRepository.read(1);
        List<MayRegistration> list = mayRepository.readAll();
        System.out.println(list.size());

        System.out.println(mayRepository.readOneColumn(1));

    }
}
