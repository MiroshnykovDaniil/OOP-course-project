package project.employee;

import java.util.ArrayList;
import java.util.List;

public class Specialist extends Employee {

    private List<String> obligations= new ArrayList<String>();
    private List<String> subordinates= new ArrayList<String>();

    public Specialist(int salary,String name, String position, String adress, String birthDate, List<String> subordinates, List<String> obligations) {
        super(name, position, adress, birthDate, salary,subordinates);
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
        return super.toString()+",obligations = ["+getObligations()+" ]";
    }


}
