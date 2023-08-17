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
public class Jugador extends Entidad {

    Juego gp;
    Teclado teclado;

    public Jugador(Juego gp, Teclado teclado){
        this.gp = gp;
        this.teclado = teclado;
        areaSolida = new Rectangle(62, 150);
        setDefaultValues();
        getImagenJugador();

    }

    public void getImagenJugador() {
        try {
            rollSprites[0] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_00.png"));
            rollSprites[1] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_01.png"));
            rollSprites[2] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_02.png"));
            rollSprites[3] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_03.png"));
            rollSprites[4] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_04.png"));
            rollSprites[5] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_05.png"));
            rollSprites[6] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_06.png"));
            rollSprites[7] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_07.png"));
            rollSprites[8] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_08.png"));
            rollSprites[9] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_09.png"));
            rollSprites[10] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_10.png"));
            rollSprites[11] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_11.png"));
            rollSprites[12] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_12.png"));
            rollSprites[13] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_13.png"));
            rollSprites[14] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_14.png"));
            rollSprites[15] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_15.png"));
            rollSprites[16] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_16.png"));
            rollSprites[17] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_17.png"));
            rollSprites[18] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_18.png"));

            ollieSprites[0] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_00.png"));
            ollieSprites[1] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_01.png"));
            ollieSprites[2] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_02.png"));
            ollieSprites[3] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_03.png"));
            ollieSprites[4] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_04.png"));
            ollieSprites[5] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_05.png"));
            ollieSprites[6] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_06.png"));
            ollieSprites[7] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_07.png"));
            ollieSprites[8] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_08.png"));
            ollieSprites[9] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_09.png"));
            ollieSprites[10] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_10.png"));
            ollieSprites[11] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_11.png"));

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
        velocidadSalto = 8;
        enelSuelo = true;
        estaSaltando = false;
        alturaSalto = 125;
        saltosRealizados = 0;
        alturaActual = 0;
        direccion = "Inactivo";

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
        areaSolida.setLocation(33 + personajex, 30 + personajey);
        Colision = false;
        gp.colisionchek.colision(this);
        if (Colision == false) {
            contadordesprites++;
            if (contadordesprites > 4) { // Menor valor para cambiar más rápido, mayor para cambiar más lento
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
                        if (spritenum > 18) {
                            spritenum = 1; // Volvemos al primer sprite de roll al llegar al último
                        }
                        break;
                    case "Salto":
                        spritenum++;
                        if (spritenum > 11) {
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
                imagen = rollSprites[spritenum - 1];
                break;
            case "Salto":
                if (spritenum - 1 < ollieSprites.length) {
                    imagen = ollieSprites[spritenum - 1];
                } else {
                    imagen = ollieSprites[0];
                }

                break;
        }
        g2.setColor(Color.red);
        g2.draw(areaSolida);
        g2.drawImage(imagen, personajex, personajey, 200, 200, null);
    }
}
