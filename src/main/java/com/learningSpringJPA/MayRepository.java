package com.learningSpringJPA;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by mayz985 on 9/20/17.
 */
@Repository
@Transactional
public class MayRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(MayRegistration registration) {
        em.persist(registration);
    }

    public void findAll() {
        Query query = em.
                createQuery("Select UPPER(e.first) from MayRegistration e");
        List<String> list = query.getResultList();

        for(String e:list) {
            System.out.println("Employee NAME :"+e);
        }
    }

}
