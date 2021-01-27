package com.company;

public class Bc extends Ab implements Printable {
    private int b;

    public Bc(int b, int a) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void print() {
        System.out.println("b=" + b);
    }
}
