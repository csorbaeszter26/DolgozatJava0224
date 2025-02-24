package hu.szamalk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Garazs implements Comparator<Auto>, Serializable {
    private int ferohely;
    Auto[] autok = new Auto[5];




    private void rendezes() {
        try(ObjectOutputStream objKi = new ObjectOutputStream( new FileOutputStream("autok.ser"))){
            objKi.writeObject(autok);
        }catch (IOException e){
            throw new RuntimeException();
        }
    }


    @Override
    public int compare(Auto egyik, Auto masik) {
        Collator c = Collator.getInstance();

        return Collator.compare(egyik.getFerohely(), masik.getFerohely());
        //return compare(egyik, masik);
    }

    //
}
