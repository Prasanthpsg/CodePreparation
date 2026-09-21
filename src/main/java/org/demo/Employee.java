package org.demo;

// Employee - source code and by default implements the natural order sorting logic
//  sorting logic is only based on the employee id. You can not add other sorting logic here


public class Employee implements Comparable<Employee> {

    private int employeeId;
    private int salary;
    private String name;

    Employee(int employeeId, int salary, String name){
        this.employeeId = employeeId;
        this.salary = salary;
        this.name = name;
    }

    public void setEmployeeId(int eID){
        this.employeeId = eID;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }


    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.employeeId + " "+this.salary + " "+ this.name;
    }

    public int compareTo(Employee e){
        //return Integer.compare(this.employeeId, e.employeeId);
        if(this.employeeId > e.employeeId){
            return  1;
        }else if(this.employeeId < e.employeeId) {
            return -1;
        }else{
            return 0;
        }
    }

}
