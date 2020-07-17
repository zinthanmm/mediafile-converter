
package mediafileconverter;

import java.io.File;
import it.sauronsoftware.jave.*;

public class Config {
    
    //mp4Tomp3
    public static void mp4Tomp3(File source, File output) {
        
        System.err.println("Converting Started........(MP4 To MP3)");
        
        Encoder forMp3 = new Encoder();
        EncodingAttributes specificationsForMp3 = new EncodingAttributes();
        specificationsForMp3.setFormat("mp3");
        AudioAttributes audioForMp3 = new AudioAttributes();
        audioForMp3.setVolume(256);
        audioForMp3.setCodec("mp2");
        specificationsForMp3.setAudioAttributes(audioForMp3);

        try {
            forMp3.encode(source, output, specificationsForMp3);
            System.err.println("Converting Completed........(MP4 To MP3)");
        } catch (EncoderException ex) {
            System.err.println(ex.toString());
        }
    }
    
}
