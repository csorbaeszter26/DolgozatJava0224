package hu.szamalk;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Jarmu extends Auto implements Comparator<Auto> {

    private ArrayList<Auto> autok;
    private int id;
    private String szin;
    private Tulajdonos tulajdonos;

    public Jarmu(int id, String szin, Tulajdonos tulajdonos, Auto[] autok) {
        super(autok);

        this.id = id;
        this.szin = szin;
        this.tulajdonos = tulajdonos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }
/*
    @Override
    public int compareTo(Auto masik) {
        if(this.getFerohely() == masik.ferohely || Objects.equals(this.rendszam, masik.rendszam)){
            return -1;
        }else {
            return 1;
        }
        Arrays.sort(Auto);
    }*/

    @Override
    public int compare(Auto egyik, Auto masik) {
        Collator c = Collator.getInstance();

        return Collator.compare(egyik.getFerohely(), masik.getFerohely());
    }


}
