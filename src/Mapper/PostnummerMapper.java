package Mapper;

import Db.ConnectionConfiguration;
import Entitet.Bog;
import Entitet.Postnummer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostnummerMapper {
    protected static List<Postnummer> getPostnummerList(){
        List<Postnummer> postnummerList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.postnummer");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int postalcode = result.getInt("idpostnummer");
                String city = result.getString("bynavn");
                Postnummer postnummer = new Postnummer(postalcode, city);
                postnummerList.add(postnummer);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return postnummerList;
    }
}
