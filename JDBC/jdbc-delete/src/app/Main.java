package app;

import db.DB;
import db.DBIntegrityException;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "delete from department "
                    + "where "
                    + "Id = ?"
            );

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Pronto! Linhas Afetadas: " + rowsAffected);

        } catch (SQLException e){
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
