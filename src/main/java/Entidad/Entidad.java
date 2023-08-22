package Entidad;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entidad {

    public BufferedImage[] rollMewtow;

    public BufferedImage[] heelflipMewtow;

    public int personajex, personajey;

    public int velocidad;

    public int velocidadSalto;

    public boolean enelSuelo;

    public boolean estaSaltando;

    public int alturaSalto;

    public int saltosRealizados;

    public final int numerodeSaltos = 2;

    public int alturaActual;

    public final int suelo = 400;

    public int contadordesprites = 0;

    public int spritenum = 1;

    public String direccion;

    public Rectangle areaSolida;
    
    public boolean Colision = false;

    public Entidad() {

       
        rollMewtow = new BufferedImage[27];

        heelflipMewtow = new BufferedImage[12];
    }

}
