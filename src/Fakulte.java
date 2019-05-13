import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Fakulte {
    String fakülteAdı;
    Universite uni;
    //Bolum[] bolumler = new Bolum[50];
    ArrayList<Bolum> bolumler = new ArrayList();
    //int i=0;
    public void bolumAc(String bolumAdı)/* Fakülteye Bölüm olusturucu metod */
    {
        Bolum x = new Bolum(bolumAdı,this);
        bolumler.add(x);
    }

    public Iterator Iterator(int index){
        return bolumler.get(index).Iterator();

    }

    public Fakulte( String fakülteAdı,Universite uni) {
        this.uni=uni;
        this.fakülteAdı = fakülteAdı;
    }

    public String getFakülteAdı() {
        return fakülteAdı;
    }

    @Override
    public String toString() {
        return "Fakulte{" +
                "fakülteAdı='" + fakülteAdı + '\'' +
                ", bolumler=" + bolumler +
                '}';
    }
}
