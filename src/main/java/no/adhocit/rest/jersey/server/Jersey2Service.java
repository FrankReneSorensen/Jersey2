package no.adhocit.rest.jersey.server;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
  
@Path("/message")
public class Jersey2Service
{
    @GET
    public String getMsg()
    {
         return "Test melding";
    }
}