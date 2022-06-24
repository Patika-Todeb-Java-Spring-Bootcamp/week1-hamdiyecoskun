import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
public class Procuder implements Serializable {
    public static void main(String[] args) {
        System.out.println("Maç Sonucunu giriniz");
        Scanner myObj = new Scanner(System.in);
        String macSonuc = myObj.nextLine();
        try {
            MacSonuc macSonucu = new MacSonuc(macSonuc);
            FileOutputStream file = new FileOutputStream("score.txt");
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(macSonucu);
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
