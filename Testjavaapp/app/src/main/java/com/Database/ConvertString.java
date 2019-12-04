package com.Database;

//ConvertString class will convert the attributes into an INSERT/SELECT command for MSSQL
public class ConvertString {

    public String InsertUserId(String userName, String password, String Fname, String Lname)
    {
        //each string must be converted from double quote to single quote for insert/query
        // of database. Example: SqlInsertUserId = 'zmk2b', 'abc123','Zach','Kelvas'

        String SqlInsertUserID = "'" + userName + "', " + "'" + password + "'," + "'" + Fname
                + "'," + "'" + Lname + "'";

        //append string to make INSERT command
        //Example: INSERT INTO USERID(userName, password, Fname, Lname)
        // VALUES ('zmk2b', 'abc123','Zach','Kelvas');

        SqlInsertUserID = "INSERT INTO USERID(userName, password, Fname, Lname)" +
                " VALUES (" + SqlInsertUserID +");";

        return SqlInsertUserID;
    }

    public String InsertFav(String userName, String restName, String address, double rating,
                      double distance, String categories)
    {
        //each string must be converted from double quote to single quote for insert/query
        // of database. Example: Fav = 'zmk2b', 'Papa Johns','123 street drive', 4.5, 50, 'Pizza'

        String SqlInsertFav = "'" + userName + "', " + "'" + restName + "'," + "'" + address
                + "'," + rating + ", " + distance + ", " + "'" + categories + "'";

        //append string to make INSERT command
        //Example: INSERT INTO FAVORITE(userName, restName, address, rating, distance, categories)
        //          VALUES ('zmk2b', 'Dominoes', '123 street drive', 4.5, 50.0, 'Pizza');

        SqlInsertFav = "INSERT INTO Favorite(userName, restName, address, rating," +
                " distance, categories)" + " VALUES (" + SqlInsertFav +");";

        return SqlInsertFav;
    }

    public String InsertRec(String userName, String restName, String address, double rating,
                      double distance, String categories)
    {

        String SqlInsertRec = "'" + userName + "', " + "'" + restName + "'," + "'" + address
                + "'," + rating + ", " + distance + ", " + "'" + categories + "'";

        SqlInsertRec = "INSERT INTO RECENT(userName, restName, address, rating," +
                " distance, categories)" + " VALUES (" + SqlInsertRec +");";

        return SqlInsertRec;
    }

    public String SearchUserId(String userName)
    {
        userName = "'" + userName + "'";
        String selectSQL = "SELECT * FROM USERID WHERE userName = " + userName + ";";

        return selectSQL;
    }

    public String SearchFav(String userName)
    {
        userName = "'" + userName + "'";
        String selectSQL = "SELECT DISTINCT restName, address, rating, distance, categories" +
                " FROM FAVORITE WHERE userName =" + userName + ";";

        return selectSQL;
    }

    public String SearchRec(String userName)
    {
        userName = "'" + userName + "'";
        String selectSQL = "SELECT DISTINCT restName, address, rating, distance, categories" +
                " FROM RECENT WHERE userName =" + userName + ";";

        return selectSQL;
    }
}
