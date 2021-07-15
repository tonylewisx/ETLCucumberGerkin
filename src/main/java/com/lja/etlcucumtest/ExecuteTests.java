package com.lja.etlcucumtest;

//import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;

import junit.framework.Assert;
import static org.junit.Assert.*;

//import io.appium.java_client.android.AndroidKeyCode;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.appium.java_client.android.AndroidDriver;

import com.lja.dto.*;


public class ExecuteTests  {
//	Capabilities cap;
//    AndroidDriver driver;
    
// All Page Objects for the EAB application
    

	// below is run before each scenario
//@Before
// public void beforeScenario(){
//	System.out.println("Before the Scenario Run");
//}

//@After
//public void afterScenario(){
 //   System.out.println("After the Scenario run ");
//}

@Given("^Run one has ended$")
public void run_one_ended() {
	System.out.println("Run 1 has ended ");
}
	
@When("^One enters code (\\d+)$")
public void enter_password(String c)  {
	System.out.println("code entered="+ c);
}

@Then("^The door opens$")
public void dorr_open() {
	assertTrue(1==1);
  }

@When("^All phone numbers are removed$")
public void all_phone_numbers_are_removed()  {
	System.out.println("All phone no removed");
  //  throw new PendingException();
}


@Then("^The Employee record id left is ? (.*)$")
public void incorrect_login(String id) {
	Emp emp_val = new Emp("1","lja","60");
	Emp emp_exp = new Emp(id,"lja","60");
	System.out.println("emp id value = "+ id);
	assertTrue(emp_val.equals(emp_exp));
  }


@Given("^One is logged in with pwd ? (.*)$")
public void one_is_logged_in(String pwd) {
	System.out.println("password="+ pwd);
}


@When("^No more incidents $")
public void incident() {
	System.out.println("No more incidents");
//	Assert.assertEquals("Transaction Maintenance",trpo.get_title());
}

@Then("^the incident table is empty $")
public void incidenttab() {
	System.out.println("Table incident empty");
}

@When("^the incident table is empty$")
public void i_access_the_Transaction_Menu() {
	System.out.println("All phone no deleted");
//	Assert.assertEquals("Transaction Maintenance",trpo.get_title());
}


 
 
 /*********************************
  * End of Glue program
  * ******************************
  */
 
}
