import java.util.Scanner;

public class MacSonucThread extends Thread {

    private String macSonuc;

    public MacSonucThread(String macSonuc) {
        this.macSonuc = macSonuc;
    }
        public static void main(String[] args) {
            System.out.println("Maç sonucunu giriniz");
            Scanner myObj = new Scanner(System.in);
            String macSonuc = myObj.nextLine();
            MacSonucThread thread = new MacSonucThread(macSonuc);
            thread.start();
        }
        public void run() {
            System.out.println(macSonuc);
        }
    }

