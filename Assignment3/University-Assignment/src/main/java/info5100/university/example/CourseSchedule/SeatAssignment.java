/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    
    Seat seat;
    Random r = new Random();
    double rangeMin = 2.0;
    double rangeMax = 4.0;
    String[] role = {"SDE","Data"};
    String[] irole = {"ORA","SCA"};
    @Override
    public String toString() {
        return "SeatAssignment{" + "seat=" + seat + ", courseload=" + courseload + '}';
    }
    CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
        public SeatAssignment(){

    }
        public Seat getSeat() {
        return seat;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    public double getGrade(){
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }
    public String getRole(){
        int  i = r.nextInt(2);
        return role[i];
    }
    
    public String igetRole(){
        int  i = r.nextInt(2);
        return irole[i];
    }
    
    public String getCourses(){
        CourseOffer co = seat.getCourseoffer();
        return co.getCourseNumber(); 
    }
    
}
