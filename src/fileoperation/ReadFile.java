package fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "/Users/matiur/develop/deepcoding/June2020Java/file.txt";
        try {
            fr = new FileReader(path);
        }catch (Exception ex){
            System.out.println("File was not locate able, seems like it is a wrong path");
        }
        try {
            br = new BufferedReader(fr);

            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        }catch(Exception ex){
            //System.out.println("File was locate able but unable to read ");
        }
        finally{
            if (br != null) {
                try {
                    br.close();
                }catch (Exception ex){
                    System.out.println("Unable to close buffered reader instance");
                }
            }
            if(fr !=null){
                try {
                    fr.close();
                }catch (Exception ex){
                    System.out.println("Unable to close file reader instance");
                }
            }
        }
    }
}
