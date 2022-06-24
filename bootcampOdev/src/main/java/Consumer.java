import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Consumer implements Serializable {

    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("score.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);

            MacSonuc MacSonuc = (MacSonuc) inputStream.readObject();

            System.out.println(MacSonuc.getMacSonuc());
            inputFile.close();
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}