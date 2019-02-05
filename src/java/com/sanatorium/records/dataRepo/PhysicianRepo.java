
package com.sanatorium.records.dataRepo;

import com.sanatorium.records.models.physicianBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

public class PhysicianRepo {
    private final DataSource datasource;
    
    public PhysicianRepo(DataSource theDataSource) {
		datasource = theDataSource;
	}
    
     
     
     public physicianBean addPatientDetails (physicianBean bean) throws Exception{
        
        Connection connect = null;
        ResultSet rs = null;
        PreparedStatement add = null;    
        
        //values from the Physician bean 
        String patient = bean.getPatienName();
        String physician = bean.getPhysicianName();
        String sex = bean.getSex();
        int age = bean.getAge();
        double BMI = bean.getBMI();
        double height = bean.getHeight();
        int ID = bean.getID();
        double weight = bean.getWeight();
        double temperature = bean.getTemperature();

         try{
             //get db connection
            connect = datasource.getConnection();
            
            //create sql for insert 
            String insertQuery = "INSERT INTO table (patientId,Age, weight, height,temperature,bmi,physicianName) VALUES (?,?,?,?,?,?,?,?,?)";
            
            add = connect.prepareStatement(insertQuery);
              
            //set the par values 
              add.setString(1, patient);
              add.setString(2, physician);
              add.setString(3, sex);
              add.setInt(4, age);
              add.setDouble(5, BMI);
              add.setDouble(6, height);
              add.setInt(7, ID);
              add.setDouble(8, weight);
              add.setDouble(9, temperature);
              
            
         }
         finally {
			// clean up JDBC objects
			close(connect, add, null);
		}
         
    return bean;

     }
        private void close(Connection connect, Statement add, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (add != null) {
				add.close();
			}
			
			if (connect != null) {
				connect.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception ex) { 
                    
		}
           }
}
