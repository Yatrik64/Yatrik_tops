package org.junitdemo;

	import org.junit.Test;
import org.junitdemo.Assert;

	public class Assert {

	    @Test
	    public void testAssertions() {
	       
	        Assert.assertEquals("Values are not equal!", 5, 2 + 3);

	        Assert.assertEquals("Values should not be equal!", 10, 5 + 3);

	      
	        Assert.assertTrue("Condition should be true!", 10 > 5);

	     
	        Assert.assertTrue("Condition should be false!", 5 > 10);

	       
	        String str1 = null;
	        Assert.assertNull("Object should be null!", str1);

	       
	        String str2 = "JUnit";
	        Assert.assertNull("Object should not be null!", str2);

	      
	        String a = "Hello";
	        String b = a; 
	        Assert.assertEquals("Objects should be same!", a, b);

	        
	        String x = new String("Hello");
	        String y = new String("Hello");
	        Assert.assertNotSame("Objects should not be same!", x, y);
	    }

		private static void assertEquals(String string, int i, int j) {
			
			
		}

		private static void assertNotSame(String string, String x, String y) {
			
			
		}

		private static void assertNull(String string, String str1) {
			
			
		}

		private static void assertTrue(String string, boolean b) {
			
		}

		private static void assertEquals(String string, String a, String b) {
			
		}
	}

