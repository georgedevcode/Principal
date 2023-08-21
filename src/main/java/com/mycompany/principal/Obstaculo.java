package com.mycompany.principal;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Obstaculo {

    private int x = 1100;  // Coordenadas iniciales
    
    private int y = 500;
    
    private int width = 200;  // Tamaño
    
    private int height = 75;
    
    private Image image;
    
    private int velocidad = 5;  
    
// Velocidad de desplazamiento
    private int limiteIzquierdo = -width;  // Límite izquierdo para volver a dibujar

    public Obstaculo() {
        
        cargarImagen(); // Cargar la imagen en el constructor
    }

    private void cargarImagen() {
        
        try {
            
            // Carga la imagen desde la ruta del archivo         
            image = ImageIO.read(new File("src/main/java/Obstaculos/Cono.png"));
            
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
        }
    }

    public void dibujar(Graphics2D g2) {
        
        // Dibujar el obstáculo en el g2
        g2.drawImage(image, x, y, width, height, null);
    }
}
