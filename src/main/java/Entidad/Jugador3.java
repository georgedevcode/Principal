/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import com.mycompany.principal.Juego;
import com.mycompany.principal.Teclado;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class Jugador3 extends Entidad {

    Juego gp;
    Teclado teclado;

    public Jugador3(Juego gp, Teclado teclado) {
        this.gp = gp;
        this.teclado = teclado;
        areaSolida = new Rectangle(62, 150);
        setDefaultValues();
        getImagenJugador();

    }

    public void getImagenJugador() {
        try {
            rollMewtow[0] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (1).png"));
            rollMewtow[1] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (2).png"));
            rollMewtow[2] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (3).png"));
            rollMewtow[3] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (4).png"));
            rollMewtow[4] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (5).png"));
            rollMewtow[5] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (6).png"));
            rollMewtow[6] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (7).png"));
            rollMewtow[7] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (8).png"));
            rollMewtow[8] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (9).png"));
            rollMewtow[9] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (10).png"));
            rollMewtow[10] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (11).png"));
            rollMewtow[11] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (12).png"));
            rollMewtow[12] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (13).png"));
            rollMewtow[13] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (14).png"));
            rollMewtow[14] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (15).png"));
            rollMewtow[15] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (16).png"));
            rollMewtow[16] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (17).png"));
            rollMewtow[17] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (18).png"));
            rollMewtow[18] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (19).png"));
            rollMewtow[19] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (20).png"));
            rollMewtow[20] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (21).png"));
            rollMewtow[21] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (22).png"));
            rollMewtow[22] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (23).png"));
            rollMewtow[23] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (24).png"));
            rollMewtow[24] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (25).png"));
            rollMewtow[25] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (26).png"));

            heelflipMewtow[0] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (1).png"));
            heelflipMewtow[1] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (2).png"));
            heelflipMewtow[2] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (3).png"));
            heelflipMewtow[3] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (4).png"));
            heelflipMewtow[4] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (5).png"));
            heelflipMewtow[5] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (6).png"));
            heelflipMewtow[6] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (7).png"));
            heelflipMewtow[7] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (8).png"));
            heelflipMewtow[8] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (9).png"));
            heelflipMewtow[9] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (10).png"));
            heelflipMewtow[10] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (11).png"));
            heelflipMewtow[11] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (12).png"));

            idelsprites[0] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_00.png"));
            idelsprites[1] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_01.png"));
            idelsprites[2] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_02.png"));
            idelsprites[3] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_03.png"));
            idelsprites[4] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_04.png"));
            idelsprites[5] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_05.png"));
            idelsprites[6] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_06.png"));
            idelsprites[7] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_07.png"));
            idelsprites[8] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_08.png"));
            idelsprites[9] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_09.png"));
            idelsprites[10] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_10.png"));
            idelsprites[11] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_11.png"));
            idelsprites[12] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_12.png"));
            idelsprites[13] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_13.png"));
            idelsprites[14] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_14.png"));
            idelsprites[15] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_15.png"));
            idelsprites[16] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_16.png"));
            idelsprites[17] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_17.png"));
            idelsprites[18] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_18.png"));
            idelsprites[19] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_19.png"));
            idelsprites[20] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_20.png"));
            idelsprites[21] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_21.png"));
            idelsprites[22] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_22.png"));
            idelsprites[23] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_23.png"));
            idelsprites[24] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_24.png"));
            idelsprites[25] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_25.png"));
            idelsprites[26] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_26.png"));
            idelsprites[27] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_27.png"));
            idelsprites[28] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_28.png"));

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void setDefaultValues() {
        personajex = 0;
        personajey = 400;
        velocidad = 4;
        velocidadSalto = 7;
        enelSuelo = true;
        estaSaltando = false;
        alturaSalto = 125;
        saltosRealizados = 0;
        alturaActual = 0;
        direccion = "Derecha";

    }

    public void actualizar() {
        if (teclado.spacePressed) {
            direccion = "Salto";
            if (!estaSaltando) {
                if (enelSuelo || saltosRealizados < numerodeSaltos) {
                    estaSaltando = true;
                    enelSuelo = false;
                    alturaActual = 0;
                    saltosRealizados++;
                }
            }
        }

        if (estaSaltando) {
            personajey -= velocidadSalto;
            alturaActual += velocidadSalto;

            if (alturaActual >= alturaSalto) {
                estaSaltando = false;
            }
        } else {
            if (personajey < suelo) {
                personajey += velocidadSalto;

                if (personajey >= suelo) {
                    personajey = suelo;
                    enelSuelo = true;
                    saltosRealizados = 0; // Restablecer el contador de saltos cuando toca el suelo
                }
            }
        }
        // Limitar el movimiento del personaje en el eje x
        if (teclado.leftPressed == true) {
            personajex -= velocidad;
            if (personajex < 0) {
                personajex = 0; // No permitir que el personaje se salga por el lado izquierdo
            }
        } else if (teclado.rigthPressed == true) {
            direccion = "Derecha";
            personajex += velocidad;
            if (personajex > 950) {
                personajex = 950; // No permitir que el personaje se salga por el lado derecho
            }
        }
        areaSolida.setLocation(120 + personajex, 30 + personajey);
        Colision = false;
        gp.colisionchek.colision(this);
        if (Colision == false) {
            contadordesprites++;
            if (contadordesprites > 5) { // Menor valor para cambiar más rápido, mayor para cambiar más lento
                // Restablecemos el contador a 0
                contadordesprites = 0;

                // Cambiamos al siguiente sprite según la dirección actual
                switch (direccion) {
                    case "Inactivo":
                        spritenum++;
                        if (spritenum > 28) {
                            spritenum = 1; // Volvemos al primer sprite de roll al llegar al último
                        }
                        break;
                    case "Derecha":
                        spritenum++;
                        if (spritenum > 26) {
                            spritenum = 1; // Volvemos al primer sprite de roll al llegar al último
                        }
                        break;
                    case "Salto":
                        spritenum++;
                        if (spritenum > 12) {
                            spritenum = 1; // Volvemos al primer sprite de salto al llegar al último
                            direccion = "Derecha"; // Volvemos a la dirección de roll al final del salto
                        }
                        break;
                }
            }
        }
    }

    public void dibujar(Graphics2D g2) {
        //Se dibujan los sprites segun las direcciones declaradas anteriormente
        BufferedImage imagen = null;
        switch (direccion) {
            case "Inactivo":
                imagen = idelsprites[spritenum - 1];
                break;
            case "Derecha":
                imagen = rollMewtow[spritenum - 1];
                break;
            case "Salto":
                if (spritenum - 1 < heelflipMewtow.length) {
                    imagen = heelflipMewtow[spritenum - 1];
                } else {
                    imagen = heelflipMewtow[0];
                }

                break;
        }
        g2.setColor(Color.red);
        g2.draw(areaSolida);
        g2.drawImage(imagen, personajex, personajey, 300, 200, null);
    }
}