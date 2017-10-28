package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.MessageSender;
import pl.coderslab.configuration.AppConfig;

/**
 * Hello world!
 *
 */
public class App {
    
    	public static void main(String[] args) {
    		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    		HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
    		obj.getMessage();
    		
//    		ClassPathXmlApplicationContext context =
//
//    		new ClassPathXmlApplicationContext("beans.xml");
//
//    		//HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//    		//obj.getMessage();
//    		
//    		MessageSender sender =				context.getBean("messageSender"
//
//    				, MessageSender.class);
//
//    				sender.sendMessage();
//    		
//    		context.close();
//
    		}
 }

