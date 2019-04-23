package com.esp.chatroom;

import org.apache.xmlrpc.WebServer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			System.out.println("Attempting to start XML-RPC Server...");
			WebServer server = new WebServer(4041);
			(server).addHandler("message", new Main());
			server.start();
			System.out.println("Started successfully.");
			System.out.println("Accepting requests. (Halt program to stop.)");
		}
		catch (Exception exception){ System.err.println("JavaServer: " + exception); }
	}
	
	public String postMessage(String pseudo, String newMessage) {
        String displayMessage = pseudo + " >>> " + newMessage;
        System.out.println(displayMessage);
        return displayMessage;
    }

}
