package com.ibm;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner {

	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;
	
	
	public void send(String msg)
	{
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}
	
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub

		send("Text message from Producer");
		
		System.out.println("Message was sent to the queue-------------------");
	}

}
