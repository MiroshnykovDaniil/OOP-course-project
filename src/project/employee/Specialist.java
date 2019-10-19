package project.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Specialist extends Employee {

    private List<String> obligations= new ArrayList<String>();
    private List<String> subordinates= new ArrayList<String>();

    public Specialist(String name, String position, String adress,
                      String birthDate, int salary, Map<String, Employee> subordinates, List<String> obligations,
                      String department) {
        super(name, position, adress, birthDate, salary,obligations,subordinates);
        setDepartment(department);
        // if (subordinates != null) this.subordinates = subordinates;
        if (obligations!=null) this.obligations = obligations;
    }


    public void addObligation(String obligation) {
        getObligations().add(obligation);
        return;
    }

    @Override
    public void removeObligation(String obligation) {
        if (getObligations().contains(obligation))
            getObligations().remove(obligation);
    }

    public List<String> getObligations(){return obligations;}


    @Override
    public String toString(){
        return super.toString()+",obligations = ["+getObligations()+" ] , subordinate = [" +getSubordinates().keySet()+"]\n";
    }


}
