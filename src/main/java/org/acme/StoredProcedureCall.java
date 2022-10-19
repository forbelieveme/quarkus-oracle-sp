package org.acme;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.agroal.api.AgroalDataSource;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import oracle.jdbc.OracleTypes;

public class StoredProcedureCall {

    Connection connection = null;
    ResultSet resultSet = null;
    CallableStatement cstmt = null;
    String sqlString = "BEGIN SP_CONSULTA_GENERALES(?,?,?,?,?,?,?,?); END;";

    public JsonArray callStoredProcedure(StoredProcedureRequestBody SPRequestBody,
            AgroalDataSource oracleDataSource)
            throws SQLException {

        connection = oracleDataSource.getConnection();

        cstmt = connection.prepareCall(sqlString);
        cstmt.setString(1, SPRequestBody.getParameter_1());
        cstmt.setString(2, SPRequestBody.getParameter_2());
        cstmt.setString(3, SPRequestBody.getParameter_3());
        cstmt.setString(4, SPRequestBody.getParameter_4());
        cstmt.setString(5, SPRequestBody.getParameter_5());
        cstmt.setString(6, SPRequestBody.getParameter_6());
        cstmt.setString(7, SPRequestBody.getParameter_7());
        cstmt.registerOutParameter(8, OracleTypes.CURSOR);
        cstmt.execute();

        resultSet = (ResultSet) cstmt.getObject(8);

        ResultSetMetaData md = resultSet.getMetaData();
        int numCols = md.getColumnCount();

        System.out.println(numCols);

        List<String> colNames = IntStream.range(0, numCols)
                .mapToObj(i -> {
                    try {
                        return md.getColumnName(i + 1);
                    } catch (SQLException e) {
                        e.printStackTrace();
                        return "?";
                    }
                })
                .collect(Collectors.toList());

        JsonArray result = new JsonArray();

        while (resultSet.next()) {
            JsonObject row = new JsonObject();
            colNames.forEach(cn -> {
                try {
                    row.put(cn, resultSet.getObject(cn));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            result.add(row);
        }

        return result;

    }
}
