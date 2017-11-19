import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class file{
    public static void main(String[] args){
        for(int x=1;x<12;x++){
            File file = new File("/location of files/"+"file number "+x+".txt");

            PrintWriter printWriter = null;
            try{
                printWriter = new PrintWriter(file);
                printWriter.println("0010 1010");
            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }finally
            {
            	if ( printWriter != null ) {
                    printWriter.close();
                }
            }	
        }
    }
}