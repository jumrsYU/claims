package com.group8.claims;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
public class HomePage {

	@GET	
	@Produces(MediaType.TEXT_PLAIN)
	public String homePage() {
		return "AutoClaim - Car Insurance Claims";
	}
}
