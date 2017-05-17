/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entities.EntryEntity;
import entities.PostReqEntity;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

/**
 *
 * @author gbmobile2
 */
@Path("/webhook")
public class webhook {

  private final FB_API FacebookAPI = new FB_API();

  @GET
  public Response verifyToken(@QueryParam("hub_challenge") String hub_challenge, @QueryParam("hub_verify_token") String hub_verify_token) {
    FacebookAPI.sendTextMessage("157031868162783", "Hola como estas");
    if(hub_verify_token.equals(FacebookAPI.VERIFY_TOKEN)) {
      return Response
              .status(Response.Status.OK)
              .entity(hub_challenge)
              .build();
    } else {
      return Response
              .status(Response.Status.FORBIDDEN)
              .entity("Forbidden")
              .build();
    }
  }
  
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public Response getRequests(PostReqEntity postReqEntity) {
    boolean bool = false;
    for(EntryEntity item: postReqEntity.entry) {
      if(item.messaging.getMessage() != null) {
        FacebookAPI.sendTextMessage(item.messaging.recipient, "Hola como estas");
        break;
      }
    }
    
    return Response
            .status(Response.Status.OK)
            .entity(bool ? "OK" : "Bad")
            .build();
  }

}
