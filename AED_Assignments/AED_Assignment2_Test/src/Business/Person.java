/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Urvi
 */
public class Person {
    
    private String name;
    private int patientID;
    private int houseNumber;
    private String aptName;
    private String streetName;
    private String cityName;
    private int zipCode;
    private int age;
    private String mobileNo;
    private Patient patient;
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", patientID=" + patientID + ", houseNumber=" + houseNumber + ", aptName=" + aptName + ", streetName=" + streetName + ", cityName=" + cityName + ", zipCode=" + zipCode + ", age=" + age + ", mobileNo=" + mobileNo + '}';
    }

    public Person(String name, int patientID, int houseNumber, String aptName, String streetName, String cityName, int zipCode, int age, String mobileNo) {
        this.name = name;
        this.patientID = patientID;
        this.houseNumber = houseNumber;
        this.aptName = aptName;
        this.streetName = streetName;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAptName() {
        return aptName;
    }

    public void setAptName(String aptName) {
        this.aptName = aptName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    
    
    
    
}
