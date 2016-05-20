package com.smartblogger.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bson.types.ObjectId;

import org.mongodb.morphia.Datastore;

import com.smartblogger.model.Users;

@Path("/user")
public class UserServiceMD {

	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Users getUser(@PathParam("param") Integer id) {
		return null;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Users> getUsers() {
		Datastore dataStore = ServicesFactory.getMongoDB();
		
		List<Users> users = dataStore.createQuery(Users.class).asList();
		
		return users;
		
	}
	
	@POST

	@Consumes(MediaType.APPLICATION_JSON)
	public void createUser(Users u){
		Datastore dataStore = ServicesFactory.getMongoDB();
		dataStore.save(u);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateUser(Users u){
		
	}
	
	@DELETE
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public boolean deleteUser(@PathParam("param") Integer id) {
		return false;
	}
}
