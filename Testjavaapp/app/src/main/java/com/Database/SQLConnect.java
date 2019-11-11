
package com.Database;
import java.sql.*;

 public class SQLConnect {

    private String connectionUrl;

    public SQLConnect(){
        this.connectionUrl =
                "jdbc:sqlserver://lunchbotjava.database.windows.net:1433;" +
                        "database=lunchBot;" +
                        "user=lunchBot@lunchbotjava;" +
                        "password=Mi2ZDLhN1234!;" +
                        "encrypt=true;" +
                        "trustServerCertificate=false;" +
                        "hostNameInCertificate=*.database.windows.net;" +
                        "loginTimeout=30;";
    }

    public String getURL() {
        return connectionUrl;
    }


}


