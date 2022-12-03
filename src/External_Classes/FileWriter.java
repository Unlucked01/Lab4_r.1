package External_Classes;

import java.io.File;
import java.io.IOException;

public class FileWriter {
    public static void Write(String res){
        try {
            File file = new File("data.txt");
            file.createNewFile();
            java.io.FileWriter writer = new java.io.FileWriter(file);
            writer.write(res + "\n");
            writer.flush();
            writer.close();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
