/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    

    public ArrayList<Employment> getEmployments() {
        return employments;
    }
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(EmployerProfile ep,String job){
        Employment ne = new Employment(ep,job);
        employments.add(ne);
        return ne;
    }
    
    public HashMap<String,String> getCompany(){
        for(Employment e : employments){
            return e.EmployerProfile();
        }
        return null;
    }
    
    public int getPromotions(){
        for(Employment e : employments){
            return e.getPromotions(); 
        }
        return 0;
    }
    
    public int getAwards(){
        for(Employment e : employments){
            return e.getAwards(); 
        }
        return 0;
    }
    public int getIncrements(){
        for(Employment e : employments){
            return e.getIncrements(); 
        }
        return 0;
    }
    
    public int getEmployerRating(){
        for(Employment e : employments){
            return e.getEmployerRating();
        }
        return 0;
    }
    
}
