package Mapper;

import Db.ConnectionConfiguration;
import Entitet.Bruger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BrugerMapper {
    protected static List<Bruger> getBrugerList(){
        List<Bruger> brugerList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.laaner");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idlaaner");
                String name = result.getString("navn");
                String address = result.getString("adresse");
                int postnr = result.getInt("postnummer");
                Bruger bruger = new Bruger(id, name, address, postnr);
                brugerList.add(bruger);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return brugerList;
    }
}
