/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.model;

import java.io.File;

/**
 *
 * @author Java Programming with Aldrin
 */
public class Driver extends Customer {

    private String licenseNo;
    private File licensePhoto;

    public Driver() {
    }

    /**
     * @return the licenseNo
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo the licenseNo to set
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

//     public Customer(Integer id, String firstname, String middlename,String lastname, String gender,String contactNo,String homeAddress){
    public Driver(Integer id, String licenseNo, String firstname, String middlename, String lastname, String gender, String contactNo, String address,File licensePhoto) {
        super(id, firstname, middlename, lastname, gender, contactNo, address);
        this.setLicenseNo(licenseNo);
    }

    public Driver(String licenseNo, String firstname, String middlename, String lastname, String gender, String contactNo, String address,File licensePhoto) {
        super(firstname, middlename, lastname, gender, contactNo, address);
        this.setLicenseNo(licenseNo);
    }

    /**
     * @return the licensePhoto
     */
    public File getLicensePhoto() {
        return licensePhoto;
    }

    /**
     * @param licensePhoto the licensePhoto to set
     */
    public void setLicensePhoto(File licensePhoto) {
        this.licensePhoto = licensePhoto;
    }

}
