
package mediafileconverter;

import java.io.File;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.InputFormatException;

public class main {

    public static void main(String[] args) {
        
        File Video = new File("C:\\Users\\ZNR\\Desktop\\media\\mp4Tomp3\\test1.mp4");
        mp4Tomp3.ConvertTomp3(Video);
        
    }
    
}
