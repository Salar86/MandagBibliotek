package Entitet;

public class Udlaan {
    private int idudlaan;
    private int idbogtabel;
    private int idlaaner;

    public Udlaan(int idudlaan, int idbogtabel, int idlaaner) {
        this.idudlaan = idudlaan;
        this.idbogtabel = idbogtabel;
        this.idlaaner = idlaaner;
    }

    public int getIdudlaan() {
        return idudlaan;
    }

    public void setIdudlaan(int idudlaan) {
        this.idudlaan = idudlaan;
    }

    public int getIdbogtabel() {
        return idbogtabel;
    }

    public void setIdbogtabel(int idbogtabel) {
        this.idbogtabel = idbogtabel;
    }

    public int getIdlaaner() {
        return idlaaner;
    }

    public void setIdlaaner(int idlaaner) {
        this.idlaaner = idlaaner;
    }

    @Override
    public String toString() {
        return "Udlaan{" +
                "idudlaan=" + idudlaan +
                ", idbogtabel=" + idbogtabel +
                ", idlaaner=" + idlaaner +
                '}';
    }
}
