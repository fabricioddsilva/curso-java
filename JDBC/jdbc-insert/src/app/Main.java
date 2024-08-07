package app;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                "insert into seller"
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "values"
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, "Purple Willie");
            st.setString(2, "purple@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("24/06/1986").getTime()));
            st.setDouble(4, 35000.0);
            st.setInt(5, 4);

//            st = conn.prepareStatement("insert into department (Name) values ('D1'), ('D2')", Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                st.getGeneratedKeys();
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Pronto! Id = " + id);
                }

            } else {
                System.out.println("Nenhuma linha afetada!");
            }
        } catch (SQLException | ParseException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
