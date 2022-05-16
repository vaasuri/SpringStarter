package com.aasurihome.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	/**
	 * Auto-wiring feature of spring framework enables you to inject the object dependency implicitly.
	 */
	@Autowired
	private Messenger messenger;
	
	public void message() {
		messenger.post("Hello World!");
	}

}
