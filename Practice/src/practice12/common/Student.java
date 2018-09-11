/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	int i;
	String s,t,r,n,g;
	
	
	/** 受講生ID */
	private int studentId;
	


	/** 受講生氏名 */
	private String studentName;
	
	/** 会社名 */
	private 
	String companyName;
	
	
	/** 教室名 */
	private 
	String className;
	
	/** メールアドレス */
	private 
	String mail;
	
	
	/** パスワード */
	private String password;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public //private
	String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(//private
	String companyName) {
		this.companyName = companyName;
	}
	public //private
	String getClassName() {
		return className;
	}
	public void setClassName(//private
	String className) {
		this.className = className;
	}
	public //private
	String getMail() {
		return mail;
	}
	public void setMail(//private
	String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

