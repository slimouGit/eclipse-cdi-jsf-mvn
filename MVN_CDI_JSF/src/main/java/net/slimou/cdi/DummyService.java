package net.slimou.cdi;

import javax.ejb.Stateless;

@Stateless
public class DummyService {
	
	public String greetingsFromService(){
		return "Hello Facelets";
	}

}