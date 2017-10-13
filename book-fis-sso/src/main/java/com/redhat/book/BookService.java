package com.redhat.book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
public interface BookService {
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Book[] getAllBooks();

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book findBook(@PathParam("id") String id);

	@GET
	@Path("/delete/{id}")
	public String deleteBook(@PathParam("id") String id);
}
