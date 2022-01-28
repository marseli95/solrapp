package com.demo.solrceli;

import com.demo.solrceli.service.ProcessData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@EnableSolrRepositories("com.demo.solrceli.repository")
public class SolrceliApplication {

	@Autowired
	ProcessData processData ;
	
	public static void main(String[] args) {

		//ConfigurableApplicationContext context =SpringApplication.run(SolrceliApplication.class, args);
//		ProcessData processData = context.getBean(ProcessData.class);
//		processData.docData();
	}
	
	public void run(String... args) {
		System.out.println("Application start ...");
		processData.docData();
		System.out.println("Application end ...");

	}
	
	

}
