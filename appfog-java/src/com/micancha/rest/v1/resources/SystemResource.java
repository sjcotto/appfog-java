package com.micancha.rest.v1.resources;

import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class SystemResource extends ServerResource {

	@Get
	public StringRepresentation putResource() {

		return new StringRepresentation(
				java.lang.System.getenv("VCAP_SERVICES"));

	}

	
}
