package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
		// TODO Auto-generated method stub
		@Test
		public void Demo()
		{
			
			System.out.println("day2");
		}
		
		@AfterTest
		public void lastexecuite()
		{
			
			System.out.println("I will execuite last");
		}
		
		
		@BeforeTest
		public void prerequiste()
		{
			
			System.out.println("I will execuite first");
		}
		
 @Test 
 
 	 public void SecondTest()
	 {
	 
	        System.out.println("second bye");
     }
}
