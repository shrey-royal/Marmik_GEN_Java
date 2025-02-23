package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUserData {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            conn = DBConnection.getConnection();

            // Taking User input
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter Car Sales per Month: ");
            int carSalesPerMonth = sc.nextInt();
            sc.nextLine(); // consume the newline character

            System.out.print("Enter Car Model Sold: ");
            String carModelSold = sc.nextLine();

            System.out.print("Enter Hire Date (YYYY-MM-DD): ");
            String hireDateString = sc.nextLine();
            Date hireDate = Date.valueOf(hireDateString);

            String query = "INSERT INTO Salesman (first_name, last_name, salary, car_sales_per_month, car_model_sold, hire_date) VALUES (?, ?, ?, ?, ?, ?)";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setDouble(3, salary);
            pstmt.setInt(4, carSalesPerMonth);
            pstmt.setString(5, carModelSold);
            pstmt.setDate(6, hireDate);

            int ra = pstmt.executeUpdate();
            if (ra > 0) {
                System.out.println("Data inserted Successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                sc.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing the objects: " + e.getMessage());
            }
        }
    }
}
