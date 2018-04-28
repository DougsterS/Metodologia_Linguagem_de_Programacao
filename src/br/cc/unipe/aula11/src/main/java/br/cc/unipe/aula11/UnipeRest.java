package br.cc.unipe.aula11;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class UnipeRest {
	
	    @RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "Hello World!";
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(UnipeRest.class, args);
	    }
	}