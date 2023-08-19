
package com.mycompany.principal;


import Entidad.Personaje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel implements Runnable {
    
    public Sonido sonido = new Sonido();
    private Teclado teclado = new Teclado();

    private Image imagenFondo;
    private int width = 0;
    private int height = 0;
 
    //Este objeto es el personaje, pero solo vamos a user al pokemon que es la Jugador3.java
    Personaje personaje = new Personaje(this, this.teclado);

    public GestorColisiones colisionchek = new GestorColisiones(this);
    //FPS
    private int FPS = 70;

    private Thread juegoThread; // Hilo

    public Juego() {
        //Ajustes de pantalla
        this.setDoubleBuffered(true);
        this.addKeyListener(teclado);
        this.setFocusable(true);
        this.cargarImagenFondoJuego();
        this.width = this.imagenFondo.getWidth(this);
        this.height = this.imagenFondo.getHeight(this);
        setPreferredSize(new Dimension(this.width, this.height));

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

       personaje.actualizar();

    }

    public void cargarImagenFondoJuego(){

        ImageIcon Image = new ImageIcon("src/main/java/Menu/Imagen/menu.jpeg");

        this.imagenFondo = Image.getImage();

    }

// Dibujar en el JFrame
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g.drawImage(this.imagenFondo, 0,0, null);

        personaje.dibujar(g2);

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
