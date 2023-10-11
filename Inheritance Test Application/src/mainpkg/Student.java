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
public class Student {
    protected int id;
    protected String name;
    protected float cgpa;
    protected LocalDate dob;
    // private int id;
    // private String name;
    // private float cgpa;
    // private LocalDate dob;

    public Student() {
    }

    public Student(int id, String name, float cgpa, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", dob=" + dob + '\n';
    }

}
