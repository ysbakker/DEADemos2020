package oose.dea.api;


import oose.dea.api.oose.dea.api.dto.JediDTO;
import oose.dea.api.oose.dea.api.dto.LightSaberDTO;
import oose.dea.dao.IJediDAO;
import oose.dea.domain.Jedi;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("starwars")
public class StarWars {


    private IJediDAO IJediDAO;


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
    public Response getJedi(@PathParam("id") int id) {
        Jedi jedi = IJediDAO.getJedi(id);
        if (jedi == null) {
            return Response.status(404).build();
        }

        JediDTO jediDTO = new JediDTO();
        jediDTO.customerId = jedi.getCustomerId();
        jediDTO.name = jedi.getName();

        return Response.status(200).entity(jediDTO).build();


    }

    @Inject
    public void setJediDAO(IJediDAO IJediDAO) {
        this.IJediDAO = IJediDAO;
    }
}
