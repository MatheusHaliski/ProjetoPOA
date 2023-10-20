import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

    public abstract class PersistentFile {
        protected final String fileName;

        public PersistentFile(String name) {
            this.fileName = name;
        }

        public void create() {
            try {
                File file = new File(fileName);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        public void read() {
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                String currentLine;
                while ((currentLine = bufferedReader.readLine()) != null) {
                    System.out.println(currentLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
