package com.micancha.rest.v1.application;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.micancha.rest.v1.resources.SystemResource;

/**
 * @author taio
 * 
 */
public class RouterApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {

		Router router = new Router(getContext());

		
		router.attach("/system", SystemResource.class); 
		
		return router;
	}

}
