/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author rahul-bhiwande
 */
public class College {
    ArrayList<Department> departmentList;
    
    String cname;
    
    public String getName() {
        return cname;
    }

    public College(String cname) {
        departmentList = new ArrayList<>();
        this.cname = cname;
    }
    
    public Department newDepartment(String n) {

        Department d = new Department(n);
        departmentList.add(d);
        return d;
    }

    public Department findDepartment(String id) {

        for (Department d : departmentList) {

            if (d.getName().equalsIgnoreCase(id)) {
                return d;
            }
        }
            return null; //not found after going through the whole list
         }
    
    
}
