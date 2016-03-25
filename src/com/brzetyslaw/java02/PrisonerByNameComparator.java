package com.brzetyslaw.java02;

import java.util.Comparator;

/**
 * Created by user001 on 2016-03-25.
 */
public class PrisonerByNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((String)o1).compareTo((String)o2);
    }
}
