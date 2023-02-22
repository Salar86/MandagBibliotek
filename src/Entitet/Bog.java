package Entitet;

public class Bog {
    private int idbogtabel;
    private String titel;
    private int idforfatter;

    public Bog(int idbogtabel, String titel, int idforfatter) {
        this.idbogtabel = idbogtabel;
        this.titel = titel;
        this.idforfatter = idforfatter;
    }

    public int getIdbogtabel() {
        return idbogtabel;
    }

    public void setIdbogtabel(int idbogtabel) {
        this.idbogtabel = idbogtabel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getIdforfatter() {
        return idforfatter;
    }

    public void setIdforfatter(int idforfatter) {
        this.idforfatter = idforfatter;
    }
    @Override
    public String toString() {
        return "Bog{" +
                "idbogtabel=" + idbogtabel +
                ", titel='" + titel + '\'' +
                ", idforfatter=" + idforfatter +
                '}';
    }
}
