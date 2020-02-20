package oose.dea.api;


import oose.dea.api.oose.dea.api.dto.JediDTO;
import oose.dea.api.oose.dea.api.dto.LightSaberDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("starwars")
public class StarWars {

    @GET
    @Path("hello")
    public String hello() {
        return "May the force be with you, always";
    }

    @POST
    @Path("lightsaber")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getLightSaber(JediDTO jedi) {
        LightSaberDTO lightSaberDTO = new LightSaberDTO();
        lightSaberDTO.color = "red";
        lightSaberDTO.sides = 8;

        return Response.status(200).entity(lightSaberDTO).build();
    }

    @GET
    @Path("customer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJedi(@PathParam("id") int id){

        JediDTO jedi = new JediDTO();

        if (id > 0) {
            jedi.customerId = id;
            jedi.name = "Yoda";
            return Response.status(200).entity(jedi).build();
        } else {
            return Response.status(404).build();
        }


    }
}
