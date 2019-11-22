package com.deepak.messenger.resources;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.deepak.messenger.model.Message;
import com.deepak.messenger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/messages")
public class MessageResource {
  
	MessageService messages=new MessageService();
	
    @GET
   // @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {

    	
    	return messages.getAllMessages() ; 
         
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> addMessages(List<Message> msg) {
      
    	
    	return msg ; 
         
    }

    
    
    
    
    
}
