package com.openwebinars.spring;

public class EmailService {

	private Saludator saludator;

	public Saludator getSaludator() {
		return saludator;
	}

	public void setSaludator(Saludator saludator) {
		this.saludator = saludator;
	}
	
	public void enviarEmailSaludo(String destinatario) {
		System.out.println("Enviando email a " + destinatario);
		System.out.println("Mensaje: " + saludator.getMensaje());
	}
	
}
