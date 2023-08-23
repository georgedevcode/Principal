import Entidad.Personaje;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.mycompany.principal.Puntajes;

public class Resultados extends JFrame {
    
    private JTextArea textArea;
    
    private Puntajes puntajes;
    private Personaje jugador;

    public Resultados() {
        
        puntajes = new Puntajes(jugador);

        setTitle("Resultados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JButton cargarButton = new JButton("Mostrar Puntajes");
        cargarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int[] puntajesArray = puntajes.cargarPuntajes();
                    Puntajes.quicksort(puntajesArray);

                    StringBuilder sb = new StringBuilder();
                    for (int score : puntajesArray) {
                        sb.append(score).append("\n");
                    }

                    textArea.setText(sb.toString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                    textArea.setText("Error al cargar puntajes.");
                }
            }
        });

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new JScrollPane(textArea), BorderLayout.CENTER);
        container.add(cargarButton, BorderLayout.SOUTH);
    }
    }
