
package mediafileconverter;

import java.io.File;

public class main {

    public static void main(String[] args) {
        
//        File Video = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media\\mp4Tomp3\\test1.mp4");
//        mp4Tomp3.ConvertTomp3(Video);


    //mp4Tomp3
    File[] files = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media\\mp4Tomp3").listFiles();

    File path = new File("C:\\Users\\ZNR\\Desktop\\MediaConverter\\media-converted\\mp4Tomp3-converted");

      for (File file : files) {
        String[] nameFile = file.getAbsolutePath().split("\\\\");
        String[] removeExtension = nameFile[nameFile.length - 1].split("\\.");

        File target = new File(path.getAbsolutePath() + "\\" + removeExtension[0] + ".mp3");

        Config.mp4Tomp3(file, target);

        file.deleteOnExit();
      }
        
    }
    
}
