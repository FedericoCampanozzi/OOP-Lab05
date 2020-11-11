package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public final class MyStringComparator implements Comparator<String> {
	
    public int compare(final String s1, final String s2) {
        return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
    }
    
}
