/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediafileconverter;

/**
 *
 * @author UsmanSPC
 */

import java.io.File;
import it.sauronsoftware.jave.*;

public class converttomp4 {

   //mp4Tomp3
    public static void mp4Tomp3(File source, File output) {
        
        System.err.println("Converting Started........(MP4 To MP3)");
        
        Encoder encode = new Encoder();
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("mp3");
        AudioAttributes audio = new AudioAttributes();
        audio.setVolume(256);
        audio.setCodec("mp2");
        attr.setAudioAttributes(audio);

        try {
            encode.encode(source, output, attr);
            System.err.println("Converting Completed........(MP4 To MP3)");
        } catch (EncoderException e) {
            System.err.println(e.toString());
        }
    }
    
}
