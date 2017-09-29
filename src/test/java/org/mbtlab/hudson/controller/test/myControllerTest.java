package org.mbtlab.hudson.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mbtlab.hudson.controller.myController;

public class myControllerTest {
	@Test
	public void testHead(){		
		assertEquals("index.jsp",new myController().head());
	}
	
	@Test
	public void testIndex(){
		try {
			assertEquals("index.jsp",new myController().index(null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	