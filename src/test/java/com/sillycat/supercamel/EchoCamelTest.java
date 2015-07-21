package com.sillycat.supercamel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EchoCamelTest extends BaseTest {

	// @Autowired
	// ApplicationContext context;

	@Autowired
	CamelContext camelContext;

	@Test
	public void echoCamel() {
		try {
			camelContext.start();
			ProducerTemplate template = camelContext.createProducerTemplate();
			for (int i = 0; i < 5; i++) {
				template.sendBody("activemq:queue:start", "body" + i);
			}
			Thread.sleep(1000);
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
