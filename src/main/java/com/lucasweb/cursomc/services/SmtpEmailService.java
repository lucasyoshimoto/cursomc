package com.lucasweb.cursomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SmtpEmailService extends AbstractEmailService {
	
	@Autowired
	private MailSender mailSender;

	private static final Logger lOG = LoggerFactory.getLogger(SmtpEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		lOG.info("Enviando email...");
		mailSender.send(msg);
		lOG.info("Email enviado");
		
	}

}
