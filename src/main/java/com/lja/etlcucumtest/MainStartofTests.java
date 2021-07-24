package com.lja.etlcucumtest;
/*
 * Author : LJA
 * 
 * Version: 1.4
 *  Comment : to run , right click on this program in eclipse then run as junit.
 *            One can also open Feature file then right click , run as cumcumber feature.This way
 *            any unfounded glue code is created in output for you !!
 *            
 *            N.b MainStartofTest extends the reporting with overall summary .
 * 
 * 
 * 
 * 
 * 
 * 
 */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;


//@RunWith(Cucumber.class)
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "Reports/cucumber.json",
overviewReport = true,
outputFolder = "Reports")

@CucumberOptions(
		plugin={ "html:Reports/cucumber-html-report",
		        "json:Reports/cucumber.json", "pretty:Reports/cucumber-pretty.txt",
		        "usage:Reports/cucumber-usage.json", "junit:Reports/cucumber-results.xml" },
		features = {"src/main/java/com/lja/etlcucumtest/v1.00"}
		,glue={"com.lja.etlcucumtest"}
	//	,tags = {"@SanityTests"}
		,monochrome = true
		)

public class MainStartofTests { }


