/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Urvi
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_Newborn() {
        System.out.println("Newborn baby is normal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Newborn",40,135,55,3,5.5,"Urvi",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPatientNormal_Infant() {
        System.out.println("Infant is normal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Infant",25,120,80,6,17,"Grace",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPatientNormal_Toddler() {
        System.out.println("Toddler is normal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Toddler",30,110,95,12,25,"Macy",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPatientNormal_Preschooler() {
        System.out.println("Preschooler is normal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Preschooler",20,115,102,16,36,"Brian",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPatientNormal_SchoolAge() {
        System.out.println("School age child is normal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("School Age",28,105,96,30,72,"Ana",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPatientNormal_Adolescent() {
        System.out.println("Adolescent is normal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Adolescent",12,85,113,60,125,"Preksha",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPatientNormal_AdolescentFalse() {
        System.out.println("Adolescent is abnormal: ");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Adolescent",40,155,45,35,120,"Roy",date);
        Patient patient = new Patient(vitalSigns);
        boolean expResult = false;
        boolean result = patient.isPatientNormal();
        assertEquals(expResult, result);
    }
    
}
