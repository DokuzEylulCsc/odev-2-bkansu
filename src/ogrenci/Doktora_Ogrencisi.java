package ogrenci;

public class Doktora_Ogrencisi extends Ogrenci {
    String alan;

    public Doktora_Ogrencisi(  String ad,String soyad, int no,String alan) {
        super(ad,soyad,no);
        this.alan = alan;
    }
}
