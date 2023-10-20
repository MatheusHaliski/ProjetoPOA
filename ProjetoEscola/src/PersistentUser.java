import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
public class PersistentUser extends PersistentFile{
    public PersistentUser(String name) {
        super(name);
    }

    public void add(String name, String email, int idade) {
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            printWriter.println(name);
            printWriter.println(email);
            printWriter.println(idade);

        } catch (IOException e) {
            System.out.println("ERROERROERRO!!!!");
            e.printStackTrace();
        }
    }
}
