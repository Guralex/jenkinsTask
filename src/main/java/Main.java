import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;


public class Main {
    
    public static final String URL = "https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt";

    public static void main(String[] args) throws MalformedURLException, IOException {
        //
        File destination = new File(System.getProperty("user.dir")+"\\result.txt");
        System.out.println("Downloading file...");
        FileUtils.copyURLToFile(new URL(URL), destination);      
        System.out.println("File is successfully recieved!");
    }

}
