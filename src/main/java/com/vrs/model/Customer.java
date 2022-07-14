/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.model;

/**
 *
 * @author Java Programming with Aldrin
 */
public class Customer extends Person {


    public Customer() {

    }

    public Customer(Integer id, String firstname, String middlename, String lastname, String gender, String contactNo, String homeAddress) {
        super(id, firstname, middlename, lastname);
        this.setGender(gender);
        this.setTelephone(contactNo);
        this.setAddress(homeAddress);
    }

    public Customer(String firstname, String middlename, String lastname, String gender, String contactNo, String homeAddress) {
        super(firstname, middlename, lastname);
        this.setGender(gender);
        this.setTelephone(contactNo);
        this.setAddress(homeAddress);
    }

}
