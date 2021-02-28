/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Urvi
 */
public class main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        VitalSigns vitalSigns = null;
        Patient patient = null;        
        
        Encounter encounter = null;
        House house = null;
        EncounterHistory encounterHistory = new EncounterHistory();
        Community community = new Community();
        City city = new City();
        Person person = null;
        
        PatientDirectory patientDirectory = new PatientDirectory();
        PersonDirectory personDirectory = new PersonDirectory();
        ArrayList<Encounter> vitalList = new ArrayList<>();
        ArrayList<Patient> currentPatient = new ArrayList<>();
        ArrayList<Encounter> currentEncounter = new ArrayList<>();
        ArrayList<Encounter> reportList = new ArrayList<>();
        
        int end = 1;
        do {
            System.out.println("***** Select your Choice *****");
            System.out.println("1.Enter Patient Information");
            System.out.println("2.View Current Visit Information");
            System.out.println("3.View Encounter History");
            System.out.println("4.Check Vital Signs");
            System.out.println("5.Print Patient Report");
            System.out.println("6.Check Community with abnormal Systolic Blood Pressure");
            System.out.println("--------------------------------");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                
                case 1 -> {
                    int count = 0;
                    System.out.println("********** Personal Information **********");
                    System.out.println("Patient name : ");
                    String name = sc.nextLine();
                    
                    System.out.println("Patient ID : ");
                    int patientID = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Patient Age : ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Mobile Number : ");
                    String mobileNo = sc.nextLine();
                    if(mobileNo.length() != 10){
                        System.out.println("Please enter 10 digit mobile number");
                        break;
                    }
                    
                    System.out.println("Patient age group : ");
                    String ageGroup = sc.nextLine();
                    
                    System.out.println("******************************************");
                    
                    System.out.println("********** Address **********");
                    System.out.println("House Number : ");
                    int houseNumber = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Apartment Name : ");
                    String aptName = sc.nextLine();
                    
                    System.out.println("Street Name : ");
                    String streetName = sc.nextLine();
                    
                    System.out.println("City : ");
                    String cityName = sc.nextLine();
                    
                    System.out.println("Zipcode : ");
                    int zipCode = sc.nextInt();
                    while(zipCode != 0){
                        zipCode /= 10;
                        ++count;
                    }
                    if(count != 5){
                        System.out.println("Please enter 5 digit Zip Code");
                        break;
                    }
                    sc.nextLine();
                    System.out.println("*********************************");
                    
                    System.out.println("********** Vital Signs **********");
                    System.out.println("Respiratory rate : ");
                    double respiratoryRate = sc.nextDouble();
                    
                    System.out.println("Heart rate : ");
                    double heartRate = sc.nextDouble();
                    
                    System.out.println("Systolic Blood Pressure : ");
                    double systolicBloodPressure = sc.nextDouble();
                    
                    System.out.println("Weight(in kilos) : ");
                    double weightKilos = sc.nextDouble();
                    
                    System.out.println("Weight(in pounds) : ");
                    double weightPounds = sc.nextDouble();
                    System.out.println("*********************************");
                    
                    long millisec = System.currentTimeMillis();
                    Date date = new java.util.Date(millisec);
                    
                    
                    vitalSigns = new VitalSigns(ageGroup, respiratoryRate, heartRate, systolicBloodPressure, weightKilos, weightPounds);
                    encounter = new Encounter(date, vitalSigns);
                    encounterHistory.addNewEncounter(encounter);
                    patient = new Patient(encounterHistory, name, patientID, houseNumber, aptName, streetName, cityName, zipCode, age, mobileNo);
                    patientDirectory.addPatient(patient);
                    personDirectory.addNewPerson(patient);
                    house = new House(patient);
                    community.addHouse(house);
                    city.addCommunity(community);
                    System.out.println(name+"'s record created!");
                    
                    
                    if(encounter.isPatientNormal() == true){
                        System.out.println(name+"'s reports are normal!");
                        System.out.println("*********************************");
                    }
                    else {
                        System.out.println(name+"'s reports are abnormal!!!");
                        System.out.println("*********************************");
                    }
                    break;
                }
                
                case 2 -> {
                    System.out.println("Enter the Patient name: ");
                    String pname = sc.nextLine();
                    for(int i = 0; i < patientDirectory.getpatientDirectory().size(); i++){
                        Patient p = patientDirectory.getpatientDirectory().get(i);
                        if(pname.equalsIgnoreCase(p.getName())){
                            currentPatient.add(patientDirectory.getpatientDirectory().get(i));
                            currentEncounter.add(encounterHistory.getEncounterHistory().get(i));
                        }
                    }
                    System.out.println(currentPatient.get(currentPatient.size() - 1));
                    System.out.println(currentEncounter.get(currentEncounter.size() - 1));
                    System.out.println("****************************************************************************");
                    break;
                }
                
                case 3 -> {
                    if(encounterHistory.getEncounterHistory().isEmpty()){
                        System.out.println("Please enter the information!!!");
                        break;
                    }
                    System.out.println("Enter the Patient name: ");
                    String pname = sc.nextLine();
                    for(int i = 0; i < patientDirectory.getpatientDirectory().size(); i++){
                        Patient p = patientDirectory.getpatientDirectory().get(i);
                        if(pname.equalsIgnoreCase(p.getName())){
                            System.out.println(encounterHistory.getEncounterHistory().get(i));
                            System.out.println("*********************************************************************");
                        }
                    }
                    break;
                }
                
                case 4 -> {
                    System.out.println("Enter the Patient name: ");
                    String pname = sc.nextLine();
                    System.out.println("Enter the Visit date and time: ");
                    String visitDate = sc.nextLine();
                    System.out.println("Enter the Vital Sign to check:");
                    String vSign = sc.nextLine();
                    for(int i = 0; i < patientDirectory.getpatientDirectory().size(); i++){
                        Patient p = patientDirectory.getpatientDirectory().get(i);
                        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
                        
                        String strDate = dateFormat.format(encounterHistory.getEncounterHistory().get(i).getDateOfEncounter());
                        if(pname.equalsIgnoreCase(p.getName()) && visitDate.equalsIgnoreCase(strDate)){
                            vitalList.add(encounterHistory.getEncounterHistory().get(i));
                        }
                    }
                    if(vitalList.get(0).isVitalSignNormal(vSign)){
                        System.out.println("The "+vSign+ " is normal");
                        System.out.println("*********************************");
                    }
                    else
                        System.out.println("The "+vSign+ " is abnormal");
                        System.out.println("*********************************");
                    break;
                }
                        
                case 5 -> {
                    System.out.println("Enter the Patient name: ");
                    String pname = sc.nextLine();
                    System.out.println("Enter the Visit date and time: ");
                    String visitDate = sc.nextLine();
                    System.out.println("********** Report for  "+pname +"**********");
                    for(int i = 0; i < patientDirectory.getpatientDirectory().size(); i++){
                        Patient p = patientDirectory.getpatientDirectory().get(i);
                        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
                        
                        String strDate = dateFormat.format(encounterHistory.getEncounterHistory().get(i).getDateOfEncounter()); 
                        if(pname.equalsIgnoreCase(p.getName()) && visitDate.equalsIgnoreCase(strDate)){
                            reportList.add(encounterHistory.getEncounterHistory().get(i));
                        }
                    }       
                        if(!reportList.get(0).isVitalSignNormal("Respiratory Rate")) {
                            System.out.println("Abnormal Respiratory Rate");
                        }
                        else
                            System.out.println("Normal Respiratory Rate");
                    
                        if(!reportList.get(0).isVitalSignNormal("Heart Rate")) {
                            System.out.println("Abnormal Heart Rate");
                        }
                        else
                            System.out.println("Normal Heart Rate");
                    
                        if(!reportList.get(0).isVitalSignNormal("Systolic Blood Pressure")) {
                            System.out.println("Abnormal Systolic Blood Pressure");
                        }
                        else
                            System.out.println("Normal Systolic Blood Pressure");
                    
                        if(!reportList.get(0).isVitalSignNormal("Weight in kilos")) {
                            System.out.println("Abnormal Weight(kilos)");
                        }
                        else
                            System.out.println("Normal Weight(in kilos)");
                    
                        if(!reportList.get(0).isVitalSignNormal("Weight in pounds")) {
                            System.out.println("Abnormal Weight(pounds)");
                        }
                        else
                            System.out.println("Normal Weight(in pounds)"); 
                        
                    System.out.println("*********************************");
                    
                    break;
                }
                
                case 6 ->{
                    System.out.println("Enter the Street Name: ");
                    String streetArea = sc.nextLine();
                    int countPeople = 0;
                    int totalPeople = 0;
                    for(int i = 0; i < patientDirectory.getpatientDirectory().size(); i++){
                        Patient p = patientDirectory.getpatientDirectory().get(i);
                        if(streetArea.equalsIgnoreCase(p.getStreetName())){
                            totalPeople++;
                            if(!p.encounterHistory.getEncounterHistory().get(i).isVitalSignNormal("Systolic Blood Pressure")){
                                countPeople++;
                            }
                        }
                    }
                    System.out.println("Total number of people in "+streetArea +" is "+totalPeople);
                    System.out.println("Total number of abnormal people in "+streetArea +" is "+countPeople); 
                    System.out.println("*********************************");
                    break;
                }
                
            }      
            System.out.println("Press 1(continue) OR 0(stop)");
            end = sc.nextInt();
        }while(end != 0);
    }     
}
