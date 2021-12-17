package com.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
Steps to add encryption for password in configuration file:
#1. add dependency in pom.xml for jasypt
#1a. Add below anno to app main class
@EnableEncryptableProperties
#2. encryption the password online or command line giving a key
#3. in application.properties specify password value as ENC('ecrypted-pwd')
#4. Run application usign below command line argument using same key given in step 2 as command line
 Use below command line
 mvn -Djasypt.encryptor.password=secretkey spring-boot:run
 
 NOTE: secretkey used is hello
 * */
