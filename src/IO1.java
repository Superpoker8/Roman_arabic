import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.net.URL;

public class IO1  {
        public static void main(String[]args)throws IOException{
            InputStream inFile = new FileInputStream("C:/Users/admin/Desktop/tryit.txt") ;
            InputStream inGoog = new URL("http://google.com").openStream();

            readByVyte(inFile);
            readByVyte(inGoog);

        }

        public static void readByVyte (InputStream i) throws IOException {
            while(true){
                int oneByte = i.read();
                if(oneByte!=-1){
                    System.out.print((char)oneByte);
                }else{
                    System.out.println("\n" + "end");
                            break;
                }
            }
        }
}
