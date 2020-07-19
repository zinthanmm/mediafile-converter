
package mediafileconverter;

import java.io.File;
import it.sauronsoftware.jave.*;

public class config {
    
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