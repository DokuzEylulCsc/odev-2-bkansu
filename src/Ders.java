import ogrenci.Ogrenci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ders {
    String dersAdı;
    int subeSayisi;
    Bolum bolum;
    Ogretim_Elemani x;
    ArrayList<Sube> subeler = new ArrayList<>();
    ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
    int i = 0;

    /*public Iterator getOgrencilerIterator(){
        return ogrenciler.
    }*/

    public Ders(String dersAdı,int subeSayisi, Ogretim_Elemani x, Bolum bolum) {
        this.bolum = bolum;
        this.subeSayisi=subeSayisi;
        this.dersAdı = dersAdı;
        this.x = x;
        if(subeSayisi==0){
            this.subeler.add(new Sube(1,this));
        }
        else{
            this.subeler.add(new Sube(1,this));
            this.subeler.add(new Sube(2,this));
        }
    }

    public Iterator Iterator(){
        return ogrenciler.iterator();

    }


    public void Ogretim_Elemanı_Degistir(Ogretim_Elemani x) {
        this.x = x;
    }

    public void Ogrenci_Ekle(Ogrenci x) {
        for (int a = 0; a < bolum.ogrenciler.size(); a++) {
            if (bolum.ogrenciler.contains(x)) {
                ogrenciler.add(x);
            } else {
                throw new RuntimeException("Derse eklemek istediğiniz öğrencinin fakülte öğrencisi olması gerekmektedir...");
            }

        }
    }

    public void Ogrenci_Sil(Ogrenci x) {
        ogrenciler.remove(x);
    }

    public String getDersAdı() {
        return dersAdı;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "dersAdı='" + dersAdı + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", x=" + x +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
