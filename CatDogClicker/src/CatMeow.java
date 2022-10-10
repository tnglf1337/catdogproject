import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//Klasse mit Metjoden, damit man ein Audiofile abspielen kann
public class CatMeow {
    
    Clip clip;

    public void catMeow(String soundFileName){
        try{
            File file = new File(soundFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e){}
    }

    public void play(){
        clip.setFramePosition(0);
        clip.start();
    }

}
