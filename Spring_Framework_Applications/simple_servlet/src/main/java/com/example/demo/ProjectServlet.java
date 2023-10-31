package com.example.demo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1306151396634098221L;
	
	// resource management
    // throws ServletException
    public void init() throws ServletException {
        super.init();
    }

    // resource management
    public void destroy() {
        super.destroy();
    }
    
    // Create
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Retrieve the "Test-Header" value from the HTTP request header
    	String testHeaderID = request.getHeader("Payload-Data");
    	String testHeaderResponse;

    	// If the response is not null, and has a value, replace with said value.
    	if(testHeaderID != null && !testHeaderID.isEmpty()) {
    	    testHeaderResponse = testHeaderID;
    	}else {
    	    testHeaderResponse = "nothing";
    	    // Changes the response status to 400 Bad Request.
    	    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    	}

    	// Store the 'responseText' string in the response object (to be sent to the client)
    	String responseText = "Data can be created using this method (POST)";

    	// writes the text to the response.
    	response.getWriter().append(responseText);
    	
    	System.out.println("doPost was called.");
    	System.out.println(testHeaderResponse);
    }
    
    // Read
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Retrieve the "Test-Header" value from the HTTP request header
    	String testHeaderID = request.getHeader("Payload-Data");
    	String testHeaderResponse;

    	// If the response is not null, and has a value, replace with said value.
    	if(testHeaderID != null && !testHeaderID.isEmpty()) {
    	    testHeaderResponse = testHeaderID;
    	}else {
    	    testHeaderResponse = "nothing";
    	    // Changes the response status to 400 Bad Request.
    	    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    	}

    	// Store the 'responseText' string in the response object (to be sent to the client)
    	String responseText = "GET is used to read information.";

    	// writes the text to the response.
    	response.getWriter().append(responseText);
    	
    	System.out.println("doGet was called.");
    	System.out.println(testHeaderResponse);
    }
    
    // Update
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Retrieve the "Test-Header" value from the HTTP request header
    	String testHeaderID = request.getHeader("Payload-Data");
    	String testHeaderResponse;

    	// If the response is not null, and has a value, replace with said value.
    	if(testHeaderID != null && !testHeaderID.isEmpty()) {
    	    testHeaderResponse = testHeaderID;
    	}else {
    	    testHeaderResponse = "nothing";
    	    // Changes the response status to 400 Bad Request.
    	    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    	}

    	// Store the 'responseText' string in the response object (to be sent to the client)
    	String responseText = "Use this (PUT) to update information.";

    	// writes the text to the response.
    	response.getWriter().append(responseText);
    	
    	System.out.println("doPut was called.");
    	System.out.println(testHeaderResponse);
    }

    // Delete
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Retrieve the "Test-Header" value from the HTTP request header
    	String testHeaderID = request.getHeader("Payload-Data");
    	String testHeaderResponse;

    	// If the response is not null, and has a value, replace with said value.
    	if(testHeaderID != null && !testHeaderID.isEmpty()) {
    	    testHeaderResponse = testHeaderID;
    	}else {
    	    testHeaderResponse = "nothing";
    	    // Changes the response status to 400 Bad Request.
    	    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    	}

    	// Store the 'responseText' string in the response object (to be sent to the client)
    	String responseText = "Only use DELETE to remove the specified target.";

    	// writes the text to the response.
    	response.getWriter().append(responseText);
    	
    	System.out.println("doDelete was called.");
    	System.out.println(testHeaderResponse);
    }
}
