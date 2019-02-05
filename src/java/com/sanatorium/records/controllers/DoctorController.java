/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanatorium.records.controllers;

import com.sanatorium.records.dataRepo.StaffRepo;
import com.sanatorium.records.dataRepo.StudentRepo;
import com.sanatorium.records.models.Student;
import java.io.File;
//import com.sanatorium.records.models.StudentModel;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Makali
 */
@WebServlet("/doctor")
public class DoctorController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private StudentRepo studentDb;

    @Resource(name = "jdbc/sanatorium")
    private DataSource dataSource;

    @Override
    public void init() throws ServletException {
        super.init();

        // create our student db util ... and pass in the conn pool / datasource
        try {
            studentDb = new StudentRepo(dataSource);
        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            addStudent(request, response);

        } catch (Exception exc) {

            throw new ServletException(exc);
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {

        request.getRequestDispatcher("doctor.jsp").forward(request, response);
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // read student info from form data
        String studentId = request.getParameter("studentId");
        String patientId = request.getParameter("patientId");
        String name = request.getParameter("name");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));

        // create a new student object
        Student newStudent = new Student(studentId, patientId, name, gender);

        // add the student to the database
        studentDb.addStudent(newStudent);

    }

}
