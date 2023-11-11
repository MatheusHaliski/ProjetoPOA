import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PersistentUser userFile = new PersistentUser("files/users.txt");

//        userFile.add("Marina", "lara.marina@pucpr.br", 31);
        userFile.add("Cris", "cris.lara@gmail.com", 51);
        userFile.read();
    }
}