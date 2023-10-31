
package mainpkg;

import java.time.LocalDate;


public class Employee {
    private int id;
    private String name, gender, dept, desig; 
    private float salary; 
    private LocalDate dob, doj;

    public Employee(int id, String name, String gender, String dept, String desig, float salary, LocalDate dob, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.desig = desig;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDept() {
        return dept;
    }

    public String getDesig() {
        return desig;
    }

    public float getSalary() {
        return salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "id:" + id + ", name:" + name + ", gender:" + gender + ", dept:" + dept + ", desig:" + desig + ", salary:" + salary + ", dob:" + dob + ", doj:" + doj + "\n";
    }
    
}
