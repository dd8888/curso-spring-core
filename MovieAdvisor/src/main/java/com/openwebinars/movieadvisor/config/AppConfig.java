package com.openwebinars.movieadvisor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.openwebinars.movieadvisor")
@PropertySource("classpath:/movieadvisor.properties")
public class AppConfig {

	@Value("${file.path}")
	private String file;
	
	@Value("${file.csv.separator}")
	private String separator;
	
	@Value("${file.csv.list_separator}")
	private	 String list_separator;

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public String getList_separator() {
		return list_separator;
	}

	public void setList_separator(String list_separator) {
		this.list_separator = list_separator;
	}
	
	
}
