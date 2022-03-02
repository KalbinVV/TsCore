package org.kalbinvv.tscore.net;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection {

	private Socket socket;
	
	public Connection(Socket socket){
		this.socket = socket;
		
	}
	
	public void close() throws IOException {
		socket.close();
	}
	
	public void open() throws IOException {
		socket = new Socket(socket.getInetAddress().getHostName(), socket.getPort());
	}
	
	public void reconnect() throws IOException {
		close();
		open();
	}
	
	public void sendRequest(Request request) {
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(
					socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			objectOutputStream.writeObject(request);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Request getRequest() {
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(
					socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		Request request = null;
		try {
			request = (Request) objectInputStream.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return request;
	}
	
	public void sendResponse(Response response) {
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(
					socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			objectOutputStream.writeObject(response);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Response getResponse() {
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(
					socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		Response response = null;
		try {
			response = (Response) objectInputStream.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public Response sendRequestAndGetResponse(Request request) {
		sendRequest(request);
		return getResponse();
	}
	
	
}
