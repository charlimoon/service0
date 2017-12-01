package com.service.service0.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2017-12-01T06:25:48.770Z")


@RestSchema(schemaId = "service0")
@Path("/service0")

@Produces({ "application/json" })
public class Service0Impl  {

    @Autowired
    private Service0Delegate service0Delegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return service0Delegate.helloworld(name);
    }
}

