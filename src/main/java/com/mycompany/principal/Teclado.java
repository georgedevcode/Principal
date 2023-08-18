package com.mycompany.principal;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener {

    public boolean leftPressed, rigthPressed, spacePressed, enterPressed,escPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A) {

            leftPressed = true;

        }
        if (code == KeyEvent.VK_D) {

            rigthPressed = true;

        }
        if (code == KeyEvent.VK_SPACE) {

            spacePressed = true;

        }
         if (code == KeyEvent.VK_ENTER) {

            enterPressed = true;

        }
        if (code == KeyEvent.VK_ESCAPE) {

           escPressed = true;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A) {

            leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {

            rigthPressed = false;

        }
        if (code == KeyEvent.VK_SPACE) {

            spacePressed = false;

        }
        if (code == KeyEvent.VK_ENTER) {

            enterPressed = false;

        }
         if (code == KeyEvent.VK_ESCAPE) {
            
            escPressed = false;

        }
    }

}
