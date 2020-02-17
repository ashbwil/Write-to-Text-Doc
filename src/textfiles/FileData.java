package textfiles;
import java.io.IOException;

public class FileData {

    public static void main(String[] args)throws IOException{
        String file_name = "C:/JavaProjects/test.txt";

        try{
            ReadFile file = new ReadFile(file_name);
            String[] Lines = file.OpenFile();

            int i;
            for (i= 0; i< Lines.length; i++){
                System.out.println(Lines[i]);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        WriteFile data = new WriteFile(file_name, true);
        data.writeToFile("This is another line.");
        System.out.println("Text file written to");

    }

}
