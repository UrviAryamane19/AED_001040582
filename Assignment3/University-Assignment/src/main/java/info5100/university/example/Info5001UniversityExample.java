/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import com.github.javafaker.Faker;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {
    
    static XSSFWorkbook workbook = new XSSFWorkbook();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Faker faker = new Faker();
        Random r = new Random();
        
        College col1 = new College("COE");
        int min = 1;
        int max = 10;
        HashMap<String,Double> gpas = new HashMap<>();
        HashMap<String,List<String>> studentCourseType = new HashMap<>();
        HashMap<String,HashMap<String,String>> studentCompanyAndProfile = new HashMap<>();
        HashMap<String,List<Integer>> studentPerformace = new HashMap<>();
        HashMap<String,Double> gpaPercent = new HashMap<>();
        HashMap<String,Double> studentCourseTypeNumber = new HashMap<>();
        HashMap<String,Integer> studentPerformanceScore = new HashMap<>();
        
        HashMap<String,Double> igpas = new HashMap<>();
        HashMap<String,List<String>> istudentCourseType = new HashMap<>();
        HashMap<String,HashMap<String,String>> istudentCompanyAndProfile = new HashMap<>();
        HashMap<String,List<Integer>> istudentPerformace = new HashMap<>();
        HashMap<String,Double> igpaPercent = new HashMap<>();
        HashMap<String,Double> istudentCourseTypeNumber = new HashMap<>();
        HashMap<String,Integer> istudentPerformanceScore = new HashMap<>();
        
        //Department infoSys = new Department("Information Systems");
        Department infoSys = col1.newDepartment("Information Systems");
        Department industrial = col1.newDepartment("Industrial Engineering");
        
        
        infoSys.newCourse("app eng", "0", 4);
        infoSys.newCourse("psa", "1", 4);
        infoSys.newCourse("dmdd", "2", 4);
        infoSys.newCourse("wbt", "3", 4);
        infoSys.newCourse("bibd", "4", 4);
        infoSys.newCourse("bdwm", "5", 4);
        infoSys.newCourse("crypt", "6", 4);
        infoSys.newCourse("bi", "7", 4);
        infoSys.newCourse("dse", "8", 4);
        
        industrial.newCourse("op res", "0", 4);
        industrial.newCourse("act", "1", 4);
        industrial.newCourse("comp", "2", 4);
        industrial.newCourse("dtis", "3", 4);
        industrial.newCourse("rubs", "4", 4);
        industrial.newCourse("trcs", "5", 4);
        industrial.newCourse("qaa", "6", 4);
        industrial.newCourse("daan", "7", 4);
        industrial.newCourse("dst", "8", 4);
        
        
        CourseSchedule fall15 = infoSys.newCourseSchedule("fall2015");
        CourseSchedule spring16 = infoSys.newCourseSchedule("spring2016");
        CourseSchedule fall16 = infoSys.newCourseSchedule("fall2016");
        CourseSchedule spring17 = infoSys.newCourseSchedule("spring2017");
        CourseSchedule fall17 = infoSys.newCourseSchedule("fall17");
        CourseSchedule spring18 = infoSys.newCourseSchedule("spring18");
        CourseSchedule fall18 = infoSys.newCourseSchedule("fall18");
        CourseSchedule spring19 = infoSys.newCourseSchedule("spring19");
        CourseSchedule fall19 = infoSys.newCourseSchedule("fall19");
        CourseSchedule spring20 = infoSys.newCourseSchedule("spring20");
        CourseSchedule fall20 = infoSys.newCourseSchedule("fall20");
        CourseSchedule spring21 = infoSys.newCourseSchedule("spring21");
        
        CourseSchedule ifall15 = industrial.newCourseSchedule("fall2015");
        CourseSchedule ispring16 = industrial.newCourseSchedule("spring2016");
        CourseSchedule ifall16 = industrial.newCourseSchedule("fall2016");
        CourseSchedule ispring17 = industrial.newCourseSchedule("spring2017");
        CourseSchedule ifall17 = industrial.newCourseSchedule("fall17");
        CourseSchedule ispring18 = industrial.newCourseSchedule("spring18");
        CourseSchedule ifall18 = industrial.newCourseSchedule("fall18");
        CourseSchedule ispring19 = industrial.newCourseSchedule("spring19");
        CourseSchedule ifall19 = industrial.newCourseSchedule("fall19");
        CourseSchedule ispring20 = industrial.newCourseSchedule("spring20");
        CourseSchedule ifall20 = industrial.newCourseSchedule("fall20");
        CourseSchedule ispring21 = industrial.newCourseSchedule("spring21");
        
        
        for(int i = 0 ; i<9;i++) {  
            CourseOffer c = fall15.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = spring16.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = fall16.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = spring17.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = fall17.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = spring18.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = fall18.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)  {  
            CourseOffer c = spring19.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)   { 
            CourseOffer c = fall19.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)   { 
            CourseOffer c = spring20.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = fall20.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)  {  
            CourseOffer c = spring21.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        
        
        
        for(int i = 0 ; i<9;i++) {  
            CourseOffer c = ifall15.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ispring16.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ifall16.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ispring17.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ifall17.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ispring18.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ifall18.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)  {  
            CourseOffer c = ispring19.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)   { 
            CourseOffer c = ifall19.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)   { 
            CourseOffer c = ispring20.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++) {   
            CourseOffer c = ifall20.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        for(int i = 0 ; i<9;i++)  {  
            CourseOffer c = ispring21.newCourseOffer(Integer.toString(i));
            c.generatSeats(100);
        }
        
        
        
        PersonDirectory pd = infoSys.getPersonDirectory();
        for(int i = 0;i<69;i++) 
            pd.newPerson(faker.name().firstName());

        FacultyDirectory fd = infoSys.getFacultydirectory();
        int n = 9;
        while(n != 0){
            Person p = pd.getPersonlist().get(n);
            fd.newFacultyProfile(p); 
            n--;
        }

        int s = 68;
        StudentDirectory sd = infoSys.getStudentDirectory();
        while(s!=8){
            Person p = pd.getPersonlist().get(s);
            sd.newStudentProfile(p);
            s--;
        }
        
        
        PersonDirectory ipd = industrial.getPersonDirectory();
        for(int i = 0;i<69;i++) 
            ipd.newPerson(faker.name().firstName());

        FacultyDirectory ifd = industrial.getFacultydirectory();
        int in = 9;
        while(in != 0){
            Person p = ipd.getPersonlist().get(in);
            ifd.newFacultyProfile(p); 
            in--;
        }

        int is = 68;
        StudentDirectory isd = industrial.getStudentDirectory();
        while(is!=8){
            Person p = ipd.getPersonlist().get(is);
            isd.newStudentProfile(p);
            is--;
        }
        
        
        FacultyProfile f1 = fd.getTeacherlist().get(0);
        FacultyProfile f2 = fd.getTeacherlist().get(1);
        FacultyProfile f3 = fd.getTeacherlist().get(2);
        FacultyProfile f4 = fd.getTeacherlist().get(3);
        FacultyProfile f5 = fd.getTeacherlist().get(4);
        FacultyProfile f6 = fd.getTeacherlist().get(5);
        FacultyProfile f7 = fd.getTeacherlist().get(6);
        FacultyProfile f8 = fd.getTeacherlist().get(7);
        FacultyProfile f9 = fd.getTeacherlist().get(8);  
        
        
        FacultyProfile if1 = ifd.getTeacherlist().get(0);
        FacultyProfile if2 = ifd.getTeacherlist().get(1);
        FacultyProfile if3 = ifd.getTeacherlist().get(2);
        FacultyProfile if4 = ifd.getTeacherlist().get(3);
        FacultyProfile if5 = ifd.getTeacherlist().get(4);
        FacultyProfile if6 = ifd.getTeacherlist().get(5);
        FacultyProfile if7 = ifd.getTeacherlist().get(6);
        FacultyProfile if8 = ifd.getTeacherlist().get(7);
        FacultyProfile if9 = ifd.getTeacherlist().get(8);  
        
        
          
        f1.AssignAsTeacher(fall15.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(fall15.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(fall15.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(fall15.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(fall15.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(fall15.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(fall15.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(fall15.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(fall15.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(spring16.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(spring16.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(spring16.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(spring16.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(spring16.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(spring16.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(spring16.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(spring16.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(spring16.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(fall16.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(fall16.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(fall16.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(fall16.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(fall16.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(fall16.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(fall16.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(fall16.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(fall16.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(spring17.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(spring17.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(spring17.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(spring17.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(spring17.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(spring17.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(spring17.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(spring17.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(spring17.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(fall17.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(fall17.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(fall17.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(fall17.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(fall17.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(fall17.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(fall17.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(fall17.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(fall17.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(spring18.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(spring18.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(spring18.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(spring18.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(spring18.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(spring18.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(spring18.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(spring18.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(spring18.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(fall18.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(fall18.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(fall18.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(fall18.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(fall18.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(fall18.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(fall18.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(fall18.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(fall18.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(spring19.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(spring19.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(spring19.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(spring19.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(spring19.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(spring19.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(spring19.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(spring19.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(spring19.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(fall19.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(fall19.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(fall19.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(fall19.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(fall19.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(fall19.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(fall19.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(fall19.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(fall19.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(spring20.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(spring20.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(spring20.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(spring20.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(spring20.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(spring20.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(spring20.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(spring20.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(spring20.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(fall20.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(fall20.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(fall20.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(fall20.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(fall20.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(fall20.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(fall20.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(fall20.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(fall20.getCourseOfferByNumber("8"));
        
        f1.AssignAsTeacher(spring21.getCourseOfferByNumber("0"));
        f2.AssignAsTeacher(spring21.getCourseOfferByNumber("1"));
        f3.AssignAsTeacher(spring21.getCourseOfferByNumber("2"));
        f4.AssignAsTeacher(spring21.getCourseOfferByNumber("3"));
        f5.AssignAsTeacher(spring21.getCourseOfferByNumber("4"));
        f6.AssignAsTeacher(spring21.getCourseOfferByNumber("5"));
        f7.AssignAsTeacher(spring21.getCourseOfferByNumber("6"));
        f8.AssignAsTeacher(spring21.getCourseOfferByNumber("7"));
        f9.AssignAsTeacher(spring21.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ifall15.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ifall15.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ifall15.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ifall15.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ifall15.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ifall15.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ifall15.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ifall15.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ifall15.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ispring16.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ispring16.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ispring16.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ispring16.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ispring16.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ispring16.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ispring16.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ispring16.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ispring16.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ifall16.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ifall16.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ifall16.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ifall16.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ifall16.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ifall16.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ifall16.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ifall16.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ifall16.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ispring17.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ispring17.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ispring17.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ispring17.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ispring17.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ispring17.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ispring17.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ispring17.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ispring17.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ifall17.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ifall17.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ifall17.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ifall17.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ifall17.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ifall17.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ifall17.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ifall17.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ifall17.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ispring18.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ispring18.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ispring18.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ispring18.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ispring18.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ispring18.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ispring18.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ispring18.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ispring18.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ifall18.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ifall18.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ifall18.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ifall18.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ifall18.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ifall18.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ifall18.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ifall18.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ifall18.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ispring19.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ispring19.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ispring19.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ispring19.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ispring19.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ispring19.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ispring19.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ispring19.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ispring19.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ifall19.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ifall19.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ifall19.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ifall19.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ifall19.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ifall19.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ifall19.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ifall19.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ifall19.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ispring20.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ispring20.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ispring20.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ispring20.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ispring20.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ispring20.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ispring20.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ispring20.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ispring20.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ifall20.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ifall20.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ifall20.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ifall20.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ifall20.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ifall20.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ifall20.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ifall20.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ifall20.getCourseOfferByNumber("8"));
        
        if1.AssignAsTeacher(ispring21.getCourseOfferByNumber("0"));
        if2.AssignAsTeacher(ispring21.getCourseOfferByNumber("1"));
        if3.AssignAsTeacher(ispring21.getCourseOfferByNumber("2"));
        if4.AssignAsTeacher(ispring21.getCourseOfferByNumber("3"));
        if5.AssignAsTeacher(ispring21.getCourseOfferByNumber("4"));
        if6.AssignAsTeacher(ispring21.getCourseOfferByNumber("5"));
        if7.AssignAsTeacher(ispring21.getCourseOfferByNumber("6"));
        if8.AssignAsTeacher(ispring21.getCourseOfferByNumber("7"));
        if9.AssignAsTeacher(ispring21.getCourseOfferByNumber("8"));
        
        
        EmployerDirectory ed = infoSys.getEmployerdirectory();
        for(int i = 0 ; i < 40 ; i++)    
            ed.newEmployerProfile(faker.company().name(),r.nextInt(max - min + 1) + min);
        
        EmployerDirectory ied = industrial.getEmployerdirectory();
        for(int i = 0 ; i < 40 ; i++)    
            ied.newEmployerProfile(faker.company().name(),r.nextInt(max - min + 1) + min);
        
        
        for(int i = 0; i<5;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2015");
            c1.newSeatAssignment(fall15.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(fall15.getCourseOfferByNumber("1"));
            CourseLoad c2 = spr.newCourseLoad("spring2016");
            c2.newSeatAssignment(spring16.getCourseOfferByNumber("2"));
            c2.newSeatAssignment(spring16.getCourseOfferByNumber("4"));
            CourseLoad c3 = spr.newCourseLoad("fall2016");
            c3.newSeatAssignment(fall16.getCourseOfferByNumber("3"));
            c3.newSeatAssignment(fall16.getCourseOfferByNumber("6"));
            CourseLoad c4 = spr.newCourseLoad("spring2017");
            c4.newSeatAssignment(spring17.getCourseOfferByNumber("7"));
            c4.newSeatAssignment(spring17.getCourseOfferByNumber("8"));
        }
        for(int i = 5 ; i<10;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2016");
            c1.newSeatAssignment(spring16.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(spring16.getCourseOfferByNumber("2"));
            CourseLoad c2 = spr.newCourseLoad("fall2016");
            c2.newSeatAssignment(fall16.getCourseOfferByNumber("1"));
            c2.newSeatAssignment(fall16.getCourseOfferByNumber("7"));
            CourseLoad c3 = spr.newCourseLoad("spring2017");
            c3.newSeatAssignment(spring17.getCourseOfferByNumber("6"));
            c3.newSeatAssignment(spring17.getCourseOfferByNumber("8"));
            CourseLoad c4 = spr.newCourseLoad("fall2017");
            c4.newSeatAssignment(fall17.getCourseOfferByNumber("3"));
            c4.newSeatAssignment(fall17.getCourseOfferByNumber("4"));
        }
        for(int i = 10 ; i<15;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2016");
            c1.newSeatAssignment(fall16.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(fall16.getCourseOfferByNumber("7"));
            CourseLoad c2 = spr.newCourseLoad("spring2017");
            c2.newSeatAssignment(spring17.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(spring17.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2017");
            c3.newSeatAssignment(fall17.getCourseOfferByNumber("3"));
            c3.newSeatAssignment(fall17.getCourseOfferByNumber("4"));
            CourseLoad c4 = spr.newCourseLoad("spring2018");
            c4.newSeatAssignment(spring18.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(spring18.getCourseOfferByNumber("2"));
        }
        for(int i = 15 ; i<20;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            
            CourseLoad c1 = spr.newCourseLoad("spring2017");
            c1.newSeatAssignment(spring17.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(spring17.getCourseOfferByNumber("5"));
            CourseLoad c2 = spr.newCourseLoad("fall2017");
            c2.newSeatAssignment(fall17.getCourseOfferByNumber("7"));
            c2.newSeatAssignment(fall17.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2018");
            c3.newSeatAssignment(spring18.getCourseOfferByNumber("2"));
            c3.newSeatAssignment(spring18.getCourseOfferByNumber("1"));
            CourseLoad c4 = spr.newCourseLoad("fall2018");
            c4.newSeatAssignment(fall18.getCourseOfferByNumber("3"));
            c4.newSeatAssignment(fall18.getCourseOfferByNumber("6"));
        }
        for(int i = 20 ; i<25;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2017");
            c1.newSeatAssignment(fall17.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(fall17.getCourseOfferByNumber("5"));
            CourseLoad c2 = spr.newCourseLoad("spring2018");
            c2.newSeatAssignment(spring18.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(spring18.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2018");
            c3.newSeatAssignment(fall18.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(fall18.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("spring2019");
            c4.newSeatAssignment(spring19.getCourseOfferByNumber("3"));
            c4.newSeatAssignment(spring19.getCourseOfferByNumber("1"));
        }
        for(int i = 25 ; i<30;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2018");
            c1.newSeatAssignment(spring18.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(spring18.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("fall2018");
            c2.newSeatAssignment(fall18.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(fall18.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2019");
            c3.newSeatAssignment(spring19.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(spring19.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("fall2019");
            c4.newSeatAssignment(fall19.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(fall19.getCourseOfferByNumber("4"));
        }
        for(int i = 30 ; i<35;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2018");
            c1.newSeatAssignment(fall18.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(fall18.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("spring2019");
            c2.newSeatAssignment(spring19.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(spring19.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2019");
            c3.newSeatAssignment(fall19.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(fall19.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("spring2020");
            c4.newSeatAssignment(spring20.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(spring20.getCourseOfferByNumber("4"));
        }
        for(int i = 35 ; i<40;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2019");
            c1.newSeatAssignment(spring19.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(spring19.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("fall2019");
            c2.newSeatAssignment(fall19.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(fall19.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2020");
            c3.newSeatAssignment(spring20.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(spring20.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("fall2020");
            c4.newSeatAssignment(fall20.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(fall20.getCourseOfferByNumber("4"));
        }
        for(int i = 40 ; i<45;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2019");
            c1.newSeatAssignment(fall19.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(fall19.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("spring2020");
            c2.newSeatAssignment(spring20.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(spring20.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2020");
            c3.newSeatAssignment(fall20.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(fall20.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("spring2021");
            c4.newSeatAssignment(spring21.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(spring21.getCourseOfferByNumber("4"));
        }
        for(int i = 45 ; i<50;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2020");
            c1.newSeatAssignment(spring20.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(spring20.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("fall2020");
            c2.newSeatAssignment(fall20.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(fall20.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2021");
            c3.newSeatAssignment(spring21.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(spring21.getCourseOfferByNumber("2"));
        }
        for(int i = 50 ; i<55;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2020");
            c1.newSeatAssignment(fall20.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(fall20.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("spring2021");
            c2.newSeatAssignment(spring21.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(spring21.getCourseOfferByNumber("8"));
        }
        for(int i = 55 ; i<60;i++){
            StudentProfile spr = sd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2021");
            c1.newSeatAssignment(spring21.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(spring21.getCourseOfferByNumber("3"));
        }
        /////////////////////////////////////
        
        for(int i = 0; i<5;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2015");
            c1.newSeatAssignment(ifall15.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ifall15.getCourseOfferByNumber("1"));
            CourseLoad c2 = spr.newCourseLoad("spring2016");
            c2.newSeatAssignment(ispring16.getCourseOfferByNumber("2"));
            c2.newSeatAssignment(ispring16.getCourseOfferByNumber("4"));
            CourseLoad c3 = spr.newCourseLoad("fall2016");
            c3.newSeatAssignment(ifall16.getCourseOfferByNumber("3"));
            c3.newSeatAssignment(ifall16.getCourseOfferByNumber("6"));
            CourseLoad c4 = spr.newCourseLoad("spring2017");
            c4.newSeatAssignment(ispring17.getCourseOfferByNumber("7"));
            c4.newSeatAssignment(ispring17.getCourseOfferByNumber("8"));
        }
        for(int i = 5 ; i<10;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2016");
            c1.newSeatAssignment(ispring16.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ispring16.getCourseOfferByNumber("2"));
            CourseLoad c2 = spr.newCourseLoad("fall2016");
            c2.newSeatAssignment(ifall16.getCourseOfferByNumber("1"));
            c2.newSeatAssignment(ifall16.getCourseOfferByNumber("7"));
            CourseLoad c3 = spr.newCourseLoad("spring2017");
            c3.newSeatAssignment(ispring17.getCourseOfferByNumber("6"));
            c3.newSeatAssignment(ispring17.getCourseOfferByNumber("8"));
            CourseLoad c4 = spr.newCourseLoad("fall2017");
            c4.newSeatAssignment(ifall17.getCourseOfferByNumber("3"));
            c4.newSeatAssignment(ifall17.getCourseOfferByNumber("4"));
        }
        for(int i = 10 ; i<15;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2016");
            c1.newSeatAssignment(ifall16.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ifall16.getCourseOfferByNumber("7"));
            CourseLoad c2 = spr.newCourseLoad("spring2017");
            c2.newSeatAssignment(ispring17.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ispring17.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2017");
            c3.newSeatAssignment(ifall17.getCourseOfferByNumber("3"));
            c3.newSeatAssignment(ifall17.getCourseOfferByNumber("4"));
            CourseLoad c4 = spr.newCourseLoad("spring2018");
            c4.newSeatAssignment(ispring18.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(ispring18.getCourseOfferByNumber("2"));
        }
        for(int i = 15 ; i<20;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            
            CourseLoad c1 = spr.newCourseLoad("spring2017");
            c1.newSeatAssignment(ispring17.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ispring17.getCourseOfferByNumber("5"));
            CourseLoad c2 = spr.newCourseLoad("fall2017");
            c2.newSeatAssignment(ifall17.getCourseOfferByNumber("7"));
            c2.newSeatAssignment(ifall17.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2018");
            c3.newSeatAssignment(ispring18.getCourseOfferByNumber("2"));
            c3.newSeatAssignment(ispring18.getCourseOfferByNumber("1"));
            CourseLoad c4 = spr.newCourseLoad("fall2018");
            c4.newSeatAssignment(ifall18.getCourseOfferByNumber("3"));
            c4.newSeatAssignment(ifall18.getCourseOfferByNumber("6"));
        }
        for(int i = 20 ; i<25;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2017");
            c1.newSeatAssignment(ifall17.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ifall17.getCourseOfferByNumber("5"));
            CourseLoad c2 = spr.newCourseLoad("spring2018");
            c2.newSeatAssignment(ispring18.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ispring18.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2018");
            c3.newSeatAssignment(ifall18.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(ifall18.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("spring2019");
            c4.newSeatAssignment(ispring19.getCourseOfferByNumber("3"));
            c4.newSeatAssignment(ispring19.getCourseOfferByNumber("1"));
        }
        for(int i = 25 ; i<30;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2018");
            c1.newSeatAssignment(ispring18.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ispring18.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("fall2018");
            c2.newSeatAssignment(ifall18.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ifall18.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2019");
            c3.newSeatAssignment(ispring19.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(ispring19.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("fall2019");
            c4.newSeatAssignment(ifall19.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(ifall19.getCourseOfferByNumber("4"));
        }
        for(int i = 30 ; i<35;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2018");
            c1.newSeatAssignment(ifall18.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ifall18.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("spring2019");
            c2.newSeatAssignment(ispring19.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ispring19.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2019");
            c3.newSeatAssignment(ifall19.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(ifall19.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("spring2020");
            c4.newSeatAssignment(ispring20.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(ispring20.getCourseOfferByNumber("4"));
        }
        for(int i = 35 ; i<40;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2019");
            c1.newSeatAssignment(ispring19.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ispring19.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("fall2019");
            c2.newSeatAssignment(ifall19.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ifall19.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2020");
            c3.newSeatAssignment(ispring20.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(ispring20.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("fall2020");
            c4.newSeatAssignment(ifall20.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(ifall20.getCourseOfferByNumber("4"));
        }
        for(int i = 40 ; i<45;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2019");
            c1.newSeatAssignment(ifall19.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ifall19.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("spring2020");
            c2.newSeatAssignment(ispring20.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ispring20.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("fall2020");
            c3.newSeatAssignment(ifall20.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(ifall20.getCourseOfferByNumber("2"));
            CourseLoad c4 = spr.newCourseLoad("spring2021");
            c4.newSeatAssignment(ispring21.getCourseOfferByNumber("5"));
            c4.newSeatAssignment(ispring21.getCourseOfferByNumber("4"));
        }
        for(int i = 45 ; i<50;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2020");
            c1.newSeatAssignment(ispring20.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ispring20.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("fall2020");
            c2.newSeatAssignment(ifall20.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ifall20.getCourseOfferByNumber("8"));
            CourseLoad c3 = spr.newCourseLoad("spring2021");
            c3.newSeatAssignment(ispring21.getCourseOfferByNumber("7"));
            c3.newSeatAssignment(ispring21.getCourseOfferByNumber("2"));
        }
        for(int i = 50 ; i<55;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("fall2020");
            c1.newSeatAssignment(ifall20.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ifall20.getCourseOfferByNumber("3"));
            CourseLoad c2 = spr.newCourseLoad("spring2021");
            c2.newSeatAssignment(ispring21.getCourseOfferByNumber("6"));
            c2.newSeatAssignment(ispring21.getCourseOfferByNumber("8"));
        }
        for(int i = 55 ; i<60;i++){
            StudentProfile spr = isd.getStudentlist().get(i);
            CourseLoad c1 = spr.newCourseLoad("spring2021");
            c1.newSeatAssignment(ispring21.getCourseOfferByNumber("0"));
            c1.newSeatAssignment(ispring21.getCourseOfferByNumber("3"));
        }
        
        
               
//        StudentProfile spr = sd.findStudent(sd.getStudentlist().get(44).yourName());
//        CourseLoad cd = spr.getCourseLoadBySemester("fall2020");
//        System.out.println("CourseLoad : "+cd);
//        FacultyProfile fp = fd.findTeachingFaculty(fd.getTeacherlist().get(7).yourName());
//        for(FacultyAssignment fa : fp.getFacultyassignments()){
//            System.out.println(fa.getCourseoffer().getCourseNumber());
//        }
        
        for(int  i = 0 ; i < 40 ; i=i+2){
            StudentProfile spem = sd.getStudentlist().get(i);
            spem.newEmployment(ed.findEmployerProfile(ed.getEmployerlist().get(i).getName()),"SDE");
        }
        for(int  i = 1 ; i < 40 ; i=i+2){
            StudentProfile spem = sd.getStudentlist().get(i);
            spem.newEmployment(ed.findEmployerProfile(ed.getEmployerlist().get(i).getName()),"DataAnalyst");
        }
        
        
        
        for(int  i = 0 ; i < 40 ; i=i+2){
            StudentProfile spem = isd.getStudentlist().get(i);
            spem.newEmployment(ied.findEmployerProfile(ied.getEmployerlist().get(i).getName()),"Operations Research Analyst");
        }
        for(int  i = 1 ; i < 40 ; i=i+2){
            StudentProfile spem = isd.getStudentlist().get(i);
            spem.newEmployment(ied.findEmployerProfile(ied.getEmployerlist().get(i).getName()),"Supplier Chain Analyst");
        }
        
//        //Quality purpose
//        
//        for(int i = 0; i < 1 ; i++){
//            StudentProfile sprgpa = sd.findStudent(sd.getStudentlist().get(i).yourName());
//            System.out.println("GPA is : "+sprgpa.getGPA());
//        }
//        
//        for(int i = 0; i < 1 ; i++){
//            StudentProfile sprrole = sd.findStudent(sd.getStudentlist().get(i).yourName());
//            List<List<String>> roles = sprrole.getRole();
//            for(List<String> l : roles){
//                for(String srole : l){           
//                    System.out.println("Courses type : "+srole);
//                }
//            }
//        }
//        
//        for(int i = 1; i < 2 ; i++){
//            StudentProfile sprcom = sd.findStudent(sd.getStudentlist().get(i).yourName());
//            for (Map.Entry<String,String> entry : sprcom.getCompany().entrySet()) {
//                String key = entry.getKey();
//                String value = entry.getValue();
//                System.out.println("Company : "+key);
//                System.out.println("Job Profile : "+value);
//            }
//            System.out.println("Promotions : "+sprcom.getPromotions());
//            System.out.println("Salary Increments : "+sprcom.getIncrements());
//            System.out.println("Awards : "+sprcom.getAwards());
//        }
        
        for(int i = 0; i < 40 ; i++){
            StudentProfile sprrole = sd.findStudent(sd.getStudentlist().get(i).yourName());

            String k1 = sprrole.getName();
            double v1 = sprrole.getGPA();
            gpas.put(k1, v1); //map  
            
            List<String> courseRole = new ArrayList<>();
            String k2 = sprrole.getName();
            List<List<String>> roles = sprrole.getRole();
            for(List<String> l : roles){
                for(String srole : l){
                    courseRole.add(srole);
                }
            }
            studentCourseType.put(k2, courseRole); //map
            
            
            String k3 = sprrole.getName();
            HashMap<String,String> v3 = sprrole.getCompany();
            studentCompanyAndProfile.put(k3, v3); //map
            
            
            List<Integer> performanceMetrics = new ArrayList<>();
            String k4 = sprrole.getName();
            performanceMetrics.add(sprrole.getEmployerRating());
            performanceMetrics.add(sprrole.getPromotions());
            performanceMetrics.add(sprrole.getIncrements());
            performanceMetrics.add(sprrole.getAwards());
            studentPerformace.put(k4, performanceMetrics); //map  
        }
        
        
        
        for(int i = 0; i < 40 ; i++){
            StudentProfile sprrole = isd.findStudent(isd.getStudentlist().get(i).yourName());

            String k1 = sprrole.getName();
            double v1 = sprrole.getGPA();
            igpas.put(k1, v1); //map  
            
            List<String> courseRole = new ArrayList<>();
            String k2 = sprrole.getName();
            List<List<String>> roles = sprrole.igetRole();
            for(List<String> l : roles){
                for(String srole : l){
                    courseRole.add(srole);
                }
            }
            istudentCourseType.put(k2, courseRole); //map
            
            
            String k3 = sprrole.getName();
            HashMap<String,String> v3 = sprrole.getCompany();
            istudentCompanyAndProfile.put(k3, v3); //map
            
            
            List<Integer> performanceMetrics = new ArrayList<>();
            String k4 = sprrole.getName();
            performanceMetrics.add(sprrole.getEmployerRating());
            performanceMetrics.add(sprrole.getPromotions());
            performanceMetrics.add(sprrole.getIncrements());
            performanceMetrics.add(sprrole.getAwards());
            istudentPerformace.put(k4, performanceMetrics); //map  
            
            
            
        }
        
        
        
        for(Map.Entry<String,Double> entry : gpas.entrySet()){
            String key = entry.getKey();
            Double value = entry.getValue();
            double percent = (value / 4.0) * 100;
            gpaPercent.put(key, percent); //rltn map
 
        }
        
        for(Map.Entry<String,List<String>> entry : studentCourseType.entrySet()){
            int data = 0;
            int sde = 0;
            String key = entry.getKey();
            List<String> value = entry.getValue();
            for(String str : value){
                if(str.equalsIgnoreCase("Data")){
                    data++;
                }
                if(str.equalsIgnoreCase("SDE")) {
                    sde++;
                }
            }
            for(Map.Entry<String,HashMap<String,String>> etr : studentCompanyAndProfile.entrySet()){
                double score = 0;
                HashMap<String,String> v = etr.getValue();
                for(Map.Entry<String,String> e : v.entrySet()){
                    String k = e.getValue();
                    if(k.equalsIgnoreCase("SDE")){
                        score = sde * 12.5;
                        studentCourseTypeNumber.put(key, score); //rltn map
                    }
                    if(k.equalsIgnoreCase("DataAnalyst")){
                        score = data * 12.5;
                        studentCourseTypeNumber.put(key, score); //rltn map
                    }
                }
            }
        }
        
        for(Map.Entry<String,List<Integer>> entry : studentPerformace.entrySet()){
            String key = entry.getKey();
            StudentProfile sprrole = sd.findStudent(key);
            List<Integer> value = entry.getValue();
            int sum = 0;
            int score = 0;
            for(Integer i : value){
                sum = sum + i;
            }
            sum = sum - value.get(0);
            score = sum * value.get(0);
            studentPerformanceScore.put(key, score); //rltn map
        }
        ////
        
        for(Map.Entry<String,Double> entry : igpas.entrySet()){
            String key = entry.getKey();
            Double value = entry.getValue();
            double percent = (value / 4.0) * 100;
            igpaPercent.put(key, percent); //rltn map
 
        }
        
        for(Map.Entry<String,List<String>> entry : istudentCourseType.entrySet()){
            int ora = 0;
            int sca = 0;
            String key = entry.getKey();
            List<String> value = entry.getValue();
            for(String str : value){
                if(str.equalsIgnoreCase("ORA")){
                    ora++;
                }
                if(str.equalsIgnoreCase("SCA")) {
                    sca++;
                }
            }
            for(Map.Entry<String,HashMap<String,String>> etr : istudentCompanyAndProfile.entrySet()){
                double score = 0;
                HashMap<String,String> v = etr.getValue();
                for(Map.Entry<String,String> e : v.entrySet()){
                    String k = e.getValue();
                    if(k.equalsIgnoreCase("Operations Research Analyst")){
                        score = ora * 12.5;
                        istudentCourseTypeNumber.put(key, score); //rltn map
                    }
                    if(k.equalsIgnoreCase("Supplier Chain Analyst")){
                        score = sca * 12.5;
                        istudentCourseTypeNumber.put(key, score); //rltn map
                    }
                }
            }
        }
        
        for(Map.Entry<String,List<Integer>> entry : istudentPerformace.entrySet()){
            String key = entry.getKey();
            StudentProfile sprrole = sd.findStudent(key);
            List<Integer> value = entry.getValue();
            int sum = 0;
            int score = 0;
            for(Integer i : value){
                sum = sum + i;
            }
            sum = sum - value.get(0);
            score = sum * value.get(0);
            istudentPerformanceScore.put(key, score); //rltn map
        }
        
        //////
        System.out.println("---------- RAW DATA (IS) ----------");
        System.out.println("GPA : "+gpas);
        System.out.println("Course Types : "+studentCourseType);
        System.out.println("Company : "+studentCompanyAndProfile);
        System.out.println("Performance Metrics : "+studentPerformace);
        
        System.out.println("---------- CALCULATED DATA (IS) ----------");
        System.out.println("GPA PERCENT : "+gpaPercent);
        System.out.println("STUDENT COURSE PERCENT : "+studentCourseTypeNumber);
        System.out.println("STUDENT EMPLOYER PERFORMANCE SCORE OUT OF 150 : "+studentPerformanceScore);
        
        System.out.println("---------- RAW DATA (IE) ----------");
        System.out.println("GPA : "+igpas);
        System.out.println("Course Types : "+istudentCourseType);
        System.out.println("Company : "+istudentCompanyAndProfile);
        System.out.println("Performance Metrics : "+istudentPerformace);
        
        System.out.println("---------- CALCULATED DATA (IE) ----------");
        System.out.println("GPA PERCENT : "+igpaPercent);
        System.out.println("STUDENT COURSE PERCENT : "+istudentCourseTypeNumber);
        System.out.println("STUDENT EMPLOYER PERFORMANCE SCORE OUT OF 150 : "+istudentPerformanceScore);
  
        int stop = 0;
        do{
            System.out.println("1.Admin Login");
            System.out.println("2.Staff Login");
            int login = sc.nextInt();
            sc.nextLine();
            switch(login){
                case 1: System.out.println("Enter the username: ");
                        String adminUname = sc.nextLine();
                        System.out.println("Enter the password: ");
                        String adminPass = sc.nextLine();
                        int loginend = 0;
                        do{
                        System.out.println("Enter the Department to view the data");
                        String dep = sc.nextLine();
                        if((adminUname.equalsIgnoreCase("root")) && (adminPass.equalsIgnoreCase("admin"))){
                           
                            if(dep.equalsIgnoreCase("Information Systems")){
                                do{
                                    System.out.println("1.View Students");
                                    System.out.println("2.View Faculty");
                                    System.out.println("3.View Performance");
                                    System.out.println("4.Add Employer");
                                    System.out.println("5.Remove Employer");
                                    System.out.println("6.View Employer");
                                    System.out.println("7.Add Faculty");
                                    System.out.println("8.Remove Faculty");
                                    
                                    int choice = sc.nextInt();
                                    sc.nextLine();
                                    switch(choice){
                                        case 1: StudentDirectory studentDirectory = infoSys.getStudentDirectory();
                                                ArrayList<StudentProfile> studprof = studentDirectory.getStudentlist();
                                                for(StudentProfile sp : studprof){
                                                    System.out.println("Name: " +sp.yourName());
                                                    System.out.println("NUID: " +faker.idNumber().ssnValid());
                                                    System.out.println("Department: " +infoSys.getName());
                                                    System.out.println("GPA: " +sp.getGPA());
//                                                    for(List<String> l : sp.getCourses()){
//                                                        for(String sl : l){
//                                                            System.out.println("Course: " +sl);
//                                                        }
//                                                    }
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                            
                                        case 2: FacultyDirectory facultyDirectory = infoSys.getFacultydirectory();
                                                ArrayList<FacultyProfile> facprof = facultyDirectory.getTeacherlist();
                                                for(FacultyProfile fp : facprof){
                                                    System.out.println("Name: " +fp.yourName());
                                                    System.out.println("College : "+col1.getName());
                                                    System.out.println("Department: " +infoSys.getName());
                                                    System.out.println("Course: " +fp.getCourseName());
                                                    System.out.println("Rating: " +fp.getRating());
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                            
                                        case 3: StudentDirectory sdir = infoSys.getStudentDirectory();
                                                ArrayList<StudentProfile> spf = sdir.getStudentlist();
                                                for(int  i = 0 ; i < 40 ; i++){
                                                    StudentProfile sprcom = sd.findStudent(sd.getStudentlist().get(i).yourName());
                                                    String key = sprcom.getName();
                                                    System.out.println("Name : "+key);
                                                    System.out.println("Department : "+infoSys.getName());
                                                    System.out.println("GPA : "+gpas.get(key));
                                                    HashMap<String,String> scp = studentCompanyAndProfile.get(key);
                                                    for(Map.Entry<String,String> ent : scp.entrySet())
                                                        System.out.println("Employer : "+ent.getKey());
                                                    System.out.println("Student's Employment Performance out of 150 : "+studentPerformanceScore.get(key));
                                                    System.out.println("Course Impact in % :"+studentCourseTypeNumber.get(key));
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                           
                                        case 4: EmployerDirectory empdir = infoSys.getEmployerdirectory();
                                                System.out.println("Enter the Employer name: ");
                                                String empname = sc.nextLine();
                                                empdir.newEmployerProfile(empname, r.nextInt(max - min + 1) + min);
                                                break;
                                                
                                        case 5: EmployerDirectory empdirec = infoSys.getEmployerdirectory();
                                                System.out.println("Enter the Employer name to remove: ");
                                                String empn = sc.nextLine();
                                                EmployerProfile empp = empdirec.findEmployerProfile(empn);
                                                empdirec.getEmployerlist().remove(empp);
                                                break;
                                                
                                        case 6: EmployerDirectory empdirect = infoSys.getEmployerdirectory();
                                                ArrayList<EmployerProfile> empprof = empdirect.getEmployerlist();
                                                for(EmployerProfile emppr : empprof){
                                                    System.out.println("Employer Name : "+emppr.getName());
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                                
                                        case 7: FacultyDirectory fdir = infoSys.getFacultydirectory();
                                                PersonDirectory pdir = infoSys.getPersonDirectory();
                                                System.out.println("Enter the Faculty name: ");
                                                String fname = sc.nextLine();
                                                Person p = pdir.newPerson(fname);
                                                fdir.newFacultyProfile(p);
                                                break;
                                                
                                        case 8: FacultyDirectory fdirec = infoSys.getFacultydirectory();
                                                System.out.println("Enter the Faculty name to remove: ");
                                                String fn = sc.nextLine();
                                                FacultyProfile facpro = fdirec.findTeachingFaculty(fn);
                                                fdirec.getTeacherlist().remove(facpro);
                                                break;
                                        default:System.out.println("Invalid Entry !!!");
                                                break;
                                    }
                                    System.out.println("Press any number to continue and 0 to stop!!!");
                                    loginend = sc.nextInt();
                                    sc.nextLine();
                                }while(loginend != 0);
                            }
                            if(dep.equalsIgnoreCase("Industrial Engineering")){
                                do{
                                    System.out.println("1.View Students");
                                    System.out.println("2.View Faculty");
                                    System.out.println("3.View Performance");
                                    System.out.println("4.Add Employer");
                                    System.out.println("5.Remove Employer");
                                    System.out.println("6.View Employer");
                                    System.out.println("7.Add Faculty");
                                    System.out.println("8.Remove Faculty");
                                    System.out.println("9.View Faculty");
                                    int choice = sc.nextInt();
                                    sc.nextLine();
                                    switch(choice){
                                        case 1: StudentDirectory studentDirectory = industrial.getStudentDirectory();
                                                ArrayList<StudentProfile> studprof = studentDirectory.getStudentlist();
                                                for(StudentProfile sp : studprof){
                                                    System.out.println("Name: " +sp.yourName());
                                                    System.out.println("NUID: " +faker.idNumber().ssnValid());
                                                    System.out.println("Department: " +industrial.getName());
                                                    System.out.println("GPA: " +sp.getGPA());
//                                                      for(List<String> l : sp.getCourses()){
//                                                          for(String sl : l){
//                                                              System.out.println("Course: " +sl);
//                                                          }
//                                                      }
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                            
                                        case 2: FacultyDirectory facultyDirectory = industrial.getFacultydirectory();
                                                ArrayList<FacultyProfile> facprof = facultyDirectory.getTeacherlist();
                                                for(FacultyProfile fp : facprof){
                                                    System.out.println("Name: " +fp.yourName());
                                                    System.out.println("College : "+col1.getName());
                                                    System.out.println("Department: " +industrial.getName());
                                                    System.out.println("Course: " +fp.getCourseName());
                                                    System.out.println("Rating: " +fp.getRating());
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                            
                                        case 3: StudentDirectory sdir = industrial.getStudentDirectory();
                                                ArrayList<StudentProfile> spf = sdir.getStudentlist();
                                                for(int  i = 0 ; i < 40 ; i++){
                                                    StudentProfile sprcom = isd.findStudent(isd.getStudentlist().get(i).yourName());
                                                    String key = sprcom.getName();
                                                    System.out.println("Name : "+key);
                                                    System.out.println("Department : "+industrial.getName());
                                                    System.out.println("GPA : "+igpas.get(key));
                                                    HashMap<String,String> scp = istudentCompanyAndProfile.get(key);
                                                    for(Map.Entry<String,String> ent : scp.entrySet())
                                                        System.out.println("Employer : "+ent.getKey());
                                                    System.out.println("Student's Employment Performance out of 150 : "+istudentPerformanceScore.get(key));
                                                    System.out.println("Course Impact in % :"+istudentCourseTypeNumber.get(key));
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                                
                                        case 4: EmployerDirectory empdir = industrial.getEmployerdirectory();
                                                System.out.println("Enter the Employer name: ");
                                                String empname = sc.nextLine();
                                                empdir.newEmployerProfile(empname, r.nextInt(max - min + 1) + min);
                                                break;
                                                
                                        case 5: EmployerDirectory empdirec = industrial.getEmployerdirectory();
                                                System.out.println("Enter the Employer name to remove: ");
                                                String empn = sc.nextLine();
                                                EmployerProfile empp = empdirec.findEmployerProfile(empn);
                                                empdirec.getEmployerlist().remove(empp);
                                                break;
                                                
                                       case 6: EmployerDirectory empdirect = industrial.getEmployerdirectory();
                                                ArrayList<EmployerProfile> empprof = empdirect.getEmployerlist();
                                                for(EmployerProfile emppr : empprof){
                                                    System.out.println("Employer Name : "+emppr.getName());
                                                    System.out.println("-----------------------------------------------");
                                                }
                                                break;
                                                
                                        case 7: FacultyDirectory fdir = industrial.getFacultydirectory();
                                                PersonDirectory pdir = infoSys.getPersonDirectory();
                                                System.out.println("Enter the Faculty name: ");
                                                String fname = sc.nextLine();
                                                Person p = pdir.newPerson(fname);
                                                fdir.newFacultyProfile(p);
                                                break;
                                                
                                        case 8: FacultyDirectory fdirec = industrial.getFacultydirectory();
                                                System.out.println("Enter the Faculty name to remove: ");
                                                String fn = sc.nextLine();
                                                FacultyProfile facpro = fdirec.findTeachingFaculty(fn);
                                                fdirec.getTeacherlist().remove(facpro);
                                                break;
                                        default:System.out.println("Invalid entry");
                                                break;
                                    }
                                    System.out.println("Press any number to continue and 0 to to check for other departments!!!");
                                    loginend = sc.nextInt();
                                    sc.nextLine();    
                                }while(loginend != 0); 
                            }
                        }
                        else {
                            System.out.println("You don't have access to this ! Please contact the support team for queries");
                        }
                        System.out.println("Press any number to check for other department and 0 to logout");
                        loginend = sc.nextInt();
                        sc.nextLine(); 
                        }while(loginend!=0);
                        break;
                        
                case 2: System.out.println("Enter the username: ");
                        String staffuname = sc.nextLine();
                        System.out.println("Enter the password");
                        String staffpass = sc.nextLine();
                        int lend = 0;
                        do{
                            System.out.println("Enter the department to fill data ");
                            String depname = sc.nextLine();
                            if((staffuname.equalsIgnoreCase("staff")) && (staffpass.equalsIgnoreCase("staff1"))){
                                if(depname.equalsIgnoreCase("Information Systems")){
                                    do{
                                        System.out.println("1.Add Students");
                                        System.out.println("2.View Students");
                                        System.out.println("3.Remove Students");
                                        
                                        int choice = sc.nextInt();
                                        sc.nextLine();
                                        switch(choice){
                                            case 1:System.out.println("Enter name of student : ");
                                                   String name = sc.nextLine();
                                                   PersonDirectory personDirectory = infoSys.getPersonDirectory();
                                                   Person p = personDirectory.newPerson(name);
                                                   StudentDirectory studentDirectory = infoSys.getStudentDirectory();
                                                   StudentProfile sprof = studentDirectory.newStudentProfile(p);
                                                   do{
                                                       System.out.println("Enter Student CourseLoad semester : ");
                                                       String sload = sc.nextLine();
                                                       CourseLoad cload = new CourseLoad(sload);
                                                       for(int i = 0 ; i < 2 ; i++) {
                                                           System.out.println("Enter the course id : ");
                                                           String cid = sc.nextLine();
                                                           if(sload.equalsIgnoreCase("Fall2015")){
                                                               CourseOffer co = fall15.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2016")){
                                                               CourseOffer co = spring16.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("fall2016")){
                                                               CourseOffer co = fall16.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2017")){
                                                               CourseOffer co = spring17.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2017")){
                                                               CourseOffer co = fall17.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2018")){
                                                               CourseOffer co = spring18.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2018")){
                                                               CourseOffer co = fall18.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2019")){
                                                               CourseOffer co = spring19.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2019")){
                                                               CourseOffer co = fall19.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2020")){
                                                               CourseOffer co = spring20.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2020")){
                                                               CourseOffer co = fall20.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else {
                                                               CourseOffer co = spring21.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                       }
                                                       System.out.println("Press any number to add courseload or 0 to menu");
                                                       lend = sc.nextInt();
                                                       sc.nextLine();
                                                   }while(lend!=0);
                                                   break;
                                            case 2 :StudentDirectory studentDy = infoSys.getStudentDirectory();
                                                    ArrayList<StudentProfile> studprof = studentDy.getStudentlist();
                                                    for(StudentProfile sp : studprof){
                                                        System.out.println("Name: " +sp.yourName());
                                                        System.out.println("NUID: " +faker.idNumber().ssnValid());
                                                        System.out.println("Department: " +infoSys.getName());
                                                        System.out.println("-----------------------------------------------");
                                                    }
                                                    break;
                                            case 3 :StudentDirectory studentDir = infoSys.getStudentDirectory();
                                                    ArrayList<StudentProfile> stdprof = studentDir.getStudentlist();
                                                    System.out.println("Enter the student id to delete : ");
                                                    String sid = sc.nextLine();
                                                    StudentProfile stdprofile = studentDir.findStudent(sid);
                                                    stdprof.remove(stdprofile);
                                                    break;
                                            default:System.out.println("Invalid Entry !!!");
                                                    break;
                                        }
                                        System.out.println("Press any number to continue or 0 to change department : ");
                                        lend = sc.nextInt();
                                    }while(lend!=0);
                                }
                                if(depname.equalsIgnoreCase("Industrial Engineering")){
                                    do{
                                        System.out.println("1.Add Students");
                                        System.out.println("2.View Students");
                                        System.out.println("3.Remove Students");
                                        int choice = sc.nextInt();
                                        sc.nextLine();
                                        switch(choice){
                                            case 1:System.out.println("Enter name of student : ");
                                                   String name = sc.nextLine();
                                                   PersonDirectory personDirectory = industrial.getPersonDirectory();
                                                   Person p = personDirectory.newPerson(name);
                                                   StudentDirectory studentDirectory = industrial.getStudentDirectory();
                                                   StudentProfile sprof = studentDirectory.newStudentProfile(p);
                                                   do{
                                                       System.out.println("Enter Student CourseLoad semester : ");
                                                       String sload = sc.nextLine();
                                                       CourseLoad cload = new CourseLoad(sload);
                                                       for(int i = 0 ; i < 2 ; i++) {
                                                           System.out.println("Enter the course id : ");
                                                           String cid = sc.nextLine();
                                                           if(sload.equalsIgnoreCase("Fall2015")){
                                                               CourseOffer co = ifall15.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2016")){
                                                               CourseOffer co = ispring16.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("fall2016")){
                                                               CourseOffer co = ifall16.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2017")){
                                                               CourseOffer co = ispring17.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2017")){
                                                               CourseOffer co = ifall17.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2018")){
                                                               CourseOffer co = ispring18.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2018")){
                                                               CourseOffer co = ifall18.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2019")){
                                                               CourseOffer co = ispring19.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2019")){
                                                               CourseOffer co = ifall19.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Spring2020")){
                                                               CourseOffer co = ispring20.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else if(sload.equalsIgnoreCase("Fall2020")){
                                                               CourseOffer co = ifall20.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                           else {
                                                               CourseOffer co = ispring21.getCourseOfferByNumber(cid);
                                                               cload.newSeatAssignment(co);
                                                           }
                                                       }
                                                       System.out.println("Press any number to add courseload or 0 to menu");
                                                       lend = sc.nextInt();
                                                       sc.nextLine();
                                                   }while(lend!=0);
                                                   break;
                                                   
                                            case 2 :StudentDirectory studentDy = industrial.getStudentDirectory();
                                                    ArrayList<StudentProfile> studprof = studentDy.getStudentlist();
                                                    for(StudentProfile sp : studprof){
                                                        System.out.println("Name: " +sp.yourName());
                                                        System.out.println("NUID: " +faker.idNumber().ssnValid());
                                                        System.out.println("Department: " +industrial.getName());
                                                        System.out.println("-----------------------------------------------");
                                                    }
                                                    break;
                                                    
                                            case 3 :StudentDirectory studentDir = industrial.getStudentDirectory();
                                                    ArrayList<StudentProfile> stdprof = studentDir.getStudentlist();
                                                    System.out.println("Enter the student id to delete : ");
                                                    String sid = sc.nextLine();
                                                    StudentProfile stdprofile = studentDir.findStudent(sid);
                                                    stdprof.remove(stdprofile);
                                                    break;
                                                    
                                            default:System.out.println("Invalid Entry !!");
                                                    break;
                                        }
                                        System.out.println("Press any number to continue or 0 to change department : ");
                                        lend = sc.nextInt();
                                    }while(lend!=0);
                                }
                            }
                            else {
                                System.out.println("You don't have access to this ! Please contact the support team for queries");
                            }
                        }while(lend!=0);
                        break;
                default :System.out.println("Invalid entry !!");
                         break; 
            }
            System.out.println("Press any number for homepage and 0 to logout!!!");
            stop = sc.nextInt();
            sc.nextLine();
        }
        while(stop != 0);
    }
}
