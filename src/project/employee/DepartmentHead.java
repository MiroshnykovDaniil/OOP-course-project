package project.employee;

import project.interfaces.Obligation;
import project.interfaces.Subordinate;

import java.util.ArrayList;
import java.util.List;

public class DepartmentHead extends Employee implements Obligation, Subordinate<Specialist> {


    private List<String> obligations= new ArrayList<String>();;
    private List<String> subordinates= new ArrayList<String>();;
    private int bonus;

    public DepartmentHead(String name, String position, String adress, String birthDate, int salary, int bonus, List<String> obligations, List<String> subordinates) {
        super(name, position, adress, birthDate, salary);
        this.bonus=bonus;
        if (subordinates != null) this.subordinates = subordinates;
        if (obligations!=null) this.obligations = obligations;
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

    public void addSubordinate(Specialist subordinate) {
        getSubordinates().add(subordinate.getName());
    }

    @Override
    public void removeSubordinate(Specialist subordinate) {
        if (getSubordinates().contains(subordinate))
            getSubordinates().remove(subordinate);
    }

    @Override
    public String toString(){
        return super.toString()+",obligations = ["+getObligations()+" ], subordinate = [" +getSubordinates()+"]";
    }
}
