package mr.iscae.ressources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mr.iscae.modeles.D_etudes;
import mr.iscae.services.ServiceD_etudes;

@Path("/D_etudesWS")
@Produces(MediaType.APPLICATION_JSON)
public class RessourcesD_etudes {
	static ServiceD_etudes serviceD_etudes = new ServiceD_etudes();
	@GET
	@Path("/{IdD_etudes}")
	public D_etudes getD_etudes(@PathParam("IdD_etudes") String idD_etudes){
		return serviceD_etudes.getD_etudes(idD_etudes);
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public D_etudes addD_etudes(D_etudes d_etud){
		return serviceD_etudes.ajoutD_etudes(d_etud);
	}
	
}
