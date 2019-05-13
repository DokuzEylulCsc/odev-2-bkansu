import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Universite {
    String uniAdı;
    ArrayList<Fakulte> fakulteler = new ArrayList();


    public void fakulteAc(String fakuklteAdı) {/* Fakulte olusturucu metod */
        Fakulte x = new Fakulte(fakuklteAdı, this);
        fakulteler.add(x);
    }


    public Iterator Iterator(int index,int index2){
        return fakulteler.get(index).bolumler.get(index2).Iterator();

    }

    public Universite(String uniAdı) {
        this.uniAdı = uniAdı;
    }

    public String getUniAdı() {
        return uniAdı;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "uniAdı='" + uniAdı + '\'' +
                ", fakulteler=" + fakulteler +
                '}';
    }
}
