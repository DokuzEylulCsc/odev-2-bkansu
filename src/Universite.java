import java.util.ArrayList;
import java.util.Arrays;

public class Universite {
    String uniAdı;
    ArrayList<Fakulte> fakulteler = new ArrayList();


    public void fakulteAc(String fakuklteAdı) {
        Fakulte x = new Fakulte(fakuklteAdı, this);
        fakulteler.add(x);
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
