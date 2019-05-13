package ogrenci;

public class Lisans_Ogrencisi extends Ogrenci {
    int sınıf;

    public Lisans_Ogrencisi(  String ad,String soyad, int no,int sınıf) {
        super(ad,soyad,no);
        this.sınıf = sınıf;
    }
}
