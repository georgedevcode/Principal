/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Menu.MouseInput;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Menu extends JPanel {

    private int width = 0;
    private int height = 0;
    private Image BackGroundImage;

    //La funcion constructura del la clase Menu carga la imagen de fondo.
    //Addicionalmente setea el WIDTH y HEIGH en base a la imagen de fondo
    public Menu() {
        
        LoadBackGroundImage();

        this.width = this.BackGroundImage.getWidth(this);

        this.height = this.BackGroundImage.getHeight(this);

        setPreferredSize(new Dimension(this.width, this.height));

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

        g.drawString("Start", 700, 300);

        g.drawString("Quit", 700, 500);

        this.addMouseListener(new MouseInput());

        System.out.println("Prueba");
    }

}
