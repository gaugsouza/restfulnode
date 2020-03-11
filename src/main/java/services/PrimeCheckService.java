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
	@Path("/{number}")
	@Produces("application/json")
	public Response checkPrimeNumber(@PathParam("number") int number) {
		Boolean isPrime = !(number <= 1);
		 
        for (int counter = 2; counter < number; counter++) {
        	isPrime = !(number % counter == 0);
        	
        	if(isPrime) 
        		return Response.status(200).entity(new Number(number, isPrime)).build();
        }
        
		return Response.status(200).entity(new Number(number, isPrime)).build();
	}
	
}
