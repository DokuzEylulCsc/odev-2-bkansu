import ogrenci.Ogrenci;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Bolum {

    String bolumAdı;
    Fakulte fakulte;
    ArrayList<Ders> dersler = new ArrayList();
    ArrayList<Ogrenci> ogrenciler = new ArrayList();
    //    Ogrenci[] ogrenciler = new Ogrenci[500];
    // Ogretim_Elemani[] ogretim_elemanlari = new Ogretim_Elemani[100];
    ArrayList ogretim_elemanlari = new ArrayList();
    int i = 0;
    int j = 0;
    int k = 0;

    public Iterator Iterator(){
        return ogrenciler.iterator();

    }


    public void ogrenciKayıt(Ogrenci x) {
        ogrenciler.add(x);
    }

    public void ogrenciSil(Ogrenci x) {
        ogrenciler.remove(x);
    }

    public void ogretim_uyesi_ata(Ogretim_Elemani x) {
        ogretim_elemanlari.add(x);

    }

    public void ogretim_uyesi_sil(Ogretim_Elemani x) {
        ogretim_elemanlari.remove(x);
    }

    int ct = 0;

    public void dersAc(String dersAdı,int subeSayisi, Ogretim_Elemani o) {
        Ders x = new Ders(dersAdı, subeSayisi,o, this);
        dersler.add(x);
    }

    public void dersSil(Ders x) {
        dersler.remove(x);
    }


    public Bolum(String bolumAdı, Fakulte fakulty) {
        this.fakulte = fakulty;
        this.bolumAdı = bolumAdı;
    }

    public String getBolumAdı() {
        return bolumAdı;
    }

    @Override
    public String toString() {
        return "Bolum{" +
                "bolumAdı='" + bolumAdı + '\'' +
                ", dersler=" + dersler +
                ", ogrenciler=" + ogrenciler +
                ", ogretim_elemanlari=" + ogretim_elemanlari +
                '}';
    }
}
