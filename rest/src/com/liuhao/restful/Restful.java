package com.liuhao.restful;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/liuhao")
public interface Restful {
	@Path("/sayHello")
	public void sayHello();
	
	@Path("/sayHello2/{name}")
	@GET
	@Consumes("text/plain")
	public String sayHello2(@PathParam("name") String name);
}
