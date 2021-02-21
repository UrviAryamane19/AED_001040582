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
public class Patient {
    VitalSigns vitalSigns; 
    
    private final String Respiratory_Rate = "Respiratory Rate";
    private final String Heart_Rate = "Heart Rate";
    private final String Systolic_Blood_Pressure = "Systolic Blood Pressure";
    private final String Weight_in_kilos = "Weight in kilos";
    private final String Weight_in_pounds = "Weight in pounds";
    
    public Patient(VitalSigns vitalSigns){
        this.vitalSigns = vitalSigns;
    }
    
    public boolean isPatientNormal() {
        if("Newborn".equals(vitalSigns.getAgeGroup())){
            if(vitalSigns.getRespiratoryRate() >= 30.0 && vitalSigns.getRespiratoryRate() <= 50.0){
                if(vitalSigns.getHeartRate() >= 120.0 && vitalSigns.getHeartRate() <= 160.0){
                    if(vitalSigns.getSystolicBloodPressure() >= 50 && vitalSigns.getSystolicBloodPressure() <= 70){
                        if(vitalSigns.getWeightKilos() >= 2 && vitalSigns.getWeightKilos() <= 3){
                            if(vitalSigns.getWeightPounds() >= 4.5 && vitalSigns.getWeightPounds() <= 7){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        
        if("Infant".equals(vitalSigns.getAgeGroup())){
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 140.0){
                    if(vitalSigns.getSystolicBloodPressure() >= 70 && vitalSigns.getSystolicBloodPressure() <= 100){
                        if(vitalSigns.getWeightKilos() >= 4 && vitalSigns.getWeightKilos() <= 10){
                            if(vitalSigns.getWeightPounds() >= 9 && vitalSigns.getWeightPounds() <= 22){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        
        if("Toddler".equals(vitalSigns.getAgeGroup())){
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 130.0){
                    if(vitalSigns.getSystolicBloodPressure() >= 80 && vitalSigns.getSystolicBloodPressure() <= 110){
                        if(vitalSigns.getWeightKilos() >= 10 && vitalSigns.getWeightKilos() <= 14){
                            if(vitalSigns.getWeightPounds() >= 22 && vitalSigns.getWeightPounds() <= 31){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        
        if("Preschooler".equals(vitalSigns.getAgeGroup())){
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 120.0){
                    if(vitalSigns.getSystolicBloodPressure() >= 80 && vitalSigns.getSystolicBloodPressure() <= 110){
                        if(vitalSigns.getWeightKilos() >= 14 && vitalSigns.getWeightKilos() <= 18){
                            if(vitalSigns.getWeightPounds() >= 31 && vitalSigns.getWeightPounds() <= 40){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        
        if("School Age".equals(vitalSigns.getAgeGroup())){
            if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                if(vitalSigns.getHeartRate() >= 70.0 && vitalSigns.getHeartRate() <= 110.0){
                    if(vitalSigns.getSystolicBloodPressure() >= 80 && vitalSigns.getSystolicBloodPressure() <= 120){
                        if(vitalSigns.getWeightKilos() >= 20 && vitalSigns.getWeightKilos() <= 42){
                            if(vitalSigns.getWeightPounds() >= 41 && vitalSigns.getWeightPounds() <= 92){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        
        if("Adolescent".equals(vitalSigns.getAgeGroup())){
            if(vitalSigns.getRespiratoryRate() >= 12.0 && vitalSigns.getRespiratoryRate() <= 20.0){
                if(vitalSigns.getHeartRate() >= 55.0 && vitalSigns.getHeartRate() <= 105.0){
                    if(vitalSigns.getSystolicBloodPressure() >= 110 && vitalSigns.getSystolicBloodPressure() <= 120){
                        if(vitalSigns.getWeightKilos() > 50){
                            if(vitalSigns.getWeightPounds() > 110){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean isVitalSignNormal(String vSign){
        if("Newborn".equalsIgnoreCase(vitalSigns.getAgeGroup())){
            if(vSign.equalsIgnoreCase(Respiratory_Rate)){
                if(vitalSigns.getRespiratoryRate() >= 30.0 && vitalSigns.getRespiratoryRate() <= 50.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Heart_Rate)){
                if(vitalSigns.getHeartRate() >= 120.0 && vitalSigns.getHeartRate() <= 160.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Systolic_Blood_Pressure)){
                if(vitalSigns.getSystolicBloodPressure() >= 50.0 && vitalSigns.getSystolicBloodPressure() <= 70.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_kilos)){
                if(vitalSigns.getWeightKilos() >= 2.0 && vitalSigns.getWeightKilos() <= 3.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_pounds)){
                if(vitalSigns.getWeightPounds()>= 4.5 && vitalSigns.getWeightPounds() <= 7.0){
                    return true;
                }
            }
        }
        
        if("Infant".equalsIgnoreCase(vitalSigns.getAgeGroup())){
            if(vSign.equalsIgnoreCase(Respiratory_Rate)){
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Heart_Rate)){
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 140.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Systolic_Blood_Pressure)){
                if(vitalSigns.getSystolicBloodPressure() >= 70.0 && vitalSigns.getSystolicBloodPressure() <= 100.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_kilos)){
                if(vitalSigns.getWeightKilos() >= 4.0 && vitalSigns.getWeightKilos() <= 10.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_pounds)){
                if(vitalSigns.getWeightPounds()>= 9.0 && vitalSigns.getWeightPounds() <= 22.0){
                    return true;
                }
            }
        }
        
        if("Toddler".equalsIgnoreCase(vitalSigns.getAgeGroup())){
            if(vSign.equalsIgnoreCase(Respiratory_Rate)){
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Heart_Rate)){
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 130.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Systolic_Blood_Pressure)){
                if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 110.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_kilos)){
                if(vitalSigns.getWeightKilos() >= 10.0 && vitalSigns.getWeightKilos() <= 14.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_pounds)){
                if(vitalSigns.getWeightPounds()>= 22.0 && vitalSigns.getWeightPounds() <= 31.0){
                    return true;
                }
            }
        }
        
        if("Preschooler".equalsIgnoreCase(vitalSigns.getAgeGroup())){
            if(vSign.equalsIgnoreCase(Respiratory_Rate)){
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Heart_Rate)){
                if(vitalSigns.getHeartRate() >= 80.0 && vitalSigns.getHeartRate() <= 120.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Systolic_Blood_Pressure)){
                if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 110.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_kilos)){
                if(vitalSigns.getWeightKilos() >= 14.0 && vitalSigns.getWeightKilos() <= 18.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_pounds)){
                if(vitalSigns.getWeightPounds()>= 31.0 && vitalSigns.getWeightPounds() <= 40.0){
                    return true;
                }
            }
        }
        
        if("School Age".equalsIgnoreCase(vitalSigns.getAgeGroup())){
            if(vSign.equalsIgnoreCase(Respiratory_Rate)){
                if(vitalSigns.getRespiratoryRate() >= 20.0 && vitalSigns.getRespiratoryRate() <= 30.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Heart_Rate)){
                if(vitalSigns.getHeartRate() >= 70.0 && vitalSigns.getHeartRate() <= 110.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Systolic_Blood_Pressure)){
                if(vitalSigns.getSystolicBloodPressure() >= 80.0 && vitalSigns.getSystolicBloodPressure() <= 120.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_kilos)){
                if(vitalSigns.getWeightKilos() >= 20.0 && vitalSigns.getWeightKilos() <= 42.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_pounds)){
                if(vitalSigns.getWeightPounds()>= 41.0 && vitalSigns.getWeightPounds() <= 92.0){
                    return true;
                }
            }
        }
        
        if("Adolescent".equalsIgnoreCase(vitalSigns.getAgeGroup())){
            if(vSign.equalsIgnoreCase(Respiratory_Rate)){
                if(vitalSigns.getRespiratoryRate() >= 12.0 && vitalSigns.getRespiratoryRate() <= 20.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Heart_Rate)){
                if(vitalSigns.getHeartRate() >= 55.0 && vitalSigns.getHeartRate() <= 105.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Systolic_Blood_Pressure)){
                if(vitalSigns.getSystolicBloodPressure() >= 110.0 && vitalSigns.getSystolicBloodPressure() <= 120.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_kilos)){
                if(vitalSigns.getWeightKilos() > 50.0){
                    return true;
                }
            }
            
            if(vSign.equalsIgnoreCase(Weight_in_pounds)){
                if(vitalSigns.getWeightPounds()> 110){
                    return true;
                }
            }
        }
        return false;
    }
}
