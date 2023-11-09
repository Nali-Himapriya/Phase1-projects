import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveProductDetails {

    public static void main(String[] args) {
        // JDBC connection parameters
        String jdbcURL = "jdbc:mysql://localhost:3306/db3"; // Replace with your database URL
        String username = "root";
        String password = "Himapriya@14";

        int productId = 1; // Replace with the product ID you want to retrieve

        // SQL query to retrieve product details
        String query = "SELECT * FROM products WHERE productId= ?";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, productId); // Set the product ID parameter

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Retrieve product details from the result set
                int productID = resultSet.getInt("productId");
                String productName = resultSet.getString("productname");
                double productPrice = resultSet.getDouble("productcost");

                // Display product details
                System.out.println("Product ID: " + productID);
                System.out.println("Product Name: " + productName);
                System.out.println("Product Price: " + productPrice);
            } else {
                System.out.println("Product not found with ID: " + productId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}