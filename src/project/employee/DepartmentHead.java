package project.employee;

import java.util.*;

public class DepartmentHead extends Employee{
    private int bonus;
    public DepartmentHead(String name, String position, String adress, String birthDate, int salary, int bonus,
                          List<String> obligations, Map<String, Employee> subordinates, String department) {
        super(name, position, adress, birthDate, salary,obligations, subordinates);
        this.bonus=bonus;
        setDepartment(department);
        //if (obligations!=null) this.obligations = obligations;
    }

    @Override
    public int getSalary(){return super.getSalary()+getBonus();}
    public int getBonus(){return bonus;}

    public void addObligation(String obligation) {
        getObligations().add(obligation);
    }
    public void removeObligation(String obligation) {
        if (getObligations().contains(obligation))
            getObligations().remove(obligation);
    }
    @Override
    public String toString(){
        return super.toString()+",obligations = ["+getObligations()+" ], subordinate = [" +getSubordinates().keySet()+"]\n";
    }
}
