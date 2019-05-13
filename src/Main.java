import ogrenci.Doktora_Ogrencisi;
import ogrenci.Lisans_Ogrencisi;
import ogrenci.Yuksek_Lisans_Ogrencisi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File dosya = new File("Ogrenci Bilgi Sistemi.txt");
        FileWriter yaz = new FileWriter(dosya);
        BufferedWriter bYaz = new BufferedWriter(yaz);
        Scanner sc = new Scanner(System.in);

        Universite deu = new Universite("DokuzEylulÜniversitesi");
        Ogretim_Elemani ahmet = new Ogretim_Elemani("Ahmet", "Yurttaş", 20110016);
        Ogretim_Elemani ayse = new Ogretim_Elemani("Ayşe", "Yurttaş", 20110017);
        Ogretim_Elemani sevda = new Ogretim_Elemani("Sevda", "Barış", 20110018);
        Lisans_Ogrencisi l1 = new Lisans_Ogrencisi("Ali", "Gün", 00, 1);
        Lisans_Ogrencisi l2 = new Lisans_Ogrencisi("Alev", "Genç", 01, 3);
        Yuksek_Lisans_Ogrencisi y1 = new Yuksek_Lisans_Ogrencisi("Ayşe", "Gençsoy", 01, 1);
        Yuksek_Lisans_Ogrencisi y2 = new Yuksek_Lisans_Ogrencisi("Atakan", "Gürsoy", 02, 2);
        Doktora_Ogrencisi d1 = new Doktora_Ogrencisi("John", "Adams", 01, "Veri Madenciliği");

        deu.fakulteAc("Fen Fakültesi");
        deu.fakulteler.get(0).bolumAc("Bilgisayar Bilimleri");
        deu.fakulteler.get(0).bolumler.get(0).ogretim_uyesi_ata(ahmet);
        deu.fakulteler.get(0).bolumler.get(0).dersAc("Veritabanı Yönetimi", ahmet);
        deu.fakulteler.get(0).bolumler.get(0).dersAc("Bilgisayar Bilimlerine Giriş", ayse);
        deu.fakulteler.get(0).bolumler.get(0).dersAc("Veriyapıları", sevda);
        deu.fakulteler.get(0).bolumler.get(0).dersAc("Matematiksel Programlama", ahmet);
        deu.fakulteler.get(0).bolumler.get(0).ogrenciKayıt(l1);
        deu.fakulteler.get(0).bolumler.get(0).ogrenciKayıt(l2);
        deu.fakulteler.get(0).bolumler.get(0).ogrenciKayıt(y1);
        deu.fakulteler.get(0).bolumler.get(0).ogrenciKayıt(y2);
        deu.fakulteler.get(0).bolumler.get(0).ogrenciKayıt(d1);
        deu.fakulteler.get(0).bolumler.get(0).dersler.get(0).Ogrenci_Ekle(l1);
        deu.fakulteler.get(0).bolumler.get(0).dersler.get(0).Ogrenci_Ekle(l2);
        deu.fakulteler.get(0).bolumler.get(0).dersler.get(1).Ogrenci_Ekle(y2);
        deu.fakulteler.get(0).bolumler.get(0).dersler.get(1).Ogrenci_Ekle(y1);
        deu.fakulteler.get(0).bolumler.get(0).dersler.get(2).Ogrenci_Ekle(d1);


        dosyayaYaz(bYaz, sc, deu);


        System.out.println(deu.toString());


    }

    private static void dosyayaYaz(BufferedWriter bYaz, Scanner sc, Universite deu) throws IOException {
        System.out.println("Dosyaya yazdırmak istediğiniz fakülte, bölüm, dersin indexini sırasıyla giriniz");
        int index = sc.nextInt();
        int index2 = sc.nextInt();
        int index3 = sc.nextInt();
        bYaz.write(deu.fakulteler.get(index).bolumler.get(index2).dersler.get(index3).toString());
        bYaz.close();
    }
}
