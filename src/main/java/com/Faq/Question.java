package com.Faq;

public class Question {
	
	private int number;
	private String fname;
	private String lname;
	private String email;
	private String mobile;
	private String question;
	
	
	public Question(int number, String fname,String lname,String email, String mobile, String question) {

		this.number = number;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.question = question;
	}


	public int getNumber() {
		return number;
	}


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getEmail() {
		return email;
	}


	public String getMobile() {
		return mobile;
	}


	public String getQuestion() {
		return question;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public void setQuestion(String question) {
		this.question = question;
	}

}
