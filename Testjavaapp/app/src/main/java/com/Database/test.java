package com.Database;
import java.sql.*;

//This program is a test to show how the InsertSQL, QuerySQL and ConvertString classes work.

public class test{
    public static void main(String[] args) throws SQLException{
        //each attribute for USERID Table
        String userName = "zmk2b";
        String password = "abc123";
        String Fname = "Zach";
        String Lname = "Kelvas";
        //each attribute for FAVORITE or RECENT Table
        //userName already declared for USERID Table
        String restName = "Dominoes";
        String address =  "123 street drive";
        double rating = 4.5;
        double distance = 50.0;
        String categories = "Pizza";

        //create new converstring object
        ConvertString convertString = new ConvertString();

        //Create INSERT statement for USERID, INSERT and REC
        String SqlInsertUserID = convertString.InsertUserId(userName, password, Fname, Lname);

        String SqlInsertFav = convertString.InsertFav(userName, restName,address,rating,
                                distance, categories);

        String SqlInsertRec = convertString.InsertRec(userName, restName,address,rating,
                                distance, categories);

        //Note for inserting userId into database, there cannot be duplicates!
        // There will be an error message

        //Insert into database
        //InsertSQL testInsertSQl1 = new InsertSQL(SqlInsertUserID);
        InsertSQL testInsertSQl2 = new InsertSQL(SqlInsertFav);
        InsertSQL testInsertSQl3 = new InsertSQL(SqlInsertRec);


        //Create SELECT statement for USERID, FAV and REC
        String SqlQuery1 = convertString.SearchUserId(userName);
        String SqlQuery2 = convertString.SearchFav(userName);
        String SqlQuery3 = convertString.SearchRec(userName);

        //Return string of SELECT results
        System.out.println(SqlQuery1);
        QuerySQL testQuerySQL1 = new QuerySQL(SqlQuery1, "UserId");

        System.out.println(SqlQuery2);
        QuerySQL testQuerySQL2 = new QuerySQL(SqlQuery2, "Fav");

        System.out.println(SqlQuery3);
        QuerySQL testQuerySQL3 = new QuerySQL(SqlQuery3, "Rec");
    }


}
