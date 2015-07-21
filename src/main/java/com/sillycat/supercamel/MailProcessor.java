package com.sillycat.supercamel;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MailProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody("HeartBeat3 " + new Date());
	}

}