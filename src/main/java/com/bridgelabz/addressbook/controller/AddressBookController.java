package com.bridgelabz.addressbook.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.service.IAddressBookService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/address")
@Slf4j
public class AddressBookController {

	
	@Autowired
	IAddressBookService addressBookService;
	
	@RequestMapping(value = {"","/"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		log.debug("Inside get controller");
		List<AddressBookData> addressData = addressBookService.getAddressBookData();
		ResponseDTO responseDTO = new ResponseDTO("Get all Address Book Response",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable int id){
		log.debug("Inside get controller");
		AddressBookData addressData = addressBookService.getAddressBookDataById(id);
		ResponseDTO responseDTO = new ResponseDTO("Get all Address Book Response",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBook(@Valid @RequestBody AddressBookDTO dto){
		log.debug("Inside create controller");
		AddressBookData addressData = addressBookService.addAddressBook(dto);
		ResponseDTO responseDTO = new ResponseDTO("Created Address Book",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBook(@RequestParam("id") int id,@Valid @RequestBody AddressBookDTO dto){
		log.debug("Inside update controller");
		AddressBookData addressData = addressBookService.updateAddressBook(id,dto);
		ResponseDTO responseDTO = new ResponseDTO("Address Updated",addressData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBook(@PathVariable int id){
		log.debug("Inside delete controller");
		addressBookService.deleteAddressBook(id);
		ResponseDTO responseDTO = new ResponseDTO("Address Deleted","Deleted id : " + id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);	
	}
}
