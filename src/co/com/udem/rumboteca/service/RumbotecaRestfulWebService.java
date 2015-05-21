package co.com.udem.rumboteca.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.udem.rumboteca.model.CityDTO;
import co.com.udem.rumboteca.model.ComboDTO;
import co.com.udem.rumboteca.model.CountryDTO;
import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.model.PlaceDTO;
import co.com.udem.rumboteca.model.StateDTO;
import co.com.udem.rumboteca.persistence.entity.Place;

@Path("/Api")
public class RumbotecaRestfulWebService {

	RumbotecaFacade rumbotecaFacade = new RumbotecaFacade();

	@GET
	@Path("/getEventTop")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventDTO> getEventDTOTopThenInJSON() {
		return rumbotecaFacade.getEventTopTen();
	}

	@GET
	@Path("/getEventCity/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventDTO> getEventDTOInJSON(@PathParam("city") int city) {
		return rumbotecaFacade.getEventByCity(city);
	}
	
	@GET
	@Path("/getEventState/{state}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventDTO> getEventDTOByStateInJSON(@PathParam("state") int idState) {
		return rumbotecaFacade.getEventByState(idState);
	}
	
	@GET
	@Path("/getEventCountry/{country}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventDTO> getEventDTOByCountryInJSON(@PathParam("country") int idCountry) {
		return rumbotecaFacade.getEventByCountry(idCountry);
	}
	
	@GET
	@Path("/getCombos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComboDTO> getComboDTOInJSON() {
		return rumbotecaFacade.getCombos();
	}
	
	@GET
	@Path("/getPlaceCity/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlaceDTO> getPlaceDTOByCityInJSON(@PathParam("city") int idCity) {
		return rumbotecaFacade.getLocationByCity(idCity);
	}
	
	@GET
	@Path("/getPlaceState/{state}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlaceDTO> getPlaceDTOByStateInJSON(@PathParam("state") int idState) {
		return rumbotecaFacade.getLocationByState(idState);
	}
	
	@GET
	@Path("/getPlaceCountry/{country}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlaceDTO> getPlaceDTOByCountryInJSON(@PathParam("country") int idCountry) {
		return rumbotecaFacade.getLocationByCountry(idCountry);
	}
	
	@GET
	@Path("/getPlaceTop")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlaceDTO> getPlaceDTOTopThenInJSON() {
		return rumbotecaFacade.getLocationTopTen();
	}
	
	@GET
	@Path("/getCity")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CityDTO> getCityDTOInJSON() {
		return rumbotecaFacade.getCities();
	}
	
	@GET
	@Path("/getCityId/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CityDTO> getCitiesByIdInJSON(@PathParam("city")int idCity) {
		return rumbotecaFacade.getCitiesById(idCity);
	}
	
	@GET
	@Path("/getState")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StateDTO> getStatesInJSON() {
		return rumbotecaFacade.getStates();
	}
	
	@GET
	@Path("/getStateId/{state}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StateDTO> getStatesByIdInJSON(@PathParam("state")int idState) {
		return rumbotecaFacade.getStatesById(idState);
	}
	
	@GET
	@Path("/getCountry")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CountryDTO> getCountriesInJSON() {
		return rumbotecaFacade.getCountries();
	}

}
