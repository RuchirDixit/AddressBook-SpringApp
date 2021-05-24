package com.bridgelabz.addressbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	List<AddressBookData> addressDatas = new ArrayList<AddressBookData>();
	AtomicInteger id = new AtomicInteger(0);
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		log.debug("List of all address book data");
		return addressDatas;
	}

	@Override
	public AddressBookData getAddressBookDataById(int eid) {
		log.debug("Get address book data by ID");
		return addressDatas.get(eid-1);
	}

	@Override
	public AddressBookData addAddressBook(AddressBookDTO dto) {
		log.debug("Add entry");
		AddressBookData addressData = null;
		addressData = new AddressBookData(id.incrementAndGet(), dto);
		addressDatas.add(addressData);
		return addressData;
	}

	@Override
	public AddressBookData updateAddressBook(int addressId,AddressBookDTO dto) {
		log.debug("Update address book data");
		AddressBookData addressData = getAddressBookDataById(addressId);
		addressData.setName(dto.getName());
		addressData.setAddress(dto.getAddress());
		addressDatas.set(addressId-1, addressData);
		return addressData;
	}

	@Override
	public void deleteAddressBook(int id) {
		log.debug("Delete address book data by id");
		addressDatas.remove(id-1);
	}

}
