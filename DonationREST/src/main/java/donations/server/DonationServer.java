package donations.server;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import donations.serialization.User;


@Path("/collector")
@Produces(MediaType.APPLICATION_JSON)
public class DonationServer {

	private DonationCollector donationCollector;

	public DonationServer() {

		donationCollector = new DonationCollector();
	}

	@POST
	@Path("/donations")
	public Response login(User user){
		System.out.println("Metodo post en donat");
		boolean checkLogin=false;
		checkLogin = donationCollector.login(user.getUsername(),user.getPassword());
		System.out.println("Received login: " + user.getUsername() +" booleano de login " +checkLogin);
		return Response.ok().build();
	}

	@GET
	@Path("/donations")
	public Response getUserInfo() {
		User user = donationCollector.getUserInfo();
		System.out.println("Prueba donor server login " +user.getUsername() +" password "+ user.getPassword());
		return Response.ok(user).build();

	}
}