package com.mycompany.principal;

import java.io.Serializable;

import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Puntajes implements Serializable {

    private int puntosGanados = 0;

    private int puntosPerdidos = 0;

    private int datosActuales = 0;

    public Puntajes(Juego juego) {

        this.puntosGanados = juego.puntosGanadosPorPartida;

        this.puntosPerdidos = juego.puntosPerdidosPorPartida;

    }
    
    // public void cargarPuntajes(){

    //     try {

    //         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("puntos.txt"));

    //         this.datosActuales = (Map<String, >) ois.readObject();

    //     } catch (IOException | ClassNotFoundException e) { 
    //         // TODO: handle exception
    //     }

    // }

    public void guardarPuntajes(){

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Puntajes.txt"))) {

            oos.writeObject(this.puntosGanados);

            oos.writeObject(this.puntosPerdidos);

            System.out.println("Información guardada en el archivo");

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);

            e.printStackTrace();
        }

    }

    public void quickSortPuntajes(){}

}

