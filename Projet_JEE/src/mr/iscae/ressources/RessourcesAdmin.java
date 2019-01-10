package mr.iscae.ressources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mr.iscae.services.ServiceAdmin;


@Path("/admin")
@Produces(MediaType.APPLICATION_JSON)
public class RessourcesAdmin {
	static ServiceAdmin serviceadmin = new ServiceAdmin();
	@GET
	@Path("/{adminId}/{adminpwd}")
	public String getinfos(@PathParam("adminId") String nom,@PathParam("adminpwd") String pass){
	return serviceadmin.getAdmin(nom,pass);
	}
	
	@PUT
	@Path("/{adminLog}/{adminNpwd}")
	//Login avec nouveau password
	public String modifierPass(@PathParam("adminLog") String login,@PathParam("adminNpwd") String pass){
		return serviceadmin.changePass(login, pass);
	}
	
}

