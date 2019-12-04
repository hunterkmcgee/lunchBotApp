package com.Database;
import java.sql.*;

public class QuerySQL extends SQLConnect {

    // Execute a SELECT SQL statement.

    public QuerySQL(String selectSql, String type) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection(getURL());
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            //RESTAURANT(restName, rating, address, distance, categories)
            //USERID(userName, password, Fname, Lname)

            while (resultSet.next()) {
                   if(type == "UserId")
                       System.out.println( UserId(resultSet));
                   else if(type == "Fav" || type == "Rec")
                       System.out.println(FavOrRec(resultSet));

                   else
                       System.out.println("Search Query type error!");
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String UserId(ResultSet resultSet) throws SQLException
    {
        String userName = resultSet.getString(1);
        String password = resultSet.getString(2);
        String Fname = resultSet.getString(3);
        String Lname = resultSet.getString(4);
        return userName + " " + password + " " + Fname + " " + Lname;
    }

    public String FavOrRec(ResultSet resultSet) throws SQLException
    {
        String restName = resultSet.getString(1);
        String address = resultSet.getString(2);
        String rating = resultSet.getString(3);
        String distance = resultSet.getString(4);
        String categories = resultSet.getString(5);
        return restName + " " + address+ " " + rating + " " + distance + " " + categories;
    }
}