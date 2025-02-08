import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame// extend -> Herencia de JFrame
{
    //Dibujar la interfaz grafica
    public FrmJuego()
    {
        setSize(500, 300);//tamaño de la interfaz
        setTitle("Juguemos a los dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDado1 = new JLabel(); // instancia de objeto con Jlabel
        String nombreimagen = "/imagenes/1.jpg";// cargar imagen
        ImageIcon imagen =  new ImageIcon(getClass().getResource(nombreimagen));//Instancia de objeto con parametro

        lblDado1.setIcon(imagen);//Mostrar imagen en una interfaz grafica 
        lblDado1.setBounds(10, 10, imagen.getIconWidth(), imagen.getIconHeight()); // Dimensiones del objeto
        getContentPane().add(lblDado1);//Mostrar

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10+imagen.getIconWidth(), 10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado2);//Mostrar

        JLabel lblTitulo1 = new JLabel("Lanzamientos");
        lblTitulo1.setBounds(50+2*imagen.getIconWidth(),10,100,25);
        getContentPane().add(lblTitulo1);
        JLabel lblTitulo2 = new JLabel("Cenas");
        lblTitulo2.setBounds(160+2*imagen.getIconWidth(),10,100,25);
        getContentPane().add(lblTitulo2);//Mostrar
    }
    

}
