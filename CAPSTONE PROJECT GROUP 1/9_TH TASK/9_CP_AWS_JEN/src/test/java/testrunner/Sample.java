
package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sample {
  @Test
	  public void firsttest()  {
		  
		  Assert.assertNotEquals("Hello", "How are you");  
	      System.out.println("Hello...This is jenkins aws integration");  
	        
	
	  }
  
  	@Test
	 public void secondtest()  {
		  
		  Assert.assertEquals("Hello", "Hello");  
	   
	        
	
	  }
}


 