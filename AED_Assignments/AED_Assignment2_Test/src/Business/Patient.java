/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Urvi
 */
public class Patient extends Person {
    
    EncounterHistory encounterHistory;

    public Patient(EncounterHistory encounterHistory, String name, int patientID, int houseNumber, String aptName, String streetName, String cityName, int zipCode, int age, String mobileNo){
        super(name, patientID, houseNumber, aptName, streetName, cityName, zipCode, age, mobileNo);
        this.encounterHistory = encounterHistory;
    }
}
