package main;

public class Hajo {

    private int[] pozicio;

    public String talalat(int poz) {
        int kezdoHely = (int) (Math.random() * 5);
        pozicio[1] = kezdoHely;
        pozicio[2] = kezdoHely + 1;
        pozicio[3] = kezdoHely + 2;
        if (poz == pozicio[1]) {
            return "találat";
        } else {
            return "Nem talált";
        }

    }

}
