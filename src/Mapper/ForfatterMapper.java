package Mapper;

import Db.ConnectionConfiguration;
import Entitet.Bog;
import Entitet.Forfatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ForfatterMapper {
    protected static List<Forfatter> getForfatterList(){
        List<Forfatter> forfatterList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.forfatter");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idforfatter");
                String firstName = result.getString("Fornavn");
                String lastName = result.getString("Efternavn");
                Forfatter forfatter = new Forfatter(id, firstName,lastName);
                forfatterList.add(forfatter);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return forfatterList;
    }
}
