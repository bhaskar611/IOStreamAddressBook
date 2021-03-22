package com.io.AddressBookIO;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.io.AddressBookIO.*;;

/**
 * Unit test for AddressBook.
 */
public class AddressBookTest {
	AddressBookMain addressBook;

	@Before
	public void init() {
		addressBook = AddressBookMain.getAddressBook();
		addressBook.addContactDetails(AddressBookMain.getContactDetails());
	}

	@Test
	public void writeToFileTest() {
		assertTrue(FileOperations.createDirectory("C:", "C:/IO"));
		assertTrue(FileOperations.createFile("C:/IO", "C:/IO/IO.txt"));
		assertTrue(addressBook.writeToFile("C:/IO/IO.txt"));
	}

	@Test
	public void readFromFileTest() {
		assertTrue(FileOperations.createDirectory("C:", "C:/IO"));
		assertTrue(FileOperations.createFile("C:/IO", "C:/IO/IO.txt"));
		assertTrue(addressBook.writeToFile("C:/IO/IO.txt"));
		assertNotNull(addressBook.readFromFile("C:/IO/IO.txt"));
	}


}