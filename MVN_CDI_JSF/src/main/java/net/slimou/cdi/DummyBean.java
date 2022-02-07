package net.slimou.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class DummyBean {
	
	@Inject
	private DummyService dummyService;
	
	private String projectName = "Dummy Maven-CDI-JSF-Project";
	private String helloFromService;
	
	public void greetingToService(){
		System.out.println("Hello Service");
		System.out.println(this.dummyService.greetingsFromService());
		this.helloFromService = this.dummyService.greetingsFromService();
	}


	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getHelloFromService() {
		return helloFromService;
	}


	public void setHelloFromService(String helloFromService) {
		this.helloFromService = helloFromService;
	}

	
		
		

}

