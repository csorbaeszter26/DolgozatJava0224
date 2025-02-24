package hu.szamalk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Auto  {

    private String rendszam;
    private int ferohely, ar;
    private boolean egyforma;

    public Auto(String rendszam, int ferohely, int ar) {
        this.rendszam = rendszam;
        this.ferohely = ferohely;
        this.ar = ar;
    }

    public Auto(Auto[] autok) {
    }


    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }





}
