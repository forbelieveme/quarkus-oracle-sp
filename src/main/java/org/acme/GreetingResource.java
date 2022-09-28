package org.acme;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.agroal.api.AgroalDataSource;

@Path("/hello")
public class GreetingResource {

    @Inject
    AgroalDataSource dataSource;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws SQLException {
        try {

            Connection connection = dataSource.getConnection();

            java.sql.ResultSet resultSet = connection.createStatement().executeQuery("select * from test");

            // System.out.println(resultSet);
            while (resultSet.next()) {
                for (int i = 1; i <= 2; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    // System.out.print(columnValue + " " + rsmd.getColumnName(i));
                    System.out.print(columnValue);
                }
                System.out.println("");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return "Hello from RESTEasy Reactive";

    }
}