import java.io.Serializable;

public class MacSonuc implements Serializable {

    private String macSonuc;

    public MacSonuc(String macSonuc) {
        this.macSonuc = macSonuc;
    }

    public String getMacSonuc() {
        return macSonuc;
    }
    public void setTakım(String macSonuc) {
        this.macSonuc = macSonuc;
    }
}