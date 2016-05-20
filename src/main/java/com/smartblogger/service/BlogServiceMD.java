package com.smartblogger.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mongodb.morphia.Datastore;

import com.smartblogger.model.Blog;

@Path("/blog")
public class BlogServiceMD {
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Blog getBlogById(@PathParam("param") Integer id) {
		return null;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Blog> getAllBlogs() {
		Datastore dataStore = ServicesFactory.getMongoDB();
		
		List<Blog> blogs = dataStore.createQuery(Blog.class).asList();
		
		return blogs;
		
	}
	
	@POST

	@Consumes(MediaType.APPLICATION_JSON)
	public void createBlog(Blog blog){
		System.out.println("Blogs=" + blog);
		Datastore dataStore = ServicesFactory.getMongoDB();
		dataStore.save(blog);
	}

}
