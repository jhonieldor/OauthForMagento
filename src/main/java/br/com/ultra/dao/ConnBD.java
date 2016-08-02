package br.com.ultra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Jhoni on 02/08/2016.
 */
public class ConnBD {

    public Connection con = null;
    public Statement stm = null;

    public ConnBD() {

        try {

            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con =
                    DriverManager.getConnection(
                            "jdbc:firebirdsql:192.168.254.11/3050:C:/Ultra/Banco/GESTAO.FDB",
                            "sysdba",
                            "masterkey");
            stm = con.createStatement();

        } catch (Exception e) {
            System.out.println("Não foi possível conectar ao banco: " + e.getMessage());
        }

    }

}
