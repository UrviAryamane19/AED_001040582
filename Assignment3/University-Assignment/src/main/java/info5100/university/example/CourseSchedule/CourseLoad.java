/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    List<String> role = new ArrayList<>();
    List<String> coursenum = new ArrayList<>();
    @Override
    public String toString() {
        return "CourseLoad{" + "semester=" + semester + ", seatassignments=" + seatassignments + '}';
    }

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList<SeatAssignment>();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment();
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    public double calculateGPA(){
        double sum = 0;
        for(SeatAssignment s: seatassignments){
            sum = sum + s.getGrade();
        }
        return sum;
    }
    
    public List<String> getRole(){
        for(SeatAssignment s: seatassignments){
            role.add(s.getRole());
        }
        return role;
    }
    
    public List<String> igetRole(){
        for(SeatAssignment s: seatassignments){
            role.add(s.igetRole());
        }
        return role;
    }
    
    public List<String> getCourses(){
        for(SeatAssignment s: seatassignments){
            coursenum.add(s.getCourses());
        }
        return coursenum;
    }
    
}
