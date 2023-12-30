package Apputils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class utildemo 
{
    /* @BeforeTest
	public void login() 
	{
		System.out.println("sanju_from_shalivahana");
		
	}*/
  
	@AfterTest
     public void loginout() 
     {

    	  System.out.println("sanju from shalivahana");
	}
	
	
  /*   @BeforeSuite
     public void lanchApp() 
     {
    	 
    	 System.out.println("lanch Gmail Application");
		
	}
     
     @AfterSuite
     public void closeApp()
     {
    	 
    	 System.out.println("close Gmail Application");
		
	}*/
     
     
     
     
}
