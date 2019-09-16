package project.employee;

import project.interfaces.Subordinate;
import java.util.ArrayList;
import java.util.List;

public class DepartmentHead extends Employee implements Subordinate<Object> {
    private List<String> obligations= new ArrayList<String>();
    private List<String> subordinates= new ArrayList<String>();
    private int bonus;
    public DepartmentHead(String name, String position, String adress, String birthDate, int salary, int bonus, List<String> obligations, List<String> subordinates) {
        super(name, position, adress, birthDate, salary,obligations);
        this.bonus=bonus;
        if (subordinates != null) this.subordinates = subordinates;
        //if (obligations!=null) this.obligations = obligations;
    }

    public List<String> getObligations(){return obligations;}
    public List<String> getSubordinates(){return subordinates;}


    @Override
    public int getSalary(){return super.getSalary()+getBonus();}
    public int getBonus(){return bonus;}

    @Override
    public void addObligation(String obligation) {
        getObligations().add(obligation);
    }

    @Override
    public void removeObligation(String obligation) {
        if (getObligations().contains(obligation))
            getObligations().remove(obligation);
    }
    @Override
    public void removeSubordinate(Object subordinate) {
        if (getSubordinates().contains(subordinate))
            getSubordinates().remove(subordinate);
    }
    @Override
    public String toString(){
        return super.toString()+",obligations = ["+getObligations()+" ], subordinate = [" +getSubordinates()+"]";
    }
    @Override
    public void addSubordinate(Object subordinate) {
        try{
        Employee employee =(Employee)subordinate;
        subordinates.add(employee.getName());
        }
        catch(ClassCastException e){ System.out.println("Method: [addSubordinate(Object subordinate)]: Wrong Object. Must be Specialist or HeadOfSector");}
    }
}
