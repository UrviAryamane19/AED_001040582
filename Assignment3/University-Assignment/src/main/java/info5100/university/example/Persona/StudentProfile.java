/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
   
    public String yourName(){
        return person.getPersonId();
    }

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public String getName(){
        return person.getPersonId();
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
    
    public Employment newEmployment(EmployerProfile e,String job){
        return employmenthistory.newEmployment(e,job);
    }
    
    public double getGPA(){
        return transcript.calculateGPA();
    }
    
    public List<List<String>> getRole(){
        return transcript.getRoles();
    }
    
    public List<List<String>> igetRole(){
        return transcript.igetRoles();
    }
    
    public List<List<String>> getCourses(){
        return transcript.getCourses();
    }
    
    public HashMap<String,String> getCompany(){
        return employmenthistory.getCompany();
    }
    
    public int getPromotions(){
        return employmenthistory.getPromotions();
    }
    
    public int getAwards(){
        return employmenthistory.getAwards();
    }
    
    public int getIncrements(){
        return employmenthistory.getIncrements();
    }
    
    public int getEmployerRating(){
        return employmenthistory.getEmployerRating();
    } 
}
