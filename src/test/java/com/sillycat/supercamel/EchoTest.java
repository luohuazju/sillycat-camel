package com.sillycat.supercamel;

import org.junit.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class EchoTest extends BaseTest{

	@Autowired  
    @Qualifier("testBean")  
    private TestBean testBean;  
	
	@Test
	public void echo(){
		Assert.assertEquals(testBean.hello("Carl"),"Howdy,Carl");
	}
	
}
