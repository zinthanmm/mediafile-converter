
package mediafileconverter;

import java.io.File;
import it.sauronsoftware.jave.*;


public class mp4Tomp3 {
    
    public static void ConvertTomp3(File mp4){
        
        System.err.println("Converting Started........");
    
        File mp3 = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media-converted\\mp4Tomp3-converted\\test.mp3");
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(128000));
        audio.setChannels(new Integer(2));
        audio.setSamplingRate(new Integer(44100));
        
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("mp3");
        attr.setAudioAttributes(audio);
        
        Encoder encode = new Encoder();
        
        try {
            encode.encode(mp4, mp3, attr);
            System.err.println("Converting Completed........");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
}
