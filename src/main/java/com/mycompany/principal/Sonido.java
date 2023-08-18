package com.mycompany.principal;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sonido {

    Clip clip;

    File[] sonidoFiles = new File[30];

    public Sonido() {

        sonidoFiles[0] = new File("src/main/java/Sonido/armagedon.wav");

    }

    public void setFile(int i) {

        try {

            AudioInputStream ais = AudioSystem.getAudioInputStream(sonidoFiles[i]);

            clip = AudioSystem.getClip();

            clip.open(ais);

        } catch (Exception e) {

            //Necesitamos hacer la captura de la excepcion
            
        }

    }

    public void play() {

        clip.start();

    }

    public void loop() {

        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }

    public void stop() {

        clip.stop();

    }
}
