/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;
    
    List<List<String>> roles = new ArrayList<>();
    List<List<String>> coursenum = new ArrayList<>();
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
        public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
        
    public double calculateGPA(){
        double sum = 0;
        int count = 0;
        for(Map.Entry e : courseloadlist.entrySet()){
            count++;
            CourseLoad c = (CourseLoad)e.getValue();
            sum = sum + c.calculateGPA();
        }
        if(count == 1)
            return sum/2;
        else if(count == 2)
            return sum/4;
        else if(count == 3)
            return sum/6;       
        return sum/8;
    }
    public List<List<String>> getRoles(){
        for(Map.Entry e : courseloadlist.entrySet()){
            CourseLoad c = (CourseLoad)e.getValue();
            roles.add(c.getRole());
        }
        return roles;
    }
    
    public List<List<String>> igetRoles(){
        for(Map.Entry e : courseloadlist.entrySet()){
            CourseLoad c = (CourseLoad)e.getValue();
            roles.add(c.igetRole());
        }
        return roles;
    }
    
    public List<List<String>> getCourses(){
        for(Map.Entry e : courseloadlist.entrySet()){
            CourseLoad c = (CourseLoad)e.getValue();
            coursenum.add(c.getCourses());
        }
        return coursenum;
    } 
}
