import java.util.ArrayList;
import java.util.Arrays;

public class Fakulte {
    String fakülteAdı;
    Universite uni;
    //Bolum[] bolumler = new Bolum[50];
    ArrayList<Bolum> bolumler = new ArrayList();
    //int i=0;
    public void bolumAc(String bolumAdı)
    {
        Bolum x = new Bolum(bolumAdı,this);
        bolumler.add(x);
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
