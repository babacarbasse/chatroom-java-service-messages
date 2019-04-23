package com.esp.chatroom;

import java.util.ArrayList;

import org.apache.xmlrpc.WebServer;



public class Main {

	static ArrayList<String> messages;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			System.out.println("Attempting to start XML-RPC Server...");
			WebServer server = new WebServer(4041);
			(server).addHandler("message", new Main());
			messages = new ArrayList<String>();
			server.start();
			System.out.println("Started successfully.");
			System.out.println("Accepting requests. (Halt program to stop.)");
		}
		catch (Exception exception){ System.err.println("JavaServer: " + exception); }
	}
	
	public String postMessage(String pseudo, String newMessage) {
        String displayMessage = pseudo + " >>> " + newMessage;
        System.out.println(displayMessage);
        messages.add(displayMessage);
        return displayMessage;
    }

	public ArrayList<String> getMessages(){
		return messages;
	}
}
