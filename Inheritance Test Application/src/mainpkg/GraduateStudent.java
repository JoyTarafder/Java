/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class GraduateStudent extends Student{
    private int yearOfWorkExperience, noOfPublications;

    public GraduateStudent(int id, String name, float cgpa, LocalDate dob, int yearOfWorkExperience, int noOfPublications ) {
        //super(id, name, cgpa, dob);
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.dob = dob;
        this.yearOfWorkExperience = yearOfWorkExperience;
        this.noOfPublications = noOfPublications;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" + "id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", dob=" + dob +", yearOfWorkExperience=" + yearOfWorkExperience + ", noOfPublications=" + noOfPublications + '}'+'\n';
    }

    



    
}
