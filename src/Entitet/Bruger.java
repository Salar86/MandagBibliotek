package Entitet;

public class Bruger {
    private int idLaaner;
    private String navn;
    private String adresse;
    private int postnummer;

    public Bruger(int idLaaner, String navn, String adresse, int postnummer) {
        this.idLaaner = idLaaner;
        this.navn = navn;
        this.adresse = adresse;
        this.postnummer = postnummer;
    }

    public int getIdLaaner() {
        return idLaaner;
    }

    public void setIdLaaner(int idLaaner) {
        this.idLaaner = idLaaner;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "idLaaner=" + idLaaner +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnummer=" + postnummer +
                '}';
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }
}
