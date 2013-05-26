package com.evolvus.examples.camel.fileOne;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class App {
	public static void main(String[] args) throws Exception {
		final String sourceFolder = "file:data/inbox";
		final String destinationFolder = "file:data/outbox";

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new RouteBuilder() {
			public void configure() {
				from(sourceFolder).to(destinationFolder);
			}
		});

		camelContext.start();
		Thread.sleep(30000);
		camelContext.stop();

		System.out.println("camel route executed!");
	}
}
