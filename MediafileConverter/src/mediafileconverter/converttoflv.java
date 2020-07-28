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
import it.sauronsoftware.*;

public class converttoflv {

     //mp4Toflv
    public static void mp4Toflv(File source, File output) {
        
        System.err.println("Converting Started........(MP4 To FLV)");
        
        Encoder encode = new Encoder();

        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("flv");
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(64000));
        audio.setChannels(new Integer(1));
        audio.setSamplingRate(new Integer(22050));
        VideoAttributes video = new VideoAttributes();
        video.setCodec("flv");
        video.setBitRate(new Integer(160000));
        video.setFrameRate(new Integer(15));
        attr.setAudioAttributes(audio);
        attr.setVideoAttributes(video);

        try {
            encode.encode(source, output, attr);
            System.err.println("Converting Completed........(MP4 To FLV)");
        } catch (EncoderException e) {
            System.err.println(e.toString());
        }
    }
    
    
}
