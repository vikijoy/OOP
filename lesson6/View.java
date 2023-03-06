package lesson6;
import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();

    }

    public void print( String toWrite) {
        System.out.println(toWrite);
        SaveLog.write (toWrite);

    }

    public void printC( String toWrite) {
        System.out.println(toWrite);
        SaveLog.write (toWrite);
    }
}