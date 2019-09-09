package project.employee;

import java.util.List;

public abstract class Employee {
    private String name;
    private String position;
    private String adress;
    private String birthDate;
    private int salary;


    public String getName(){return name;}
    public String getPosition(){return  position;}
    public String getAdress(){return adress;}
    public String getBirthDate(){return birthDate;}
    public int getSalary(){return salary;}

    public Employee(String name, String position, String adress, String birthDate, int salary){
        this.adress = adress;
        this.birthDate=birthDate;
        this.name=name;
        this.position=position;
        this.salary = salary;
    }
    public String toString(){
        return getClass()+ "[name = "+getName()
                +", position = " +getPosition()
                +", adress = "+getAdress()+
                ", birth date = "+getBirthDate()
                +", salary = "+ getSalary() +"]";
    }
}
