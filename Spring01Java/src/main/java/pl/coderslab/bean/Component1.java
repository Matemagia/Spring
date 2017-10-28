package pl.coderslab.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component1 {
	Component2 component;
	
	@Autowired
	public void setComponent(Component2 component) {
		this.component = component;
		
	}
	public String getOi() {
		return component.getOi();
	}
	}