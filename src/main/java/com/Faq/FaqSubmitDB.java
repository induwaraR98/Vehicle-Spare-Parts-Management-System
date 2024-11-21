package com.Faq;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
	
@SuppressWarnings("unused")
public class FaqSubmitDB {
	
	//define database connection variables
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean Success;
	
	//create a method to insert data into DB
	public static boolean InsertQuestion(String fname,String lname,String email,String mobile,String question) {
		
		boolean Success =false;
		
		
		try {
			//create database connection
			con  = DBConnect.getConnection(); 
			stmt  = con.createStatement();
			
			String sql = "insert into faq values(0,'"+fname+"','"+lname+"','"+email+"','"+mobile+"','"+question+"')";
            int rs = stmt.executeUpdate(sql);
            
            if (rs > 0) {
            	Success = true;
            }
            else {
            	Success = false;
            }
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return Success;
	}
	
	//Retrieve data from database
	public static List<Question> getquestions(){
		
		//int convertNumber = Integer.parseInt();
		
		ArrayList<Question> que = new ArrayList<>();
			
		try {
			//create database connection
			con  = DBConnect.getConnection(); 
			stmt  = con.createStatement();
			
			String sql = "select * from faq";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				 int number = rs.getInt(1);
				 String fname = rs.getString(2);
				 String lname = rs.getString(3);
				 String email = rs.getString(4);
				 String mobile = rs.getString(5);
				 String question = rs.getString(6);
				 
				 Question q = new Question(number,fname,lname,email,mobile,question);
				 que.add(q);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return que;
		
	}
	
	//create a method to update data into DB
	public static boolean updatequestion(String fname,String lname,String email,String mobile,String question) {
		
		try {
			//create database connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update faq set fname = '"+fname+"',lname = '"+lname+"',email = '"+email+"',mobile = '"+mobile+"',question = '"+question+"' where fname = '"+fname+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				Success = true;
			}
			else {
				Success = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return Success;
		
	}
	
	//create a method to delete data into DB
	public static boolean deletequestion(String fname) {
		
		try {
			//create database connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from faq where fname = '"+fname+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				Success = true;
			}else {
				Success = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();	
		}
		
		return Success;
	}
}
