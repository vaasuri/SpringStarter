package com.aasurihome.springstarter;

import org.springframework.stereotype.Component;

@Component
public class Messenger {
	
	public void post(String m) {
		System.out.println(m);
	}
}
