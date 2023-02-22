package Entitet;

public class Postnummer {
    private int idpostnummer;
    private String byNavn;

    public Postnummer(int idpostnummer, String byNavn) {
        this.idpostnummer = idpostnummer;
        this.byNavn = byNavn;
    }

    public int getIdpostnummer() {
        return idpostnummer;
    }

    public void setIdpostnummer(int idpostnummer) {
        this.idpostnummer = idpostnummer;
    }

    public String getByNavn() {
        return byNavn;
    }

    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }

    @Override
    public String toString() {
        return "Postnummer{" +
                "idpostnummer=" + idpostnummer +
                ", byNavn='" + byNavn + '\'' +
                '}';
    }
}
