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
	AtomicInteger id = new AtomicInteger(0);
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> employeePayrollDatas = new ArrayList<AddressBookData>();
		employeePayrollDatas.add(new AddressBookData(id.incrementAndGet(), new AddressBookDTO("Harvey", "Manhattan")));
		return employeePayrollDatas;
	}

	@Override
	public AddressBookData getAddressBookDataById(long eid) {
		AddressBookData addressData = null;
		addressData = new AddressBookData(id.incrementAndGet(), new AddressBookDTO("Mike Ross", "NYC"));
		return addressData;
	}

	@Override
	public AddressBookData addAddressBook(AddressBookDTO dto) {
		AddressBookData addressData = null;
		addressData = new AddressBookData(id.incrementAndGet(), dto);
		return addressData;
	}

	@Override
	public AddressBookData updateAddressBook(AddressBookDTO dto) {
		AddressBookData addressData = null;
		addressData = new AddressBookData(id.incrementAndGet(), dto);
		return addressData;
	}

	@Override
	public void deleteAddressBook(long id) {
		logger.debug("Inside service delete");
		
	}

}
