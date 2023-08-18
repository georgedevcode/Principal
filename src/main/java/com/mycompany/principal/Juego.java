
package com.mycompany.principal;


import Entidad.Personaje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel implements Runnable {
    
    public Sonido sonido = new Sonido();
    private Teclado teclado = new Teclado();
 
    //Este objeto es el personaje, pero solo vamos a user al pokemon que es la Jugador3.java
    Personaje jugador = new Personaje(this, this.teclado);

    public GestorColisiones colisionchek = new GestorColisiones(this);
    //FPS
    private int FPS = 70;

    private Thread juegoThread; // Hilo

    public Juego() {
//Ajustes de pantalla

        this.setPreferredSize(new Dimension(1080, 600));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(teclado);
        this.setFocusable(true);

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

        while (juegoThread != null) {
            tiempoActual = System.nanoTime();
            delta += (tiempoActual - ultimavez) / intervaloDibujo;
            ultimavez = tiempoActual;
            if (delta >= 1) {
                actualizar();
                repaint();
                delta--;
            }

        }
    }

    public void actualizar() {

       jugador.actualizar();

    }

// Dibujar en el JFrame
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        jugador.dibujar(g2);

        g2.dispose();

    }

    public void playMusic(int i) {

        sonido.setFile(i);

        sonido.play();

        sonido.loop();

    }

    public void stopMusic() {

        sonido.stop();

    }

    public void playEfectos(int i) {

        sonido.setFile(i);

        sonido.play();

    }

      public void empezar() {

        JFrame ventana = new JFrame();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setResizable(false);

        ventana.setTitle("Tony Hawk's Pro Skater 2");

        Juego juego = new Juego();

        ventana.add(juego);

        ventana.pack();

        ventana.setLocationRelativeTo(null);

        ventana.setVisible(true);

        juego.empezarHilo();

        juego.setupGame();
    }
}
