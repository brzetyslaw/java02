package com.brzetyslaw.java02;

import java.util.ArrayList;

/**
 * Created by user001 on 2016-03-25.
 */
public class PrisonCell {
    private final int MAX_PRISONERS = 4;
    private ArrayList<Prisoner> cell = new ArrayList<>();

    public boolean addPrisonerToCell(Prisoner prisoner) {
        if(cell.size() == MAX_PRISONERS)
            return false;
        else {
            cell.add(prisoner);
            return true;
        }
    }
    public Prisoner removePrisoner(int idPrisoner) {
        Prisoner toFind = null;
        for (Prisoner p : cell) {
            if(p.getId() == idPrisoner)
                toFind = p;
        }
        if(toFind != null) {
            cell.remove(toFind);
            return toFind;
        }
        else
            return null;
    }
    public void removeAllPrisoners() {
        if(!cell.isEmpty()) {
            for (Prisoner p : cell) {
                System.out.println(p);
            }
        }
    }
    public boolean chechPrisoner(int idPrisoner) {
        Prisoner toFind = null;
        for (int i = 0; i < cell.size (); i++) {
            if (cell.get(i).getId() == idPrisoner)
                toFind = cell.get(i);
        }
        if(toFind != null) {
            return true;
        }
        else
            return false;
    }
}
