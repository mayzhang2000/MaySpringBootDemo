package com.learningSpringJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mayz985 on 9/20/17.
 */
@Entity
public class MayRegistration {
    @Id
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name ="first")
    String first;

    @Column(name ="last")
    String last;

    @Column(name ="age")
    int age;
}
