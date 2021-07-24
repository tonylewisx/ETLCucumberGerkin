package com.lja.oracledao;

/*
 *  require the external jar ojdbc8.jar to connect to oracle server
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleCon { 
	   private String url; //"jdbc:oracle:thin:@192.168.1.74:1521:xe";
       private String driver; //"oracle.jdbc.driver.OracleDriver";
       private String user; // "system";
       private String pass; //"javelin";
	 
     public OracleCon(String url, String driver, String user, String pass) {
		super();
		this.url = url;
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


	public void connect() {  
       try{  
            Class.forName(getDriver());  
            Connection con=DriverManager.getConnection(getUrl(),getUser(),getPass());  
  

    //  Statement stmt=con.createStatement();  
    //  ResultSet rs=stmt.executeQuery("select * from emp");  
    //  while(rs.next())  
    //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
           System.out.println("Connected to Oracle XE successfully");
           con.close();  
  
            } catch(Exception e){ System.out.println(e);}  
  
          }  
    }  