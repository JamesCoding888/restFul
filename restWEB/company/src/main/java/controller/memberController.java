package controller;

import java.util.List; 
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Dao.memberDao;
import Model.member;

@Path("member")// url -> http://172.20.10.4:8080/company/member/
public class memberController {
	//@Context: This annotation is used to inject information into a classfield,
	//			bean property or method parameter.
	@Context private HttpServletRequest request;
	@Context private HttpServletResponse response;
	
	// @Path: Identifies the URI path that a resource class or
	//	      class method will serverequests for. 
	@Path("A1")//url -> http://172.20.10.4:8080/company/member/A1
	@GET // Indicates that the annotated method responds to HTTP GET requests.
	public String getAll() {
		
		return "Hello";
	}
	
	@Path("A2")
	@POST
	public String addMember() {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		
		member m = new member(name, password, address, phone);
		new memberDao().add(m);
		return "success";
	}
	@Path("A3")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getID() {
		int id = Integer.parseInt(request.getParameter("id"));
		member m = (member)new memberDao().queryID(id);
		return Response.ok(m, MediaType.APPLICATION_JSON).build();
	}
	// 打包成 jason
	@Path("A4")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllByList() {
		List<Object> list = new memberDao().queryAllByList();
		return Response.ok(list, MediaType.APPLICATION_JSON).build();
	}
	
}
