/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author user
 */
public class Menu extends JPanel implements KeyListener{

    private int width = 0;
    private int height = 0;
    private Image BackGroundImage;
    private String enterText = "Enter";
    private String escText = "Esc";
    private Timer textTimer;
    private boolean characterWindowOpened = false;
    //La funcion constructura del la clase Menu carga la imagen de fondo.
    //Addicionalmente setea el WIDTH y HEIGH en base a la imagen de fondo
    public Menu() {
        
        LoadBackGroundImage();

        this.width = this.BackGroundImage.getWidth(this);

        this.height = this.BackGroundImage.getHeight(this);

        setPreferredSize(new Dimension(this.width, this.height));
        addKeyListener(this);
        setFocusable(true);

        textTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (enterText.equals("Enter")) {
                    enterText = "Start";
                } else {
                    enterText = "Enter";
                }

                if (escText.equals("Esc")) {
                    escText = "Quit";
                } else {
                    escText = "Esc";
                }

                repaint();
            }
        });
        textTimer.start();
    }
    

    //Cargamos la imagen de fondo
    public void LoadBackGroundImage() {

        ImageIcon Image = new ImageIcon("src/main/java/Menu/Imagen/menu.jpeg");

        this.BackGroundImage = Image.getImage();

    }

    //Dibujamos la imagen de fondo y las opciones de menu
    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(this.BackGroundImage, 0, 0, null);

        SetMenuButtons(g);

    }

    //SetMenuButtons: Dibuja las opciones de menu,
    //adicionalmente agregamos el MouseListener para poder hacer captura de la eleccion del usuario
    public void SetMenuButtons(Graphics g) {

        Font font = new Font("arial", Font.BOLD, 50);

        g.setFont(font);

        g.setColor(Color.WHITE);

        g.drawString("Tony Hawk's Pro Skater", 500, 200);
        g.drawString(enterText, 700, 300);
        g.drawString(escText, 700, 500);


    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER && !characterWindowOpened) {
            openCharacterPane();
            
            characterWindowOpened = true; // Establecer la variable a true para evitar abrir más ventanas
        } else if (keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0); // Cierra la aplicación
        }
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    private void openCharacterPane() {
       selectCharacter seleccion = new selectCharacter ();
    }


}
