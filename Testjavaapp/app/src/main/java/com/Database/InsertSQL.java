package com.Database;
import java.sql.*;

public class InsertSQL extends SQLConnect
{


    public InsertSQL(String insertSql) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection(getURL());
            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql,
                    Statement.RETURN_GENERATED_KEYS);

            prepsInsertProduct.execute();

            // Retrieve the generated key from the insert.
            ResultSet resultSet = prepsInsertProduct.getGeneratedKeys();

            // Print the ID of the inserted row.
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1));
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }


    }

}


