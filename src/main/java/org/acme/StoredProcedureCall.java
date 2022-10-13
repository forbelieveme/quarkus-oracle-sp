package org.acme;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.agroal.api.AgroalDataSource;
import oracle.jdbc.OracleTypes;

public class StoredProcedureCall {

    @Inject
    AgroalDataSource oracleDataSource;

    Connection connection = null;
    ResultSet resultSet = null;
    CallableStatement cstmt = null;
    String sqlString = "BEGIN SP_CONSULTA_GENERALES(?,?,?,?,?,?,?,?); END;";
    List<StoredProcedureResponseElement> employeesArray = new ArrayList<StoredProcedureResponseElement>();

    public List<StoredProcedureResponseElement> callStoredProcedure(StoredProcedureRequestBody SPRequestBody) throws SQLException {

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

        while (resultSet.next()) {

            StoredProcedureResponseElement employee = new StoredProcedureResponseElement(resultSet.getString("ID"),
                    resultSet.getString("NAME"),
                    resultSet.getString("SALARY"), resultSet.getString("DPTO"),
                    resultSet.getString("LOCATION"));
            employeesArray.add(employee);
        }

        return employeesArray;

    }
}
