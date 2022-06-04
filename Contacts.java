package com.bridglabz.ab.workshop;

public class Contacts {

    String firstName, lastName, address, city ;
    int  phoneNumber;
    public Contacts(String firstName, String lastName, String address, String city,  int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    public String toString () {
        return "----------------------------------\n" +
                "FirstName  =  " + firstName +
                "\nLastName   =  " + lastName +
                "\nAddress    =  " + address +
                "\nCity       =  " + city +
                "\nNumber     =  " + phoneNumber +
                "\n-----------------------------------\n"
                ;
    }

}
