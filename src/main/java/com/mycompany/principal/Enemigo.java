package com.mycompany.principal;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Enemigo {

    public Rectangle areaSolida = new Rectangle(70, 110);

    private long tiempoEspera = 10000; // Tiempo de espera en milisegundos (40 segundos)

    private long tiempoUltimaAparicion = 0;

    private boolean visible = false;

    private int x = 830; // Posición inicial a la derecha de la pantalla

    private int y = 420;

    public int contadordesprites = 0;

    private boolean animacionTerminada = false;

    public int spritenum = 1;

    public BufferedImage[] Incineroar;

    public Enemigo() {

        Incineroar = new BufferedImage[11];

        getImagenEnemy();
    }

    public void getImagenEnemy() {

        try {

            Incineroar[0] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-1.png"));

            Incineroar[1] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-2.png"));

            Incineroar[2] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-3.png"));

            Incineroar[3] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-4.png"));

            Incineroar[4] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-5.png"));

            Incineroar[5] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-6.png"));

            Incineroar[6] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-7.png"));

            Incineroar[7] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-8.png"));

            Incineroar[8] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-9.png"));

            Incineroar[9] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-10.png"));

            Incineroar[10] = ImageIO.read(new File("src/main/java/Obstaculos/incineroar-11.png"));

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void actualizar() {

        areaSolida.setLocation(120 + x, 30 + y);

        long tiempoActual = System.currentTimeMillis();

        if (!visible && tiempoActual - tiempoUltimaAparicion >= tiempoEspera) {

            visible = true;

            tiempoUltimaAparicion = tiempoActual;
        }

        if (visible) {

            if (!animacionTerminada) {

                contadordesprites++;

                if (contadordesprites > 5) {

                    contadordesprites = 0;

                    spritenum++;

                    if (spritenum > 11) {

                        animacionTerminada = true;

                        spritenum = 10; // Establecemos en el último sprite de la animación
                    }
                }
            } else {

                x -= 12; // Velocidad de dezplazamiento del incineroar

                if (x < -300) {

                    animacionTerminada = false;

                    spritenum = 1;

                    x = 830; // Reiniciar la posición inicial a la derecha

                    tiempoUltimaAparicion = tiempoActual;

                    visible = false; // Ocultar el sprite nuevamente
                }
            }
        }
    }

    public void dibujar(Graphics2D g2) {

        if (visible) {

            BufferedImage imagen = Incineroar[spritenum - 1];
            
            g2.setColor(Color.red);
            
            g2.draw(areaSolida);

            g2.drawImage(imagen, x, y, 300, 200, null);
        }
    }
}
