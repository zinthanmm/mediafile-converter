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
import it.sauronsoftware.java.*;

public class converttomkv {
    //mp4Tomkv
    public static void mp4Tomkv(File source, File output) {
        
        System.err.println("Converting Started........(MP4 To MKV)");
        
        Encoder encode = new Encoder();

        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("matroska");
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(new Integer(64000));
        audio.setChannels(new Integer(1));
        audio.setSamplingRate(new Integer(22050));
        VideoAttributes video = new VideoAttributes();
        video.setCodec("mpeg4");
        video.setBitRate(new Integer(160000));
        video.setFrameRate(new Integer(15));
        attr.setAudioAttributes(audio);
        attr.setVideoAttributes(video);

        try {
            encode.encode(source, output, attr);
            System.err.println("Converting Completed........(MP4 To MKV)");
        } catch (EncoderException e) {
            System.err.println(e.toString());
        }
    }
}
