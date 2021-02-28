/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Urvi
 */
public class Encounter {
    
    private Date dateOfEncounter;
    private VitalSigns vitalSigns;
    
    private final static String Respiratory_Rate = "Respiratory Rate";
    private final static String Heart_Rate = "Heart Rate";
    private final static String Systolic_Blood_Pressure = "Systolic Blood Pressure";
    private final static String Weight_in_kilos = "Weight in kilos";
    private final static String Weight_in_pounds = "Weight in pounds";

    @Override
    public String toString() {
        return "Encounter{" + "dateOfEncounter=" + dateOfEncounter + ", vitalSigns=" + vitalSigns + '}';
    }

    public Encounter(Date dateOfEncounter, VitalSigns vitalSigns) {
        this.dateOfEncounter = dateOfEncounter;
        this.vitalSigns = vitalSigns;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getDateOfEncounter() {
        return dateOfEncounter;
    }

    public void setDateOfEncounter(Date dateOfEncounter) {
        this.dateOfEncounter = dateOfEncounter;
    }
    
    public boolean isPatientNormal() {
       
        /**
         * Newborn data
         */
        if("Newborn".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vitalSigns.getRespiratoryRate() >= 30.0 && vitalSigns.getRespiratoryRate() <= 50.0) {
                if(vitalSigns.getHeartRate() >= 120.0 && vitalSigns.getHeartRate() <= 160.0) {
                    if(vitalSigns.getSystolicBloodPressure() >= 50.0 && vitalSigns.getSystolicBloodPressure() <= 70.0) {
                        if(vitalSigns.getWeightInKilos() >= 2.0 && vitalSigns.getWeightInKilos() <= 3.0) {
                            if(vitalSigns.getWeightInPounds() >= 4.5 && vitalSigns.getWeightInPounds() <= 7.0) {
                                return true;
                            }
                        }
                    }
                }
            }     
        } 
        
        /**
         * Infant data (1 -12 months)
         */
        if("Infant".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 140.0) {
                    if(vitalSigns.getSystolicBloodPressure() >= 70.0 && vitalSigns.getSystolicBloodPressure() <= 100.0) {
                        if(vitalSigns.getWeightInKilos() >= 4.0 && vitalSigns.getWeightInKilos() <= 10.0) {
                            if(vitalSigns.getWeightInPounds() >= 9.0 && vitalSigns.getWeightInPounds() <= 22.0) {
                                return true;
                            }
                        }
                    }
                }
            }     
        } 
        
        /**
         * Toddler data (1-3 years)
         */
        if("Toddler".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 130.0) {
                    if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 110.0) {
                        if(vitalSigns.getWeightInKilos() >= 10.0 && vitalSigns.getWeightInKilos() <= 14.0) {
                            if(vitalSigns.getWeightInPounds() >= 22.0 && vitalSigns.getWeightInPounds() <= 31.0) {
                                return true;
                            }
                        }
                    }
                }
            }     
        } 
        
        /**
         * Preschooler data (3-5 years)
         */
        if("Preschooler".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 120.0) {
                    if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 110.0) {
                        if(vitalSigns.getWeightInKilos() >= 14.0 && vitalSigns.getWeightInKilos() <= 18.0) {
                            if(vitalSigns.getWeightInPounds() >= 31.0 && vitalSigns.getWeightInPounds() <= 40.0) {
                                return true;
                            }
                        }
                    }
                }
            }     
        } 
        
        /**
         * School Age data (6-12 years)
         */
        if("School Age".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                if(vitalSigns.getHeartRate() >= 70.0 && vitalSigns.getHeartRate() <= 110.0) {
                    if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 120.0) {
                        if(vitalSigns.getWeightInKilos() >= 20.0 && vitalSigns.getWeightInKilos() <= 42.0) {
                            if(vitalSigns.getWeightInPounds() >= 41.0 && vitalSigns.getWeightInPounds() <= 92.0) {
                                return true;
                            }
                        }
                    }
                }
            }     
        } 
        
        /**
         * Adolescent data (13+ years)
         */
        if("Adolescent".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vitalSigns.getRespiratoryRate() >= 12.0 && vitalSigns.getRespiratoryRate() <= 20.0) {
                if(vitalSigns.getHeartRate() >= 55.0 && vitalSigns.getHeartRate() <= 105.0) {
                    if(vitalSigns.getSystolicBloodPressure() >= 110.0 && vitalSigns.getSystolicBloodPressure() <= 120.0) {
                        if(vitalSigns.getWeightInKilos() > 50.0) {
                            if(vitalSigns.getWeightInPounds() > 110.0) {
                                return true;
                            }
                        }
                    }
                }
            }     
        } 
        
        return false;
    }
    
    public boolean isVitalSignNormal(String vsign) {
        if("Newborn".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vsign.equalsIgnoreCase(Respiratory_Rate)) {
                if(vitalSigns.getRespiratoryRate() >= 30.0 && vitalSigns.getRespiratoryRate() <= 50.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Heart_Rate)) {
                if(vitalSigns.getHeartRate() >= 120.0 && vitalSigns.getHeartRate() <= 160.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Systolic_Blood_Pressure)) {
                if(vitalSigns.getSystolicBloodPressure() >= 50.0 && vitalSigns.getSystolicBloodPressure() <= 70.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_kilos)) {
                if(vitalSigns.getWeightInKilos() >= 2.0 && vitalSigns.getWeightInKilos() <= 3.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_pounds)) {
                if(vitalSigns.getWeightInPounds() >= 4.5 && vitalSigns.getWeightInPounds() <= 7.0) {
                    return true;
                }
            }
        }
        
        if("Infant".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vsign.equalsIgnoreCase(Respiratory_Rate)) {
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Heart_Rate)) {
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 140.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Systolic_Blood_Pressure)) {
                if(vitalSigns.getSystolicBloodPressure() >= 70.0 && vitalSigns.getSystolicBloodPressure() <= 100.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_kilos)) {
                if(vitalSigns.getWeightInKilos() >= 4.0 && vitalSigns.getWeightInKilos() <= 10.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_pounds)) {
                if(vitalSigns.getWeightInPounds() >= 9.0 && vitalSigns.getWeightInPounds() <= 22.0) {
                    return true;
                }
            }
        }
        
        if("Toddler".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vsign.equalsIgnoreCase(Respiratory_Rate)) {
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Heart_Rate)) {
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 130.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Systolic_Blood_Pressure)) {
                if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 110.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_kilos)) {
                if(vitalSigns.getWeightInKilos() >= 10.0 && vitalSigns.getWeightInKilos() <= 14.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_pounds)) {
                if(vitalSigns.getWeightInPounds() >= 22.0 && vitalSigns.getWeightInPounds() <= 31.0) {
                    return true;
                }
            }
        }
        
        if("Preschooler".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vsign.equalsIgnoreCase(Respiratory_Rate)) {
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Heart_Rate)) {
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 120.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Systolic_Blood_Pressure)) {
                if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 110.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_kilos)) {
                if(vitalSigns.getWeightInKilos() >= 14.0 && vitalSigns.getWeightInKilos() <= 18.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_pounds)) {
                if(vitalSigns.getWeightInPounds() >= 31.0 && vitalSigns.getWeightInPounds() <= 40.0) {
                    return true;
                }
            }
        }
        
        if("School Age".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vsign.equalsIgnoreCase(Respiratory_Rate)) {
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Heart_Rate)) {
                if(vitalSigns.getHeartRate() >= 70.0 && vitalSigns.getHeartRate() <= 110.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Systolic_Blood_Pressure)) {
                if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 120.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_kilos)) {
                if(vitalSigns.getWeightInKilos() >= 20.0 && vitalSigns.getWeightInKilos() <= 42.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_pounds)) {
                if(vitalSigns.getWeightInPounds() >= 41.0 && vitalSigns.getWeightInPounds() <= 92.0) {
                    return true;
                }
            }
        }
        
        if("Adolescent".equalsIgnoreCase(vitalSigns.getAgeGroup())) {
            if(vsign.equalsIgnoreCase(Respiratory_Rate)) {
                if(vitalSigns.getRespiratoryRate() >= 12.0 && vitalSigns.getRespiratoryRate() <= 20.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Heart_Rate)) {
                if(vitalSigns.getHeartRate() >= 55.0 && vitalSigns.getHeartRate() <= 105.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Systolic_Blood_Pressure)) {
                if(vitalSigns.getSystolicBloodPressure() >= 110.0 && vitalSigns.getSystolicBloodPressure() <= 120.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_kilos)) {
                if(vitalSigns.getWeightInKilos() > 50.0) {
                    return true;
                }
            }
            
            if(vsign.equalsIgnoreCase(Weight_in_pounds)) {
                if(vitalSigns.getWeightInPounds() > 110) {
                    return true;
                }
            }
        }     
        return false;
    }     
}
