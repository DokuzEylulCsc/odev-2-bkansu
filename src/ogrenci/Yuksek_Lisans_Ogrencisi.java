package ogrenci;

public class Yuksek_Lisans_Ogrencisi extends  Ogrenci {
    int sınıf;
    public Yuksek_Lisans_Ogrencisi(  String ad,String soyad, int no,int sınıf) {
        super(ad,soyad,no);
        this.sınıf = sınıf;
    }
}
