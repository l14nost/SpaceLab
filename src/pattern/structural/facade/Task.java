package pattern.structural.facade;

import java.io.FileWriter;
import java.io.IOException;

public class Task {
    String text ="new message";
    public void fileWrite(String fileName){
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(text);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
