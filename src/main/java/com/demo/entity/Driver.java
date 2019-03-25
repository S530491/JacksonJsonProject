package com.demo.entity;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
//there is also a way to ignore the properties if you don't want to get into them into 
//@JsonIgnoreProperties(ignoreUnknown=true)
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ObjectMapper o=new ObjectMapper();
	Student s=o.readValue(new File("data/sample-full.json"), Student.class);
	System.out.println(s.getFirstName());
	System.out.println(s.getLastName());
Address a=s.getAddress();
System.out.println(a.getCity());
System.out.println(a.getState());
}catch(Exception e) {
	e.printStackTrace();
}
	
	}

}
