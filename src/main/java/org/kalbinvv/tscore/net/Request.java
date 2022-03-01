package org.kalbinvv.tscore.net;

import java.io.Serializable;

import org.kalbinvv.tscore.user.User;

public class Request implements Serializable{

	private static final long serialVersionUID = -1259397996870598971L;
	private final RequestType requestType;
	private final Object object;
	private final User userWhoSend;
	
	public Request(RequestType requestType, Object object) {
		this.requestType = requestType;
		this.object = object;
		this.userWhoSend = null;
	}
	
	public Request(RequestType requestType, Object object, User userWhoSend) {
		this.requestType = requestType;
		this.object = object;
		this.userWhoSend = userWhoSend;
	}

	public RequestType getType() {
		return requestType;
	}

	public Object getObject() {
		return object;
	}
	
	public User from() {
		return userWhoSend;
	}
	
	@Override
	public String toString() {
		return "Request{"
				+ "requestType='" + requestType+"', "
				+ "object='" + object + "', "
				+ "userWhoSend='" + userWhoSend + "'"
				+ "}";
	}
	
	
}
