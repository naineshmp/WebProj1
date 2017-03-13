package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class RestServiceDemo {
	
	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	public String getCustomer(@Context HttpHeaders headers, @QueryParam("id") int id, @QueryParam("name") String name){
		Customer c = new Customer(id,name);
		//System.out.println(id +"-------------");
		c.toString();
		
		return c.toString();
		
	}
}
