import Db.ConnectionConfiguration;
import Entitet.*;
import Mapper.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getString("hvad hedder du?"));
        //System.out.println(getInt("Angiv venligst din skostørrelse"));
        /*while (true) {
            switch (getString("angiv dit ønske")) {
                case "lån bog":
                    System.out.println("du ønsker at låne en bog");
                    break;
                //case "stop":
                  //  break;
            }
            if(getString("q for quit").equalsIgnoreCase("q")) {
                break;
            }
        }*/
        //ConnectionConfiguration.getConnection();
        List<Udlaan> udlaansList = Facade.hentUdlaan();
        for (Udlaan udlaan : udlaansList) {
            System.out.println(udlaan.toString());
        }

    }

}
