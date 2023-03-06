package lesson6;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SaveLog {
    public static void write(String log){

        try( FileWriter fw = new FileWriter(Config.pathLog, true)){
            fw.write(log+ " " + new Date() +"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}