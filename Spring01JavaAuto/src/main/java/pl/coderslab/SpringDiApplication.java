package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.beans.Auto2;
import pl.coderslab.configuration.AppConfig;

public class SpringDiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =

				new AnnotationConfigApplicationContext(AppConfig.class);
		
			
		Auto2 auto2 = context.getBean("auto2", Auto2.class);
		System.out.println(auto2.getAuto1().getClass().getName());
		
		context.close();
		
		
	}

}
