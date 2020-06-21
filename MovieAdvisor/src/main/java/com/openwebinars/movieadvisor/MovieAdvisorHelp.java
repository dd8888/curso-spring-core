package com.openwebinars.movieadvisor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class MovieAdvisorHelp {
	
	private String help;
	
	@PostConstruct
	public void init() {
		try {
			help = Files.lines(Paths.get(ResourceUtils.getFile("classpath:ayuda.txt").toURI()))
					.collect(Collectors.joining("\n"));
		}catch(Exception e) {
			System.err.println("Error cargando el archivo de ayuda");
			System.exit(-1);
		}
	}

	public String getHelp() {
		return help;
	}
}
