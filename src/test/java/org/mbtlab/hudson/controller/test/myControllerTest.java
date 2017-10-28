package org.mbtlab.hudson.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mbtlab.hudson.controller.myController;

public class myControllerTest {
	@Test
	public void testHead(){	
		String result = new myController().head();
		assertEquals("index.jsp",result);
	}
	
	@Test
	public void testIndex(){
		try {
			String result = new myController().index(null);
			assertEquals("index.jsp",result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	