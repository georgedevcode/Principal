package com.mycompany.principal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import Entidad.Personaje; 


public class Puntajes {


    private int puntos[];

    public Puntajes(Personaje jugador) {

    }

    public void cargarPuntajes() throws IOException{

        String filePath = "Puntajes.txt"; // Specify the path to your text file

        try {
            
            puntos = readNumbersFromFile(filePath);

            for (int num : puntos) {

                System.out.println(num);

            }
        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void guardarPuntajes(int score) throws IOException{

        FileWriter fw = new FileWriter("Puntajes.txt", true);
        
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        // Convert puntosGanados to a String and then write it
        String puntosStr = Integer.toString(score);
        bufferedWriter.write(puntosStr);

        // Add a newline character to separate values (if needed)
        bufferedWriter.newLine();

        bufferedWriter.close();

    }

    public static int[] readNumbersFromFile(String filePath) throws IOException {

        FileReader fileReader = new FileReader(filePath);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read the file line by line
        String line;

        StringBuilder content = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {

            content.append(line).append("\n");

        }

        // Close the readers
        bufferedReader.close();

        fileReader.close();

        // Split the content into an array of strings using a delimiter (e.g., space)
        String[] numberStrings = content.toString().split("\\s+");

        // Convert the string array into an integer array
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {

            numbers[i] = Integer.parseInt(numberStrings[i]);
            
        }

        return numbers;
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


