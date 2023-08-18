/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.mycompany.principal.Juego;
import com.mycompany.principal.Teclado;

import Entidad.Jugador;
import Entidad.Jugador2;
import Entidad.Jugador3;

/**
 *
 * @author user
 */
public class selectCharacter extends JFrame {

    private Teclado teclado;
    private Juego gp;

    public selectCharacter() {

        setTitle("Tony Hawk's Pro Skater");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar gp y teclado
        gp = new Juego();
        teclado = new Teclado();

        // Crear un panel para los botones de selección de personaje
        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(new GridLayout(1, 3));
        // Cargar las imágenes de los personajes
        ImageIcon personaje1Icon = new ImageIcon("src/main/java/sprites/idle/skater boy-idle_00.png");
        ImageIcon personaje2Icon = new ImageIcon("src/main/java/idlewoman/skater-girl-idle (1).png");
        ImageIcon personaje3Icon = new ImageIcon("src/main/java/MewtowRoll/Mewtow.png");
        // Botón para seleccionar el primer jugador
        JButton selectJugador1 = new JButton("Seleccionar Jugador 1");
        selectJugador1.setIcon(new ImageIcon(personaje1Icon.getImage().getScaledInstance(1000, 1000, WIDTH)));
        selectJugador1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador1 = new Jugador(gp, teclado);
                // Resto de la lógica para el jugador 1
            }
        });

        // Botón para seleccionar el segundo jugador
        JButton selectJugador2 = new JButton("Seleccionar Jugador 2");
        selectJugador2.setIcon(new ImageIcon(personaje2Icon.getImage().getScaledInstance(1000, 1000, WIDTH)));
        selectJugador2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador2 jugador2 = new Jugador2(gp, teclado);
                // Resto de la lógica para el jugador 2
                dispose();
            }
        });
        JButton selectJugador3 = new JButton("Seleccionar Jugador 3");
        selectJugador3.setIcon(new ImageIcon(personaje3Icon.getImage().getScaledInstance(500, 500, WIDTH)));
        selectJugador3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador3 jugador3 = new Jugador3(gp, teclado);
                // Resto de la lógica para el jugador 3
                dispose();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });

        // Agregar los botones al panel
        characterPanel.add(selectJugador1);
        characterPanel.add(selectJugador2);
        characterPanel.add(selectJugador3);
        // Agregar el panel al marco
        add(characterPanel);

        setVisible(true);
    }
}

