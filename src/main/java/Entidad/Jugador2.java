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


public class Jugador2 extends Entidad {

    Juego juego;

    Teclado teclado;

    public Jugador2(Juego juego, Teclado teclado) {

        this.juego = juego;

        this.teclado = teclado;

        areaSolida = new Rectangle(62, 150);

        setDefaultValues();

        getImagenJugador();

    }

    public void getImagenJugador() {
        try {
            womanidle[0] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (1).png"));
            womanidle[1] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (2).png"));
            womanidle[2] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (3).png"));
            womanidle[3] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (4).png"));
            womanidle[4] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (5).png"));
            womanidle[5] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (6).png"));
            womanidle[6] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (7).png"));
            womanidle[7] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (8).png"));
            womanidle[8] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (9).png"));
            womanidle[9] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (10).png"));
            womanidle[10] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (11).png"));
            womanidle[11] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (12).png"));
            womanidle[12] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (13).png"));
            womanidle[13] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (14).png"));
            womanidle[14] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (15).png"));
            womanidle[15] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (16).png"));
            womanidle[16] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (17).png"));
            womanidle[17] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (18).png"));
            womanidle[18] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (19).png"));
            womanidle[19] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (20).png"));
            womanidle[20] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (21).png"));
            womanidle[21] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (22).png"));
            womanidle[22] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (23).png"));
            womanidle[23] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (24).png"));
            womanidle[24] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (25).png"));
            womanidle[25] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (26).png"));
            womanidle[26] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (27).png"));
            womanidle[27] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (28).png"));
            womanidle[28] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (29).png"));
            womanidle[29] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (30).png"));
            womanidle[30] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (31).png"));
            womanidle[31] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (32).png"));
            womanidle[32] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (33).png"));
            womanidle[33] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (34).png"));
            womanidle[34] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (35).png"));
            womanidle[35] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (36).png"));
            womanidle[36] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (37).png"));
            womanidle[37] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (38).png"));
            womanidle[38] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (39).png"));
            womanidle[39] = ImageIO.read(new File("src/main/java/idlewoman/skater-girl-idle (40).png"));

            womanheelflip[0] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_00.png"));
            womanheelflip[1] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_01.png"));
            womanheelflip[2] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_02.png"));
            womanheelflip[3] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_03.png"));
            womanheelflip[4] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_04.png"));
            womanheelflip[5] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_05.png"));
            womanheelflip[6] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_06.png"));
            womanheelflip[7] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_07.png"));
            womanheelflip[8] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_08.png"));
            womanheelflip[9] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_09.png"));
            womanheelflip[10] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_10.png"));
            womanheelflip[11] = ImageIO.read(new File("src/main/java/idlewoman/heelflip/skater girl-heel flip_11.png"));

            womanroll[0] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_00.png"));
            womanroll[1] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_02.png"));
            womanroll[2] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_03.png"));
            womanroll[3] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_04.png"));
            womanroll[4] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_05.png"));
            womanroll[5] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_06.png"));
            womanroll[6] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_07.png"));
            womanroll[7] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_08.png"));
            womanroll[8] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_09.png"));
            womanroll[9] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_10.png"));
            womanroll[10] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_11.png"));
            womanroll[11] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_12.png"));
            womanroll[12] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_13.png"));
            womanroll[13] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_14.png"));
            womanroll[14] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_15.png"));
            womanroll[15] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_16.png"));
            womanroll[16] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_17.png"));
            womanroll[17] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_18.png"));
            womanroll[18] = ImageIO.read(new File("src/main/java/idlewoman/roll/skater girl-roll B_19.png"));

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

                    // Restablecer el contador de saltos cuando toca el suelo
                    saltosRealizados = 0; 
                }
            }
        }
        // Limitar el movimiento del personaje en el eje x
        if (teclado.leftPressed == true) {

            personajex -= velocidad;

            if (personajex < 0) {

                // No permitir que el personaje se salga por el lado izquierdo
                personajex = 0; 

            }

        } else if (teclado.rigthPressed == true) {

            direccion = "Derecha";

            personajex += velocidad;

            if (personajex > 950) {
                // No permitir que el personaje se salga por el lado derecho
                personajex = 950; 

            }
        }

        areaSolida.setLocation(74 + personajex, 30 + personajey);

        Colision = false;

        juego.colisionchek.colision(this);

        if (Colision == false) {

            contadordesprites++;

            // Menor valor para cambiar más rápido, mayor para cambiar más lento
            if (contadordesprites > 4) { 

                // Restablecemos el contador a 0
                contadordesprites = 0;

                // Cambiamos al siguiente sprite según la dirección actual
                switch (direccion) {

                    case "Inactivo":

                        spritenum++;

                        if (spritenum > 39) {

                            // Volvemos al primer sprite de roll al llegar al último
                            spritenum = 1; 

                        }

                        break;

                    case "Derecha":

                        spritenum++;

                        // Volvemos al primer sprite de roll al llegar al último
                        if (spritenum > 18) {

                            spritenum = 1; 

                        }

                        break;

                    case "Salto":

                        spritenum++;

                        if (spritenum > 11) {

                            // Volvemos al primer sprite de salto al llegar al último
                            spritenum = 1; 
                            
                            // Volvemos a la dirección de roll al final del salto
                            direccion = "Derecha";

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
            
                imagen = womanidle[spritenum - 1];
                
                break;

            case "Derecha":
                
                imagen = womanroll[spritenum - 1];
                
                break;
                
            case "Salto":
                
                if (spritenum - 1 < womanheelflip.length) {

                    imagen = womanheelflip[spritenum - 1];

                } else {

                    imagen = womanheelflip[0];

                }

                break;
        }

        g2.setColor(Color.red);

        g2.draw(areaSolida);
        
        g2.drawImage(imagen, personajex, personajey, 200, 200, null);
    }
}
