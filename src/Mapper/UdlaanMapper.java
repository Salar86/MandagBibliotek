package Mapper;

import Db.ConnectionConfiguration;
import Entitet.Bog;
import Entitet.Udlaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UdlaanMapper {
    protected static List<Udlaan> getUdlaanList(){
        List<Udlaan> udlaansList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotekonsdag.udlaan");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idborrow = result.getInt("idudlaan");
                int idbook = result.getInt("idbogtabel");
                int iduser = result.getInt("idlaaner");
                Udlaan udlaan = new Udlaan(idborrow,idbook,iduser);
                udlaansList.add(udlaan);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return udlaansList;
    }
}
