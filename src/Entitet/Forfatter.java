package Entitet;

public class Forfatter {
    private int idforfatter;
    private String fornavn;
    private String efternavn;

    public Forfatter(int idforfatter, String fornavn, String efternavn) {
        this.idforfatter = idforfatter;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public int getIdforfatter() {
        return idforfatter;
    }

    public void setIdforfatter(int idforfatter) {
        this.idforfatter = idforfatter;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    @Override
    public String toString() {
        return "Forfatter{" +
                "idforfatter=" + idforfatter +
                ", fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                '}';
    }
}
