package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListAllData {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            String query = "SELECT * FROM salesman";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

            System.out.println("Salesman_ID\tfirst_name\tlast_name\tsalary\tcar_sales_per_month\tcar_model_sold\tcommission\thire_date");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("salesman_id") + "\t" +
                                rs.getString(2) + "\t" +
                                rs.getString("last_name") + "\t" +
                                rs.getDouble("salary") + "\t" +
                                rs.getInt("car_sales_per_month") + "\t" +
                                rs.getString("car_model_sold") + "\t" +
                                rs.getFloat("commission") + "\t" +
                                rs.getDate("hire_date") + "\t"
                );
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing the objects: " + e.getMessage());
            }
        }
    }
}
