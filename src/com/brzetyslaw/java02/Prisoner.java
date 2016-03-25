package com.brzetyslaw.java02;

/**
 * Created by user001 on 2016-03-25.
 */
public class Prisoner {
    private int id;
    private String name;
    private Felony felony;
    private static int genId = 0;

    public Prisoner(String name, Felony felony) {
        this.name = name;
        this.felony = felony;
        this.id = genId;
        genId++;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Felony getFelony() {
        return felony;
    }
}
