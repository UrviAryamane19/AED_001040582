/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Urvi
 */
public class Main {
    
    @SuppressWarnings("null")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        VitalSigns vitalSigns = null;
        Patient patient = null;

        VitalSignsHistory vitalSignHistory = new VitalSignsHistory();
        
        int end = 1;
        do {
            System.out.println("***** Select your Choice *****");
            System.out.println("1.Enter the Vital Signs");
            System.out.println("2.View Current Vital Signs");
            System.out.println("3.View Vital Signs History");
            System.out.println("4.Check Vital Signs");
            System.out.println("5.Print Patient Report");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                
                case 1 -> {
                    System.out.println("Patient name : ");
                    String name = sc.nextLine();
                    
                    System.out.println("Patient age group : ");
                    String ageGroup = sc.nextLine();
                    
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
                    
                    long millisec = System.currentTimeMillis();
                    Date date = new java.util.Date(millisec);
                    
                    
                    vitalSigns = new VitalSigns(ageGroup, respiratoryRate, heartRate, systolicBloodPressure, weightKilos, weightPounds, name, date);
                    patient = new Patient(vitalSigns);
                    vitalSignHistory.addNewVitalSigns(vitalSigns);
                    System.out.println(name+"'s record created!");
                    
                    
                    if(patient.isPatientNormal() == true){
                        System.out.println(name+"'s reports are normal!");
                    }
                    else {
                        System.out.println(name+"'s reports are abnormal!!!");
                    }
                }
                        
                case 2 -> {
                    System.out.println("***** Current Vital Signs *****");
                    System.out.println(vitalSignHistory.getVitalSignHistory().get(vitalSignHistory.getVitalSignHistory().size()-1));
                }
                        
                case 3 -> {
                    System.out.println("***** Vital Signs History *****");
                    for(int i = 0; i < vitalSignHistory.getVitalSignHistory().size()-1; i++){
                        System.out.println(vitalSignHistory.getVitalSignHistory().get(i));
                    }
                }
                        
                case 4 -> {
                    System.out.println("Enter the Vital Sign to check");
                    String vSign = sc.nextLine();
                    if(patient.isVitalSignNormal(vSign) == true){
                        System.out.println("The "+vSign+ " is normal");
                    }
                    else
                        System.out.println("The "+vSign+ " is abnormal");
                }
                        
                case 5 -> {
                    System.out.println("********** Patient Report **********");
                    if(!patient.isVitalSignNormal("Respiratory Rate")) {
                        System.out.println("Abnormal Respiratory Rate");
                    }
                    else
                        System.out.println("Normal Respiratory Rate");
                    
                    if(!patient.isVitalSignNormal("Heart Rate")) {
                        System.out.println("Abnormal Heart Rate");
                    }
                    else
                        System.out.println("Normal Heart Rate");
                    
                    if(!patient.isVitalSignNormal("Systolic Blood Pressure")) {
                        System.out.println("Abnormal Systolic Blood Pressure");
                    }
                    else
                        System.out.println("Normal Systolic Blood Pressure");
                    
                    if(!patient.isVitalSignNormal("Weight in kilos")) {
                        System.out.println("Abnormal Weight(kilos)");
                    }
                    else
                        System.out.println("Normal Weight(in kilos)");
                    
                    if(!patient.isVitalSignNormal("Weight in pounds")) {
                        System.out.println("Abnormal Weight(pounds)");
                    }
                    else
                        System.out.println("Normal Weight(in pounds)");
                }
            
                    }
            System.out.println("Press 1(continue) OR 0(stop)");
            end = sc.nextInt();
            
            }while(end != 0);
        }
    }
 
