package com.bridgelabz.addressbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookAppApplication {

	public static final Logger logger = LoggerFactory.getLogger(AddressBookAppApplication.class);
	public static void main(String[] args) {
		logger.debug("Inside Address Book app main");
		SpringApplication.run(AddressBookAppApplication.class, args);
	}

}
