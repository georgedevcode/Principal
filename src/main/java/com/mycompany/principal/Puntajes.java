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

    public Puntajes(Juego juego) {

        this.puntosGanados = juego.puntosGanadosPorPartida;

    }
    
     public void cargarPuntajes(){

         try {

           ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Puntajes.txt"));

            this.puntosGanados =  readObject();

       } catch (IOException | ClassNotFoundException e) { 
            
     }

 }

    public void guardarPuntajes(){

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Puntajes.txt"))) {

            oos.writeObject(this.puntosGanados);
        
            System.out.println("Información guardada en el archivo");

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);

            e.printStackTrace();
        }

    }

   public static void quicksort(int a[]) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quicksort(a, primero, j);
        }
        if (i < ultimo) {
            quicksort(a, i, ultimo);
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}


