import ogrenci.Ogrenci;

import java.util.ArrayList;
import java.util.Iterator;

public class Sube {
    int no;
    Ders ders;

    public Sube(int no, Ders ders) {
        this.no = no;
        this.ders = ders;
    }

    ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
    public void ogrenciEkle(Ogrenci x){
        for (int a = 0; a <ders.ogrenciler.size() ; a++) {
            if (ders.ogrenciler.contains(x)) {
                ogrenciler.add(x);
            } else {
                throw new RuntimeException("Bölüme eklemek istediğiniz öğrencinin dersin öğrencisi olması gerekmektedir...");
            }

        }
    }

    public Iterator Iterator(){
        return ogrenciler.iterator();

    }

    public void ogrenciSil(Ogrenci x){
        ogrenciler.remove(x);
    }

    @Override
    public String toString() {
        return "Sube{" +
                "no=" + no +
                ", ogrenciler=" + ogrenciler +
                '}';
    }

}
