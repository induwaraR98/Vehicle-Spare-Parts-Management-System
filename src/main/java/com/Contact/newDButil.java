package com.Contact;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class newDButil {
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean insertsuctomer(String name,String phone,String email,String address,String cname) {
		
		
		boolean isSuccess =false;
		
		 
		 
		 try {
			 con= DBConnect.getConnection();
			 stmt= con.createStatement();
			 
			 String sql="insert into newtable values(0,'"+name+"','"+phone+"','"+email+"','"+address+"','"+cname+"')";
			 int rs=stmt.executeUpdate(sql);
			 
			 if(rs>0) {
				 
				 isSuccess=true;
			 }else {
				 
				 isSuccess=false;
			 }
			 
		 }catch(Exception e) {
			 
			 e.printStackTrace();
			 
		 }
		 
		return isSuccess;
	}


/*	public static List<customer> getCustomer(String userName) {

ArrayList<customer> customer = new ArrayList<>();

try {
	
	con = DBconnect.getConnection();
	stmt = con.createStatement();
	String sql = "select * from newtable ";
	rs = stmt.executeQuery(sql);
	
	while (rs.next()) {
		int id = rs.getInt(1);
		String name = rs.getString(2);
		String phone = rs.getString(3);
		String email = rs.getString(4);
		String address = rs.getString(5);
		String cname = rs.getString(6);
		
		customer cus = new customer(id,name,phone,email,address,cname);
		customer.add(cus);
	}
	
} catch (Exception e) {
	
}

return customer;	
}*/

public static boolean updatecontact(String id,String name,String phone,String email, String address, String cname) {
	
	try {
		con= DBConnect.getConnection();
		 stmt= con.createStatement();
		 
		 String sql= "update newtable set name='"+name+"',phone='"+phone+"',email='"+email+"',address='"+address+"',company='"+cname+"' where name='"+name+"'";
		
		int rs=stmt.executeUpdate(sql);
		
          if(rs>0) {
			 
			 isSuccess=true;
		 }else {
			 
			 isSuccess=false;
		 }
		
	}catch(Exception e) {
		
		 e.printStackTrace();
	}
	
	return isSuccess;
	
}

public static boolean deletecontact(String name) {
	
	
	try {
		
		con= DBConnect.getConnection();
		 stmt= con.createStatement();
		 
		 String sql="delete from newtable where name= '"+name+"'  ";
		 int rs= stmt.executeUpdate(sql);
		 
		 if(rs>0) {
			 
			 isSuccess=true;
		 }else {
			 isSuccess=false;
		 }
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	return isSuccess;
	
}






}
