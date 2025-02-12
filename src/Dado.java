import java.util.Random;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class Dado 
{
    private int numero;

    public void lanzar( Random r)
    {
        numero = r.nextInt(6) + 1;
    }

    public int getNumero(){//Encapsulamiento
        return numero;
    }

    public void mostrar( JLabel lbl)
    {
        String nombreimagen = "/imagenes/" + String.valueOf(numero) + ".jpg";
        ImageIcon imagen =  new ImageIcon(getClass().getResource(nombreimagen));
        lbl.setIcon(imagen);
    }
}
