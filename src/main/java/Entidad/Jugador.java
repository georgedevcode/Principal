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
import javax.swing.JPanel;

public class Jugador  extends JPanel{

    Juego juego;
    Teclado teclado;
    Entidad entidad = new Entidad();

    public Jugador(Juego juego, Teclado teclado){

        this.juego = juego;

        this.teclado = teclado;

        setVisible(true);

        entidad.areaSolida = new Rectangle(62, 150);

        setDefaultValues();

        getImagenJugador();

    }

    public void getImagenJugador() {
        try {

            entidad.rollSprites[1] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_01.png"));
            entidad.rollSprites[0] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_00.png"));
            entidad.rollSprites[2] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_02.png"));
            entidad.rollSprites[4] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_04.png"));
            entidad.rollSprites[3] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_03.png"));
            entidad.rollSprites[5] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_05.png"));
            entidad.rollSprites[6] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_06.png"));
            entidad.rollSprites[7] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_07.png"));
            entidad.rollSprites[8] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_08.png"));
            entidad.rollSprites[9] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_09.png"));
            entidad.rollSprites[10] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_10.png"));
            entidad.rollSprites[11] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_11.png"));
            entidad.rollSprites[12] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_12.png"));
            entidad.rollSprites[13] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_13.png"));
            entidad.rollSprites[14] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_14.png"));
            entidad.rollSprites[15] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_15.png"));
            entidad.rollSprites[16] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_16.png"));
            entidad.rollSprites[17] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_17.png"));
            entidad.rollSprites[18] = ImageIO.read(new File("src/main/java/sprites/skater boy-roll_18.png"));

            entidad.ollieSprites[0] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_00.png"));
            entidad.ollieSprites[1] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_01.png"));
            entidad.ollieSprites[2] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_02.png"));
            entidad.ollieSprites[3] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_03.png"));
            entidad.ollieSprites[4] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_04.png"));
            entidad.ollieSprites[5] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_05.png"));
            entidad.ollieSprites[6] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_06.png"));
            entidad.ollieSprites[7] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_07.png"));
            entidad.ollieSprites[8] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_08.png"));
            entidad.ollieSprites[9] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_09.png"));
            entidad.ollieSprites[10] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_10.png"));
            entidad.ollieSprites[11] = ImageIO.read(new File("src/main/java/sprites/ollie/skater boy-ollie_11.png"));

            entidad.idelsprites[0] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_00.png"));
            entidad.idelsprites[1] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_01.png"));
            entidad.idelsprites[2] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_02.png"));
            entidad.idelsprites[3] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_03.png"));
            entidad.idelsprites[4] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_04.png"));
            entidad.idelsprites[5] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_05.png"));
            entidad.idelsprites[6] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_06.png"));
            entidad.idelsprites[7] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_07.png"));
            entidad.idelsprites[8] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_08.png"));
            entidad.idelsprites[9] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_09.png"));
            entidad.idelsprites[10] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_10.png"));
            entidad.idelsprites[11] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_11.png"));
            entidad.idelsprites[12] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_12.png"));
            entidad.idelsprites[13] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_13.png"));
            entidad.idelsprites[14] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_14.png"));
            entidad.idelsprites[15] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_15.png"));
            entidad.idelsprites[16] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_16.png"));
            entidad.idelsprites[17] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_17.png"));
            entidad.idelsprites[18] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_18.png"));
            entidad.idelsprites[19] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_19.png"));
            entidad.idelsprites[20] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_20.png"));
            entidad.idelsprites[21] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_21.png"));
            entidad.idelsprites[22] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_22.png"));
            entidad.idelsprites[23] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_23.png"));
            entidad.idelsprites[24] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_24.png"));
            entidad.idelsprites[25] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_25.png"));
            entidad.idelsprites[26] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_26.png"));
            entidad.idelsprites[27] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_27.png"));
            entidad.idelsprites[28] = ImageIO.read(new File("src/main/java/sprites/idle/skater boy-idle_28.png"));

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
    

    public void setDefaultValues() {

        entidad.personajex = 0;

        entidad.personajey = 400;

        entidad.velocidad = 4;

        entidad.velocidadSalto = 8;

        entidad.enelSuelo = true;

        entidad.estaSaltando = false;

        entidad.alturaSalto = 125;

        entidad.saltosRealizados = 0;

        entidad.alturaActual = 0;

        entidad.direccion = "Inactivo";

    }

    public void actualizar() {

        if (teclado.spacePressed) {

            entidad.direccion = "Salto";

            if (!entidad.estaSaltando) {

                if (entidad.enelSuelo || entidad.saltosRealizados < entidad.numerodeSaltos) {

                    entidad.estaSaltando = true;

                    entidad.enelSuelo = false;

                    entidad.alturaActual = 0;

                    entidad.saltosRealizados++;

                }
            }
        }

        if (entidad.estaSaltando) {

            entidad.personajey -= entidad.velocidadSalto;

            entidad.alturaActual += entidad.velocidadSalto;

            if (entidad.alturaActual >= entidad.alturaSalto) {

                entidad.estaSaltando = false;

            }
        } else {

            if (entidad.personajey < entidad.suelo) {

                entidad.personajey += entidad.velocidadSalto;

                if (entidad.personajey >= entidad.suelo) {

                    entidad.personajey = entidad.suelo;

                    entidad.enelSuelo = true;

                    // Restablecer el contador de saltos cuando toca el suelo
                    entidad.saltosRealizados = 0; 

                }
            }
        }
        // Limitar el movimiento del personaje en el eje x
        if (teclado.leftPressed == true) {

            entidad.personajex -= entidad.velocidad;

            if (entidad.personajex < 0) {

                // No permitir que el personaje se salga por el lado izquierdo
                entidad.personajex = 0; 

            }
        } else if (teclado.rigthPressed == true) {

            entidad.direccion = "Derecha";

            entidad.personajex += entidad.velocidad;

            if (entidad.personajex > 950) {

                // No permitir que el personaje se salga por el lado derecho
                entidad.personajex = 950; 

            }
        }

        entidad.areaSolida.setLocation(33 + entidad.personajex, 30 + entidad.personajey);

        entidad.Colision = false;

        juego.colisionchek.colision(entidad);

        if (entidad.Colision == false) {

            entidad.contadordesprites++;

            // Menor valor para cambiar más rápido, mayor para cambiar más lento
            if (entidad.contadordesprites > 4) { 

                // Restablecemos el contador a 0
                entidad.contadordesprites = 0;

                // Cambiamos al siguiente sprite según la dirección actual
                switch (entidad.direccion) {

                    case "Inactivo":

                        entidad.spritenum++;

                        if (entidad.spritenum > 28) {

                            // Volvemos al primer sprite de roll al llegar al último
                            entidad.spritenum = 1; 

                        }

                        break;

                    case "Derecha":

                        entidad.spritenum++;

                        if (entidad.spritenum > 18) {

                            // Volvemos al primer sprite de roll al llegar al último
                            entidad.spritenum = 1; 

                        }

                        break;

                    case "Salto":

                        entidad.spritenum++;

                        if (entidad.spritenum > 11) {

                            // Volvemos al primer sprite de salto al llegar al último
                            entidad.spritenum = 1; 

                            entidad.direccion = "Derecha"; // Volvemos a la dirección de roll al final del salto

                        }

                        break;
                }
            }
        }
    }

    public void dibujar(Graphics2D g2) {

        //Se dibujan los sprites segun las direcciones declaradas anteriormente
        BufferedImage imagen = null;

        switch (entidad.direccion) {

            case "Inactivo":

                imagen = entidad.idelsprites[entidad.spritenum - 1];

                break;

            case "Derecha":

                imagen = entidad.rollSprites[entidad.spritenum - 1];

                break;

            case "Salto":

                if (entidad.spritenum - 1 < entidad.ollieSprites.length) {

                    imagen = entidad.ollieSprites[entidad.spritenum - 1];

                } else {

                    imagen = entidad.ollieSprites[0];

                }

                break;
        }
        g2.setColor(Color.red);

        g2.draw(entidad.areaSolida);

        g2.drawImage(imagen, entidad.personajex, entidad.personajey, 200, 200, null);
    }
}
