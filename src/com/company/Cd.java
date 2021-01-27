package com.company;

public class Cd extends Ab implements Printable {
    private int c;

    public Cd(int c, int a) {
        super(a);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void print() {
        System.out.println("c=" + c);
    }
}
