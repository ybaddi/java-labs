package Services;

import models.Adherant;

import java.sql.*;

public class AderantService {
    public void listAderants() {
        Connection cnx = configuration.MyConnection.getConnection();
        try {
            Statement stm = cnx.createStatement();
            String query = "select * from adherants";
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                Date dateNaissence = rs.getDate("dateNaissence");
                Adherant ad = new Adherant(id,nom,prenom,dateNaissence);
                System.out.println(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
