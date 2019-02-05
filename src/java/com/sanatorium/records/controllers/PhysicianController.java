/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanatorium.records.controllers;

import com.sanatorium.records.dataRepo.PhysicianRepo;
import com.sanatorium.records.models.physicianBean;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/PhysicianController")
public class PhysicianController extends HttpServlet {
    
    	private static final long serialVersionUID = 1L;
        
        private PhysicianRepo physicianData;

        @Resource(name="jdbc/sanatorium")
	private DataSource dataSource;
        
        @Override
	public void init() throws ServletException {
		super.init();
		
		// create our staff db util ... and pass in the conn pool / datasource
		try {
			physicianData = new PhysicianRepo(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
        
        
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                try {
                    addVitals(request,response);
                } catch (Exception exc) {
                
			throw new ServletException(exc);
            }
    }
        
        
       
       private void addVitals(HttpServletRequest request, HttpServletResponse response) throws Exception{
            
           physicianBean vitals = new physicianBean();       
        
            vitals.setAge(Integer.parseInt(request.getParameter("age")));
            vitals.setBMI(Double.parseDouble(request.getParameter("bmi")));
            vitals.setHeight(Double.parseDouble(request.getParameter("height")));
            vitals.setID(Integer.parseInt(request.getParameter("patientId")));
            vitals.setPatienName(request.getParameter("patientnameField"));
            vitals.setPhysicianName(request.getParameter("physicianName"));
            vitals.setSex(request.getParameter("sexField"));
            vitals.setTemperature(Double.parseDouble(request.getParameter("temField")));
            vitals.setWeight(Double.parseDouble(request.getParameter("weight")));
                    
       }
}