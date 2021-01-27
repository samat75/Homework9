package com.company;

public class De extends Ab implements Printable {
    private int d;

    public De(int d, int a) {
        super(a);
        this.d = d;
    }

    public void print() {
        System.out.println("d="+d);
    }
}
