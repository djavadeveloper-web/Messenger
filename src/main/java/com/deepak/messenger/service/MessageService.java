
package com.deepak.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.deepak.messenger.model.Message;

public class MessageService {
	
	
	 public MessageService() {
		 
	 }
	
	public List<Message> getAllMessages(){
	  
		
		Message m1=new Message("Deepak","Please bring 1 beer bottle  for me");
		Message m2=new Message("Abhishek","Bring 1 BP & VAT69 ");
		Message m3=new Message("Gaurav","Don't spend money !");
		Message m4=new Message("Vishal ","Bring anyting I will take care of ");
		Message m5=new Message("Manish","I can't go outside ");
		Message m6=new Message("Mohit","Please bring chicken for me");
		Message m7=new Message("Raj","Free ka kuch bhi laa do paisa mt mangna");
		
		List<Message>  list =new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		
		
		return list;
		
	}

}