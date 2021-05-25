package com.bridgelabz.addressbook.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	@Autowired
	AddressBookRepository addressBookRepository;
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		log.debug("List of all address book data");
		return addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int eid) {
		log.debug("Get address book data by ID");
		return addressBookRepository.findById(eid)
									.orElseThrow(() -> new AddressBookException("Address Book with ID:" + eid + " Not Found!"));
	}

	@Override
	public AddressBookData addAddressBook(AddressBookDTO dto) {
		log.debug("Add entry : " + dto.toString());
		AddressBookData addressData = null;
		addressData = new AddressBookData(dto);
		return addressBookRepository.save(addressData);
	}

	@Override
	public AddressBookData updateAddressBook(int addressId,AddressBookDTO dto) {
		log.debug("Update address book data");
		AddressBookData addressData = getAddressBookDataById(addressId);
		addressData.updateAddressBookData(dto);
		return addressBookRepository.save(addressData);
	}

	@Override
	public void deleteAddressBook(int id) {
		addressBookRepository.deleteById(id);
	}

}
