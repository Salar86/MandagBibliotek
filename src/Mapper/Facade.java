package Mapper;

import Entitet.*;

import java.util.List;

public class Facade {
    public static List<Bruger> hentBruger() {
        return BrugerMapper.getBrugerList();
    }
    public static List<Bog> hentBog() {
        return BogMapper.getBogList();
    }
    public static List<Forfatter> hentForfatter() {
        return ForfatterMapper.getForfatterList();
    }
    public static List<Postnummer> hentPostnummer() {
        return PostnummerMapper.getPostnummerList();
    }
    public static List<Udlaan> hentUdlaan() {
        return UdlaanMapper.getUdlaanList();
    }
}
