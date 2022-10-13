package org.acme;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/employees")
public class StoredProcedureRest {

    // @Inject
    // AgroalDataSource dataSource;

    // @GET
    // @Produces(MediaType.APPLICATION_JSON)
    // public Response hello() throws SQLException {

    // Connection connection = null;
    // ResultSet resultSet = null;
    // CallableStatement cstmt = null;
    // List<Employee> employeesArray = new ArrayList<Employee>();

    // try {

    // connection = dataSource.getConnection();

    // cstmt = connection.prepareCall("BEGIN SP_CONSULTA_GENERALES(?,?,?,?,?,?,?,?);
    // END;");
    // cstmt.setString(1, "Test1");
    // cstmt.setString(2, "Test2");
    // cstmt.setString(3, "Test3");
    // cstmt.setString(4, "Test4");
    // cstmt.setString(5, "Test5");
    // cstmt.setString(6, "Test6");
    // cstmt.setString(7, "Test7");
    // cstmt.registerOutParameter(8, OracleTypes.CURSOR);
    // cstmt.execute();

    // resultSet = (ResultSet) cstmt.getObject(8);

    // while (resultSet.next()) {

    // Employee employee = new Employee(resultSet.getString("ID"),
    // resultSet.getString("NAME"),
    // resultSet.getString("SALARY"), resultSet.getString("DPTO"),
    // resultSet.getString("LOCATION"));
    // employeesArray.add(employee);
    // }

    // } catch (Exception e) {
    // System.out.println(e);
    // }

    // return Response.ok(employeesArray).build();

    // }

    // @GET
    // @Produces(MediaType.APPLICATION_JSON)
    // public Response hello() throws SQLException {

    // Connection connection = null;
    // ResultSet resultSet = null;
    // CallableStatement cstmt = null;
    // List<Test> employeesArray = new ArrayList<Test>();

    // try {

    // connection = dataSource.getConnection();

    // cstmt = connection.prepareCall("BEGIN SP_APL_DETALLE_SOLICITUD(?,?); END;");
    // cstmt.setString(1, "40839");
    // cstmt.registerOutParameter(2, OracleTypes.CURSOR);
    // cstmt.execute();

    // resultSet = (ResultSet) cstmt.getObject(2);

    // while (resultSet.next()) {

    // Test employee = new Test(
    // resultSet.getString("ID_INSTANCIA"),
    // resultSet.getString("DEPARTAMENTO"),
    // resultSet.getString("TIPO_AJUSTE"),
    // resultSet.getString("MONEDA"),
    // resultSet.getString("FECHA_CREACION"),
    // resultSet.getString("FECHA_PROCESADO"),
    // resultSet.getString("ID_INSTANCIA_RELACIONADA"),
    // resultSet.getString("APROBACION_ADJUNTA"),
    // resultSet.getString("TOTAL_DEBITO"),
    // resultSet.getString("TOTAL_CREDITO"),
    // resultSet.getString("TOTAL_TRANSACCIONES"),
    // resultSet.getString("ESTADO_SOLICITUD"),
    // resultSet.getString("NIVEL_APROBACION"),
    // resultSet.getString("CREADOR"),
    // resultSet.getString("REVISOR"),
    // resultSet.getString("APROBADOR"));
    // employeesArray.add(employee);
    // }

    // } catch (Exception e) {
    // System.out.println(e);
    // }

    // return Response.ok(employeesArray).build();

    // }

    @POST
    public Response hello(StoredProcedureRequestBody SPRequestBody) {

        List<Employee> response;

        try {
            StoredProcedureCall spcall = new StoredProcedureCall();

            response = spcall.callStoredProcedure(SPRequestBody);

            return Response.ok(response).build();
        } catch (Exception e) {
            return Response.status(500).entity(e).build();
        }

    }
}
