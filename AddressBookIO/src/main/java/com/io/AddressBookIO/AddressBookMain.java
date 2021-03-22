package com.io.AddressBookIO;

import  com.io.AddressBookIO.ContactDetails;


public class AddressBookMain 
{
    
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Address Book Program" );
        ContactDetails cd= new ContactDetails("bhaskar", "navuluri","H.No. 32", "nlr", "ap", 524004, "1234567890", "abc@gmail.com");
        System.out.println(cd);
    }
}
