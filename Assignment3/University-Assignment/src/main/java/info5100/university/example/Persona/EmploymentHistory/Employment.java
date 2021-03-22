/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    ArrayList<CourseOffer> relevantcourseoffers;
    int promotions;
    Random r = new Random();

    public int getPromotions() {
        return r.nextInt(6);
    }

    public int getAwards() {
        return r.nextInt(6);
    }

    public int getIncrements() {
        return r.nextInt(6);
    }
    int awards;
    int increments;
    String job;
    Employment nextemplyment;
    HashMap<String,String> name = new HashMap<>();//next job so they are in a sequence 
    
    EmployerProfile employer;
    public Employment(EmployerProfile ep,String job){
        relevantcourseoffers = new ArrayList();
        this.job = job;
        this.employer = ep;
    }
    
    public HashMap<String,String> EmployerProfile(){
        name.put(employer.getName(), job);
        return name;
    }
    
    public int getEmployerRating(){
        return employer.getRating();
    }

    

}
