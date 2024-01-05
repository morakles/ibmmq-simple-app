package eu.orangenotebook.ibmmq.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebEndpoint {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@GetMapping("send-message")
	public String sendMessage(){
	    try{
	        jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello World TYTYTYTTY!");
	        return "OK";
	    }catch(JmsException ex){
	        ex.printStackTrace();
	        return "Request failed";
	    }
	}
	
	
	@GetMapping("receive-message")
	public String receiveMessage(){
	    try{
	        return jmsTemplate.receiveAndConvert("DEV.QUEUE.1").toString();
	    }catch(JmsException ex){
	        ex.printStackTrace();
	        return "Request failed";
	    }
	}
}
