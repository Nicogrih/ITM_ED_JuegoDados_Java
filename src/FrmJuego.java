import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import  java.awt.Color;
import  java.awt.Font;

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
        lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel("Cenas");
        lblTitulo2.setBounds(160+2*imagen.getIconWidth(),10,100,25);
        lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo2);//Mostrar
        
        //Colores
        JLabel lblLanzamientos= new JLabel();
        lblLanzamientos.setBounds(50+2*imagen.getIconWidth(), 40, 100, 100);
        lblLanzamientos.setBackground(new Color(0,0,0));//fondo
        lblLanzamientos.setForeground(new Color(51,255,0));//letras
        lblLanzamientos.setFont(new Font("Tahona",1, 72 ));// tipo de letra
        lblLanzamientos.setText("0");//inicializacion
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setOpaque(true);
        getContentPane().add(lblLanzamientos);


        JLabel lblCenas = new JLabel();
        lblCenas.setBounds(160+2*imagen.getIconWidth(), 40, 100, 100);
        lblCenas.setBackground(new Color(0,0,0));//fondo
        lblCenas.setForeground(new Color(51,255,0));//letras
        lblCenas.setFont(new Font("Tahona",1, 72 ));// tipo de letra
        lblCenas.setText("0");//inicializacion
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setOpaque(true);
        getContentPane().add(lblCenas);
        //Botones
        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 25+imagen.getIconHeight(), 100, 25);
        getContentPane().add(btnIniciar);
        
        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 55+imagen.getIconHeight(), 100, 25);
        getContentPane().add(btnLanzar);
    }
    
    

}
