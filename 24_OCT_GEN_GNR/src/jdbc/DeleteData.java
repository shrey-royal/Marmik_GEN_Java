package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salesman ID to delete: ");
        int salesmanId = sc.nextInt();

        try {
            conn = DBConnection.getConnection();
            String query = "DELETE FROM salesman WHERE salesman_id = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, salesmanId);
            int ra = pstmt.executeUpdate();

            if (ra > 0) {
                System.out.println("Data deleted Successfully!");
            } else {
                System.out.println("Failed to delete data.");
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
