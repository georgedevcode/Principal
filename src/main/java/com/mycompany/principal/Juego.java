
package com.mycompany.principal;


import Entidad.Personaje;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
<<<<<<< HEAD
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
=======
import javax.swing.ImageIcon;
>>>>>>> 4cfbe06bcd3ad163d0458a193cac7ee13c641bef
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel implements Runnable {
    
    private int backgroundX = 0;

    private Image backgroundImage;
    
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

<<<<<<< HEAD
    public Juego(JFrame parentFrame) {
//Ajustes de pantalla

        this.setPreferredSize(new Dimension(1080, 600));

        this.setBackground(Color.black);

=======
    public Juego() {
        //Ajustes de pantalla
>>>>>>> 4cfbe06bcd3ad163d0458a193cac7ee13c641bef
        this.setDoubleBuffered(true);

        this.addKeyListener(teclado);

        this.setFocusable(true);
        this.cargarImagenFondoJuego();
        this.width = this.imagenFondo.getWidth(this);
        this.height = this.imagenFondo.getHeight(this);
        setPreferredSize(new Dimension(this.width, this.height));

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

    
}
