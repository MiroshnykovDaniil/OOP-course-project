package project.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Specialist extends Employee {


    public Specialist(String name, String position, String adress,
                      String birthDate, int salary, Map<String, Employee> subordinates, List<String> obligations,
                      String department) {
        super(name, position, adress, birthDate, salary,obligations,subordinates);
        setDepartment(department);
    }
    public void addObligation(String obligation) {
        getObligations().add(obligation);
        return;
    }
    public void removeObligation(String obligation) {
        if (getObligations().contains(obligation))
            getObligations().remove(obligation);
    }

    @Override
    public String toString(){
        return super.toString()+",obligations = ["+getObligations()+" ] , subordinate = [" +getSubordinates().keySet()+"]\n";
    }


}
