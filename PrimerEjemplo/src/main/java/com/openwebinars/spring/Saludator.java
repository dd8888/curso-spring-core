package com.openwebinars.spring;

public class Saludator {
	private String mensaje;
	

	public String saludo(){
		return (mensaje == null) ? "Hola Mundo!!!" : mensaje;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
