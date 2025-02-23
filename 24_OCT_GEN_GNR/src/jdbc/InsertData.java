package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DBConnection.getConnection();
            String query = "INSERT INTO Salesman (first_name, last_name, salary, car_sales_per_month, car_model_sold, hire_date) VALUES ('Rohit', 'Verma', 52000.00, 11, 'Mahindra Marazzo', '2021-02-10')";
            stmt = conn.createStatement();
            int ra = stmt.executeUpdate(query);

            if (ra > 0) {
                System.out.println("Data inserted Successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing the objects: " + e.getMessage());
            }
        }
    }
}
