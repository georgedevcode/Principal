package Entidad;
import com.mycompany.principal.GestorColisionesInt;
import com.mycompany.principal.Juego;
import com.mycompany.principal.Obstaculo;
import com.mycompany.principal.Teclado;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;

public class Personaje extends Entidad implements GestorColisionesInt{

    Random rand = new Random();

    Juego juego;

    Teclado teclado;

    public int score = 0;

    public int lives = 3;

    

    private boolean colisionDetectada = false; // Variable de control de colisión


    public Personaje(Juego juego, Teclado teclado) {

        this.juego = juego;

        this.teclado = teclado;

        areaSolida = new Rectangle(62, 150);

        setDefaultValues();

        getImagenJugador();

    }

    public Rectangle getBoundingBox() {
        return areaSolida;
    }

    @Override
    public boolean checkCollisionWithObstacle(Obstaculo obstacle) {
        // Check if the bounding box of the character intersects with the obstacle's bounding box
        return areaSolida.intersects(obstacle.getBoundingBox());
    }

    @Override
    public boolean checkCollisionWithCharacter(Personaje character){
        return false;
    };

    @Override
    public void handleCollisionWithCharacter(Personaje character){
        return;
    };

    @Override
    public void handleCollisionWithObstacle(Obstaculo obstacle) {
         
        if (checkCollisionWithObstacle(obstacle)) {
            
            if (!colisionDetectada) {
                
                // Resta 10 puntos por golpear un obstáculo
                
                decreaseScore(10);

                juego.playEfectos(1);

                System.out.println("Decrease: 10 points");
                
              
                
                colisionDetectada = true; // Marcar que se ha detectado una colisión
            }            

        } else if (colisionDetectada == false && estaSaltando == true) {

            int randomPuntaje = rand.nextInt(5);

            int puntos = (2 * randomPuntaje);

            increaseScore(puntos);

            System.out.println("Increase points" + puntos);

        }
        else {
            
            colisionDetectada = false; // Reiniciar la variable si no hay colisión
        }
    }

    private void increaseScore(long points) {

        score += points;

    }

    private void decreaseScore(int points) {

        score -= points;

    }

    // Helper method to update the player's lives
    public void decreaseLives() {

        lives = lives - 1;

        juego.playEfectos(1);

        
    }

   

    public void getImagenJugador() {

        try {
            rollMewtow[0] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (1).png"));
            rollMewtow[1] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (2).png"));
            rollMewtow[2] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (3).png"));
            rollMewtow[3] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (4).png"));
            rollMewtow[4] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (5).png"));
            rollMewtow[5] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (6).png"));
            rollMewtow[6] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (7).png"));
            rollMewtow[7] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (8).png"));
            rollMewtow[8] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (9).png"));
            rollMewtow[9] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (10).png"));
            rollMewtow[10] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (11).png"));
            rollMewtow[11] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (12).png"));
            rollMewtow[12] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (13).png"));
            rollMewtow[13] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (14).png"));
            rollMewtow[14] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (15).png"));
            rollMewtow[15] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (16).png"));
            rollMewtow[16] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (17).png"));
            rollMewtow[17] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (18).png"));
            rollMewtow[18] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (19).png"));
            rollMewtow[19] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (20).png"));
            rollMewtow[20] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (21).png"));
            rollMewtow[21] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (22).png"));
            rollMewtow[22] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (23).png"));
            rollMewtow[23] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (24).png"));
            rollMewtow[24] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (25).png"));
            rollMewtow[25] = ImageIO.read(new File("src/main/java/MewtowRoll/roll (26).png"));

            heelflipMewtow[0] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (1).png"));
            heelflipMewtow[1] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (2).png"));
            heelflipMewtow[2] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (3).png"));
            heelflipMewtow[3] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (4).png"));
            heelflipMewtow[4] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (5).png"));
            heelflipMewtow[5] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (6).png"));
            heelflipMewtow[6] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (7).png"));
            heelflipMewtow[7] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (8).png"));
            heelflipMewtow[8] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (9).png"));
            heelflipMewtow[9] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (10).png"));
            heelflipMewtow[10] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (11).png"));
            heelflipMewtow[11] = ImageIO.read(new File("src/main/java/MewtowRoll/hellflip/hellflip (12).png"));

            

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public void setDefaultValues() {

        personajex = 0;

        personajey = 400;

        velocidad = 4;

        velocidadSalto = 7;

        enelSuelo = true;

        estaSaltando = false;

        alturaSalto = 125;

        saltosRealizados = 0;

        alturaActual = 0;

        direccion = "Derecha";

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

        areaSolida.setLocation(120 + personajex, 30 + personajey);
 
            contadordesprites++;

            // Menor valor para cambiar más rápido, mayor para cambiar más lento
            if (contadordesprites > 5) { 

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

                        if (spritenum > 26) {
                            // Volvemos al primer sprite de roll al llegar al último
                            spritenum = 1; 

                        }

                        break;

                    case "Salto":

                        spritenum++;
                        
                        if (spritenum > 12) {

                            // Volvemos al primer sprite de salto al llegar al último
                            spritenum = 1;   

                            direccion = "Derecha"; // Volvemos a la dirección de roll al final del salto
                        }

                        break;

                }
            }
        }
    

    public void dibujar(Graphics2D g2) {

        //Se dibujan los sprites segun las direcciones declaradas anteriormente
        BufferedImage imagen = null;

        switch (direccion) {

            case "Derecha":

                imagen = rollMewtow[spritenum - 1];

                break;

            case "Salto":

                if (spritenum - 1 < heelflipMewtow.length) {

                    imagen = heelflipMewtow[spritenum - 1];
                    
                } else {
                    
                    imagen = heelflipMewtow[0];

                }

                break;
        }

        g2.drawImage(imagen, personajex, personajey, 300, 200, null);

        // Dibujar vidas y puntaje en la pantalla
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 20));

        // Dibujar vidas en el margen superior izquierdo
        String livesText = "Vidas: " + lives;
        g2.drawString(livesText, 20, 30);

        // Dibujar puntaje en el margen superior derecho
        String scoreText = "Puntaje: " + score;
        int scoreTextWidth = g2.getFontMetrics().stringWidth(scoreText);
        g2.drawString(scoreText, juego.getWidth() - scoreTextWidth - 20, 30);
    }
}
