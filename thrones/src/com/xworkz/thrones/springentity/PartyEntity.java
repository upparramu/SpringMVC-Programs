package com.xworkz.thrones.springentity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PartyEntity {

	public PartyEntity() {
		System.out.println("Running Default PartEntity Constructor");
	}
	@Bean
	public void drinkers() {
		System.out.println("drive carefully when you drink.....maga Artha maduko");
	}
	
	

}
