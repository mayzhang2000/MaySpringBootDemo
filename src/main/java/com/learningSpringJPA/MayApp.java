package com.learningSpringJPA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mayz985 on 9/20/17.
 */

public class MayApp {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MayConfig.class);
        MayRepository mayRepository = ctx.getBean(MayRepository.class);

        MayRegistration registration = new MayRegistration();
        registration.id = 1;
        registration.first = "firstName";
        mayRepository.save(registration);

        mayRepository.findAll();
        //System.out.println(returned.size());

    }

}
