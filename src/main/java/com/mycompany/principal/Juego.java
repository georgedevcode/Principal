
package com.mycompany.principal;

import Entidad.Personaje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel implements Runnable {

    public int puntosGanadosPorPartida = 0;

    public int puntosPerdidosPorPartida = 0;

    private int backgroundX = 0;

    private Image backgroundImage;

    public Obstaculo obstaculos = new Obstaculo();

    public Enemigo enemigo = new Enemigo();

    public Sonido sonido = new Sonido();

    private Teclado teclado = new Teclado();

    private Boolean gameRunning = true;

    //Este objeto es el personaje, pero solo vamos a user al pokemon que es la Jugador3.java
    public Personaje jugador = new Personaje(this, this.teclado);

    public GestorColisiones colisionchek = new GestorColisiones(this);
    //FPS
    private int FPS = 70;

    private Thread juegoThread; // Hilo

    public Juego(JFrame parentFrame) {
//Ajustes de pantalla

        this.setPreferredSize(new Dimension(1080, 600));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(teclado);
        this.setFocusable(true);
        LoadBackgroundImage();
    }

    public void LoadBackgroundImage() {
        try {

            BufferedImage image = ImageIO.read(new File("src/main/java/Background/Background.jpg"));
            backgroundImage = image.getScaledInstance(1080, 600, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setupGame() {

        playMusic(0);

    }

    public void empezarHilo() {

        juegoThread = new Thread(this);

        juegoThread.start();
    }
// Limitar la cantidad de veces que se actualiza la pantalla

    @Override
    public void run() {

        double intervaloDibujo = 1000000000 / FPS;

        double delta = 0;

        long ultimavez = System.nanoTime();

        long tiempoActual;

        while (juegoThread != null && this.gameRunning) {

            tiempoActual = System.nanoTime();

            delta += (tiempoActual - ultimavez) / intervaloDibujo;

            ultimavez = tiempoActual;

            

            if (delta >= 1) {

                actualizar();

                repaint();

                delta--;
            }

            if(jugador.score >= 5000  || jugador.lives == 0){

                this.gameRunning = false;

                if (jugador.score >= 5000) {

                    System.out.println("Jugador gano");
                    
                } else {

                    System.out.println("Jugador perdio");

                }

            }

        }

        System.exit(0);
    }

    public void actualizar() {

        obstaculos.actualizar();

        enemigo.actualizar();

        jugador.handleCollisionWithObstacle(obstaculos);

        enemigo.handleCollisionWithCharacter(jugador);

        jugador.actualizar();

    }

// Dibujar en el JFrame
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //Velocidad de desplazamiento del fondo
        backgroundX -= 7;
        
        //Si el fondo se desplaza fuera de la ventana se reinicia la posicion
        if (backgroundX < -backgroundImage.getWidth(null)) {

            backgroundX = 0;
        }
        // Dibuja la imagen de fondo repetida
        int xPos = backgroundX;
        
        while (xPos < getWidth()) {
            
            g.drawImage(backgroundImage, xPos, 0, this);
            
            xPos += backgroundImage.getWidth(null);
        }
        
        Graphics2D g2 = (Graphics2D) g;

        jugador.dibujar(g2);

        enemigo.dibujar(g2);

        obstaculos.dibujar(g2);
        
        g2.dispose();

    }

    public void playMusic(int i) {

        sonido.setFile(i);

        sonido.play();

        sonido.setVolume(0.1f);

        sonido.loop();

    }

    public void stopMusic() {

        sonido.stop();

    }

    public void playEfectos(int i) {

        sonido.setFile(i);

        sonido.play();

    }

}


    

