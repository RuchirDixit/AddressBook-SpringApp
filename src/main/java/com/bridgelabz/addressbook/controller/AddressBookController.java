package com.bridgelabz.addressbook.controller;

import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;


@RestController
@RequestMapping("/address")
public class AddressBookController {

	public static final Logger logger = LoggerFactory.getLogger(AddressBookController.class);
	AtomicInteger id = new AtomicInteger(0);
	
	@RequestMapping(value = {"","/"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData addressData = new AddressBookData(1, new AddressBookDTO("Ruchir","Pune"));
		ResponseDTO responseDTO = new ResponseDTO("Get all Address Book Response",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBook(@RequestBody AddressBookDTO dto){
		AddressBookData addressData = new AddressBookData(id.incrementAndGet(),dto);
		ResponseDTO responseDTO = new ResponseDTO("Created Address Book",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBook(@RequestBody AddressBookDTO dto){
		AddressBookData addressData = new AddressBookData(id.incrementAndGet(),dto);
		ResponseDTO responseDTO = new ResponseDTO("Address Updated",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBook(@PathVariable long id){
		ResponseDTO responseDTO = new ResponseDTO("Address Deleted","Deleted id : " + id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
}
