package main;

import java.util.Scanner;


public class TorpedoTeszt {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int loves = scr.nextInt();
        tesztLoves(loves);
        
    }

    public static void tesztLoves(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
    }
}
