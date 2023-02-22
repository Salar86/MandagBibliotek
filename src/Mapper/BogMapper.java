package Mapper;

import Db.ConnectionConfiguration;
import Entitet.Bog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BogMapper {
    protected static List<Bog> getBogList(){
        List<Bog> bogList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.bogtabel");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idbogtabel");
                String title = result.getString("titel");
                int idforfatter = result.getInt("idforfatter");
                Bog bog = new Bog(id, title, idforfatter);
                bogList.add(bog);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return bogList;
    }
}
