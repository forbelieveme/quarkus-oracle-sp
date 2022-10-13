package org.acme;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/employees")
public class StoredProcedureRest {

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
