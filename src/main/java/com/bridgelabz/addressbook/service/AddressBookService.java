package com.bridgelabz.addressbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	public static final Logger logger = LoggerFactory.getLogger(AddressBookService.class);
	List<AddressBookData> addressDatas = new ArrayList<AddressBookData>();
	AtomicInteger id = new AtomicInteger(0);
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressDatas;
	}

	@Override
	public AddressBookData getAddressBookDataById(int eid) {
		return addressDatas.get(eid-1);
	}

	@Override
	public AddressBookData addAddressBook(AddressBookDTO dto) {
		AddressBookData addressData = null;
		addressData = new AddressBookData(id.incrementAndGet(), dto);
		addressDatas.add(addressData);
		return addressData;
	}

	@Override
	public AddressBookData updateAddressBook(int addressId,AddressBookDTO dto) {
		AddressBookData addressData = getAddressBookDataById(addressId);
		addressData.setName(dto.getName());
		addressData.setAddress(dto.getAddress());
		addressDatas.set(addressId-1, addressData);
		return addressData;
	}

	@Override
	public void deleteAddressBook(long id) {
		addressDatas.remove(id);
		
	}

}
