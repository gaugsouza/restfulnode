package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import objects.Number;

@Path("/prime-check")
public class PrimeCheckService {
	@GET
	@Path("/{numero}")
	@Produces("application/json")
	public Response checkPrimeNumber(@PathParam("numero") int numero) {
		Boolean primo = !(numero <= 1);
		 
        for (int counter = 2; counter < numero; counter++)
        	primo = numero % counter == 0 ? false : primo;
        
		return Response.status(200).entity(new Number(numero, primo)).build();
	}
	
}
