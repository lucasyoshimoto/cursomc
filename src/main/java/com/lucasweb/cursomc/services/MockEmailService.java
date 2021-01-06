package com.lucasweb.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService {

	private static final Logger lOG = LoggerFactory.getLogger(MockEmailService.class);

	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		lOG.info("Simulando envio de email...");
		lOG.info(msg.toString());
		lOG.info("Email enviado");
	}


	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		lOG.info("Simulando envio de email...");
		lOG.info(msg.toString());
		lOG.info("Email enviado");
		
	}
}
