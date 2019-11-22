package com.deepak.messenger.model;



import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message {
	
	
	public String name;
	public String message;
	
	
	public Message() {
		
	}
	

	public Message( String name, String message) {
		
		
		this.name = name;
		this.message = message;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Message [name=" + name + ", message=" + message + "]";
	}
	
	

	
}