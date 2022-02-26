package org.kalbinvv.tscore.net;

import java.io.Serializable;

public class Response implements Serializable{

	private static final long serialVersionUID = -3020548064856879228L;
	private final ResponseType responseType;
	private final Object object;
	
	public Response(ResponseType requestType, Object object) {
		this.responseType = requestType;
		this.object = object;
	}

	public ResponseType getRequestType() {
		return responseType;
	}

	public Object getObject() {
		return object;
	}
	
	@Override
	public String toString() {
		return "Response{"
				+ "responseType='" + responseType+"', "
				+ "object='" + object + "'"
				+ "}";
	}
	
	
}
