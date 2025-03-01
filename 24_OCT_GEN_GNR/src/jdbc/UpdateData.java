package jdbc;

import java.sql.*;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salesman ID to update: ");
        int salesmanId = sc.nextInt();
        sc.nextLine();

        String query = "SELECT * FROM salesman WHERE salesman_id = ?";
        try {
            conn = DBConnection.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, salesmanId);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                double salary = rs.getDouble("salary");
                int carSales = rs.getInt("car_sales_per_month");
                String carModel = rs.getString("car_model_sold");
                Date hireDate = rs.getDate("hire_date");

                // User Input
                System.out.print("Enter new First Name (- to keep the same): ");
                String newFirstName = sc.nextLine();
                if (!newFirstName.equals("-")) firstName = newFirstName;

                System.out.print("Enter new Last Name (- to keep the same): ");
                String newLastName = sc.nextLine();
                if (!newLastName.equals("-")) lastName = newLastName;

                System.out.print("Enter new Salary (- to keep the same): ");
                String newSalary = sc.nextLine();
                if (!newSalary.equals("-")) salary = Double.parseDouble(newSalary);

                System.out.print("Enter new Car Sales per Month (- to keep the same): ");
                String newCarSales = sc.nextLine();
                if (!newCarSales.equals("-")) carSales = Integer.parseInt(newCarSales);

                System.out.print("Enter new Car Model Sold (- to keep the same): ");
                String newCarModel = sc.nextLine();
                if (!newCarModel.equals("-")) carModel = newCarModel;

                System.out.print("Enter new Hire Date (YYYY-MM-DD) (- to keep the same): ");
                String newHireDate = sc.nextLine();
                if (!newHireDate.equals("-")) hireDate = Date.valueOf(newHireDate);

                String updateQuery = "UPDATE Salesman SET first_name = ?, last_name = ?, salary = ?, " +
                        "car_sales_per_month = ?, car_model_sold = ?, hire_date = ? WHERE salesman_id = ?";

                pstmt = conn.prepareStatement(updateQuery);
                pstmt.setString(1, firstName);
                pstmt.setString(2, lastName);
                pstmt.setDouble(3, salary);
                pstmt.setInt(4, carSales);
                pstmt.setString(5, carModel);
                pstmt.setDate(6, hireDate);
                pstmt.setInt(7, salesmanId);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Salesman details updated successfully.");
                } else {
                    System.out.println("No changes made.");
                }
            } else {
                System.out.println("Salesman ID not found!");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                sc.close();
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing the objects: " + e.getMessage());
            }
        }
    }
}
