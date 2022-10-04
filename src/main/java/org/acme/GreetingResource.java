package org.acme;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.agroal.api.AgroalDataSource;

@Path("/hello")
public class GreetingResource {

    @Inject
    AgroalDataSource dataSource;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() throws SQLException {

        Connection connection = null;
        ResultSet resultSet = null;
        CallableStatement cstmt = null;
        List<Employee> employeeArray = new ArrayList<Employee>();

        try {

            connection = dataSource.getConnection();

            // resultSet = connection.createStatement().executeQuery("call
            // SP_CONSULTA_GENERALES('','','','','','','',?)");

            // // System.out.println(resultSet);
            // while (resultSet.next()) {
            // for (int i = 1; i <= 2; i++) {
            // if (i > 1) System.out.print(", ");
            // String columnValue = resultSet.getString(i);
            // // System.out.print(columnValue + " " + rsmd.getColumnName(i));
            // System.out.print(columnValue);
            // }
            // System.out.println("");
            // }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        Employee employee1 = new Employee("A1", "Jon", "Doe", "Managment", "NY");
        Employee employee2 = new Employee("A2", "Jon2", "Doe2", "Managment", "NY");

        employeeArray.add(employee1);
        employeeArray.add(employee2);

        return Response.ok(employeeArray).build();

    }
}