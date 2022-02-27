package org.kalbinvv.tscore.net;

import java.io.Serializable;

public class Response implements Serializable{

	private static final long serialVersionUID = -3020548064856879228L;
	private final ResponseType responseType;
	private final Object object;
	
	public Response(ResponseType responseType, Object object) {
		this.responseType = responseType;
		this.object = object;
	}
	
	public Response(ResponseType responseType) {
		this.responseType = responseType;
		this.object = null;
	}

	public ResponseType getType() {
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
