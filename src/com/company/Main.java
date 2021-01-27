package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        createObject("bc");
        createObject("cd");
        createObject("de");

    }
    public static Ab createObject(String className){
        switch(className){
            case "bc":
                Bc bc = new Bc(2, 2);
                bc.print();
                return bc;
            case "cd":
                Cd cd = new Cd(3, 3);
                cd.print();
                return cd;
            case "de":
                De de = new De(4, 4);
                de.print();
                return de;
            default:
                return null;
        }
    }
}