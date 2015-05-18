package co.com.udem.rumboteca.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.udem.rumboteca.model.EventDTO;

@Path("/Api")
public class RumbotecaRestfulWebService {

	@GET
	@Path("/get/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventDTO> getEventDTOInJSON(@PathParam("city") int city) {
		RumbotecaFacade rumbotecaFacade = new RumbotecaFacade();
		return rumbotecaFacade.getEventByCity(city);
	}
	
	@GET
	@Path("/getEventTop")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventDTO> getEventDTOTopThenInJSON() {
		RumbotecaFacade rumbotecaFacade = new RumbotecaFacade();
		return rumbotecaFacade.getEventTopTen();
	}
}
