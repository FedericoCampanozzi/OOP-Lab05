package it.unibo.oop.lab05.ex2;

import java.util.*;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    
    private final static int N_ELEM = 100;
    
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */

        final var set = new TreeSet<>(new MyStringComparator());
        for (int i = 0; i < N_ELEM; i++) {
            set.add(Double.toString(Math.random()));
        }
        System.out.println(set);
    }
}
