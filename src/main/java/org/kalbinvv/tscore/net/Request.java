package org.kalbinvv.tscore.net;

import java.io.Serializable;

public class Request implements Serializable{

	private static final long serialVersionUID = -1259397996870598971L;
	private final RequestType requestType;
	private final Object object;
	
	public Request(RequestType requestType, Object object) {
		this.requestType = requestType;
		this.object = object;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public Object getObject() {
		return object;
	}
	
	@Override
	public String toString() {
		return "Request{"
				+ "requestType='" + requestType+"', "
				+ "object='" + object + "'"
				+ "}";
	}
	
	
}
