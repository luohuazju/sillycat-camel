package com.sillycat.supercamel;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/test/resources/mail-test-context.xml" })
public class MailCamelTest extends TestCase {

	@Autowired
	CamelContext camelContext;

	@Test
	public void echoCamel() {
		try {
			camelContext.start();
			Thread.sleep(2 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				camelContext.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
