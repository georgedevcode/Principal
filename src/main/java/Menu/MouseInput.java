/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author user
 */
public class MouseInput  implements MouseListener {

    private boolean characterPaneOpened = false;
    private int MOUSE_X_COORDINATES = 0;
    private int MOUSE_Y_COORDINATES = 0;

   

    @Override
    public void mousePressed(MouseEvent event) {
        this.MOUSE_X_COORDINATES = event.getX();
        this.MOUSE_Y_COORDINATES = event.getY();

        if (!characterPaneOpened) {
            if (this.MOUSE_X_COORDINATES >= 700 && this.MOUSE_Y_COORDINATES <= 400) {
                System.out.println("Game is running");
                openCharacterPane();
                characterPaneOpened = true;
            }
        }

        if (this.MOUSE_X_COORDINATES >= 700 && this.MOUSE_Y_COORDINATES >= 500) {

            if (this.MOUSE_X_COORDINATES >= 700 && this.MOUSE_Y_COORDINATES >= 500) {
                System.exit(0); // Cierra la aplicación por completo
            }
        }
    }

    private void openCharacterPane() {
       selectCharacter menu = new selectCharacter ();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
