package com.decroly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConect {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String SCHEMA = "bbdd_prom";
    private static final String USUARIO = "developer";
    private static final String CLAVE = "developer";

    public static Connection getConnection() {
        Connection connection = null;

            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL+SCHEMA, USUARIO, CLAVE);

                System.out.println("Conexión exitosa");
                // connection.setAutoCommit(false);
                } catch (ClassNotFoundException e) {
                    System.out.println("Error al cargar el driver: " + e.getMessage());
                    } catch (SQLException e) {
                        System.out.println("Error al conectar a la base de datos: " + e.getMessage());
                        }

        return connection;
        }



    }

    


