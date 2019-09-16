package project.employee;

import java.util.ArrayList;
import java.util.List;

import project.interfaces.Obligation;

public abstract class Employee implements Obligation{
    private String name;
    private String position;
    private String adress;
    private String birthDate;
    private int salary;
    private List<String> obligations= new ArrayList<String>();;

    public String getName(){return name;}
    public String getPosition(){return  position;}
    public String getAdress(){return adress;}
    public String getBirthDate(){return birthDate;}
    public int getSalary(){return salary;}
    public List<String> getObligations(){return obligations;}

    public Employee(String name, String position, String adress, String birthDate, int salary, List<String>obligations){
        this.adress = adress;
        this.birthDate=birthDate;
        this.name=name;
        this.position=position;
        this.salary = salary;
        if (obligations!=null) this.obligations = obligations;
    }
    public String toString(){
        return getClass()+ "[name = "+getName()
                +", position = " +getPosition()
                +", adress = "+getAdress()+
                ", birth date = "+getBirthDate()
                +", salary = "+ getSalary() +"]";
    }
}
