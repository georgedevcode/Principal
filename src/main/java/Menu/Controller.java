/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author user
 */
public class Controller extends MainView {

    // La variable GameRunning es estática ya que necesitamos que solo esté adjunta a la clase Controller,
    // ya que esta variable va a controlar el estado del juego
    public static boolean GameRunning = false;

    // Función que ejecuta el juego
    public void ExecuteGame() {
        // El llamado de InitializeMainView se hereda de la clase MainView
        // Esta función hace la construcción del JFrame principal donde el juego va a correr
        initializeMainView();
    }

    // MoveToCharacterPane, una vez que el usuario decidió iniciar el juego vamos a cambiar a la pantalla (JPanel)
    // donde el usuario va a poder elegir el personaje que desea usar
    public void moveToCharacterPane() {
        System.out.println("Choose character");
    }

    // ExecuteMainGameLoop: Una vez que el usuario eligió el personaje y decidió continuar, el loop principal del juego comienza (empieza el juego)
    public void executeMainGameLoop() {
        GameRunning = true;
    }

    // Se detiene el juego, DETIENE el loop principal
    public void stopGame() {
        System.out.println("Stop Game");
        GameRunning = false;
    }
  }