/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainView extends JFrame {

    private final int WIDTH = 1024;
    private final int HEIGHT = 768;
    private final String TITLE = "Tony Hawk's Pro Skater";

    public void initializeMainView() {
        // Configurar la ventana
        setTitle(TITLE);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer el diseño del contenido
        setLayout(new BorderLayout());

        // Crear e instanciar el menú
        Menu menu = new Menu();

        // Agregar el menú al centro del diseño
        add(menu, BorderLayout.CENTER);

        pack();  // Ajustar el tamaño de la ventana al contenido
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
        setVisible(true);  // Hacer la ventana visible
    }
}



