package app;

import db.DB;
import db.DBException;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("update seller set BaseSalary = 2090.0 where DepartmentId = 1");

            int x = 1;

//            if (x < 2) {
//                throw new DBException("Fake Error");
//
//            }

            int rows2 = st.executeUpdate("update seller set BaseSalary = 3090.0 where DepartmentId = 2");

            conn.commit();

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);

        } catch (SQLException e){
            try {
                conn.rollback();
                throw new DBException("Transação retornada! Causado no: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DBException("Erro equanto tentava volta a transação, Causado por: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
