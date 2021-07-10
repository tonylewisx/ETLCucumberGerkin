package com.lja.etlcucumtest;
/*
 *  Author:LJA
 *  Version: 1.1
 *  Comment : to run , right clik on program then run as junit.
 *            One can also open Feature file then right click , run ac cumcumber feature.This way
 *            any unfounded glue code is created in output for you
 * 
 * 
 * 
 * 
 * 
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/java/com/lja/etlcucumtest/v1.00",
 glue= {"com.lja.etlcucumtest"},
 plugin={ "html:Reports/cucumber-html-report",
	        "pretty:Reports/cucumber-pretty.txt","json:Reports/cucumber.json"},
 monochrome = true
 )
 
public class TestRunner {
 
}