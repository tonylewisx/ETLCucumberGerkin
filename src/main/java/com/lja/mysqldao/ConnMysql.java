package com.lja.mysqldao;
/*
 *   Inorder to access and connect to MySql server one woyuld need 
 *   the external jar mysql-connector-java-5.1.3.0.jar
 *   within the project
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnMysql {
	
	private String url; //"jdbc:mysql://192.168.1.74:3306/";
	private String db; //"mdadb";
	private String driver; //"com.mysql.jdbc.Driver";
	private String user; // "mda";
	private String pass; //"mda";
	
	public ConnMysql(String url, String db, String driver, String user, String pass) {
		super();
		this.url = url;
		this.db = db;
		this.driver = driver;
		this.user = user;
		this.pass = pass;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Connection connect() {
		Connection con = null;
		try{
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(getUrl()+getDb(), getUser(), getPass());
				
		   }
		 catch (Exception e){
			e.printStackTrace();
		  }
		System.out.println("Connected to database successfully");
		return con;
	}

}
