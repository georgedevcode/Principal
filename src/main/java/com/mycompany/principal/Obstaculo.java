package com.mycompany.principal;

import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import Entidad.Personaje;

import java.awt.image.BufferedImage;

public class Obstaculo {

    Random random = new Random();

    private int width1 = 200; // Tamaños de los obstaculos 

    private int height1 = 75;

    private int width2 = 200;

    private int height2 = 100;

    private int width3 = 150;

    private int height3 = 75;

    private int width4 = 150;

    private int height4 = 75;

    private int width5 = 150;

    private int height5 = 75;

    private int x = 1100;  // Coordenadas iniciales
    
    private int y = 500;
    
    private int width = 200;  // Tamaño
        
    private BufferedImage[] image;
    
    private int velocidad = 5; 
    
    private int randNumber = 0;
    
// Velocidad de desplazamiento
    private int limiteIzquierdo = -width;  // Límite izquierdo para volver a dibujar

    public Obstaculo() {
        
        cargarImagen(); // Cargar la imagen en el constructor
    }

    private void cargarImagen() {
        
        try {

            // Carga la imagen desde la ruta del archivo   
            this.image = new BufferedImage[5];
            this.image[0] = ImageIO.read(new File("src/main/java/Obstaculos/obstaculo-1.png"));
            this.image[1] = ImageIO.read(new File("src/main/java/Obstaculos/obstaculo-2.png"));
            this.image[2] = ImageIO.read(new File("src/main/java/Obstaculos/obstaculo-3.png"));
            this.image[3] = ImageIO.read(new File("src/main/java/Obstaculos/obstaculo-4.png"));
            this.image[4] = ImageIO.read(new File("src/main/java/Obstaculos/obstaculo-5.png"));
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }

    public void actualizar() {

        // Mueve el obstáculo hacia la izquierda
        x -= velocidad;

        // Si el obstáculo sale de la pantalla por la izquierda, reinicia su posición
        if (x < limiteIzquierdo) {
            
            x = 1000;  // Reinicia la posición a la derecha
            this.randNumber = random.nextInt(image.length);
        }
    }

    public void dibujar(Graphics2D g2) {
        
     
        // Dibujar el obstáculo en el g2
        BufferedImage obstacle = image[this.randNumber];

        int obstacleWidth = 0;
        int obstacleHeight = 0;

        // Seleccionar el tamaño de acuerdo al número aleatorio
        switch (this.randNumber) {
            case 0:
                obstacleWidth = width1;
                obstacleHeight = height1;
                break;
            case 1:
                obstacleWidth = width2;
                obstacleHeight = height2;
                break;
            case 2:
                obstacleWidth = width2;
                obstacleHeight = height2;
                break;
            case 3:
                obstacleWidth = width2;
                obstacleHeight = height2;
                break;
            case 4:
                obstacleWidth = width2;
                obstacleHeight = height2;
                break;
            case 5:
                obstacleWidth = width2;
                obstacleHeight = height2;
                break;
        }

        g2.drawImage(obstacle, x, y, obstacleWidth, obstacleHeight, null);
    }

    //  public Rectangle getBoundingBox() {
    //     return new Rectangle(x, y, width, height);
    // }

    // public boolean checkCollisionWithCharacter(Personaje character) {
    //     Rectangle characterBoundingBox = character.getBoundingBox();

    //     // Rectangle obstacleBoundingBox = getBoundingBox();

    //     return characterBoundingBox.intersects(obstacleBoundingBox);
    // }
}
