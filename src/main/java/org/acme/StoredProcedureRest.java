package org.acme;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;
import io.vertx.core.json.JsonArray;

@Path("/employees")
public class StoredProcedureRest {

    @Inject
    @DataSource("db1")
    AgroalDataSource oracleDataSource;

    @POST
    public Response spPost(StoredProcedureRequestBody SPRequestBody) {

        JsonArray response;

        try {
            StoredProcedureCall spcall = new StoredProcedureCall();

            response = spcall.callStoredProcedure(SPRequestBody, oracleDataSource);

            return Response.ok(response).build();
        } catch (Exception e) {
            return Response.status(500).entity(e).build();
        }

    }
}
