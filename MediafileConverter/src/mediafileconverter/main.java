
package mediafileconverter;

import java.io.File;

public class main {

    public static void main(String[] args) {
        
//        File Video = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media\\mp4Tomp3\\test1.mp4");
//        mp4Tomp3.ConvertTomp3(Video);

        mp4Tomp3();
        mp4Toflv();
        mp4Tomkv();
    
        
    }
    
    
    //mp4Tomp3
    public static void mp4Tomp3(){
        
        File[] files = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media\\mp4Tomp3").listFiles();
        File path = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media-converted\\mp4Tomp3-converted");

        for (File file : files) {
            String[] nameFile = file.getAbsolutePath().split("\\\\");
            String[] removeExtension = nameFile[nameFile.length - 1].split("\\.");

            File target = new File(path.getAbsolutePath() + "\\" + removeExtension[0] + ".mp3");

            converttomp4.mp4Tomp3(file, target);

            file.deleteOnExit();
            
      }
    }
    
    //mp4TOflv
    public static void mp4Toflv(){
        
        File[] files = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media\\mp4Toflv").listFiles();
        File path = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media-converted\\mp4Toflv-converted");

        for (File file : files) {
            String[] nameFile = file.getAbsolutePath().split("\\\\");
            String[] removeExtension = nameFile[nameFile.length - 1].split("\\.");

            File target = new File(path.getAbsolutePath() + "\\" + removeExtension[0] + ".flv");

            converttoflv.mp4Toflv(file, target);

            file.deleteOnExit();
            
      }
    }
    
    //mp4TOmkv
    public static void mp4Tomkv(){
        
        File[] files = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media\\mp4Tomkv").listFiles();
        File path = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media-converted\\mp4Tomkv-converted");

        for (File file : files) {
            String[] nameFile = file.getAbsolutePath().split("\\\\");
            String[] removeExtension = nameFile[nameFile.length - 1].split("\\.");

            File target = new File(path.getAbsolutePath() + "\\" + removeExtension[0] + ".mkv");

            converttomkv.mp4Tomkv(file, target);

            file.deleteOnExit();
            
      }
    }
}
