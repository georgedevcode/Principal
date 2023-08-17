/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author user
 */
public class Entidad {

    public BufferedImage[] rollSprites;
    public BufferedImage[] ollieSprites;
    public BufferedImage[] idelsprites;
    public BufferedImage[] womanidle;
    public BufferedImage[] womanheelflip;
    public BufferedImage[] womanroll;
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
        rollSprites = new BufferedImage[19];
        ollieSprites = new BufferedImage[12];
        idelsprites = new BufferedImage[29];
        womanidle = new BufferedImage[40];
        womanheelflip = new BufferedImage[12];
        womanroll = new BufferedImage[18];
        rollMewtow = new BufferedImage[27];
        heelflipMewtow = new BufferedImage[12];
    }

}
