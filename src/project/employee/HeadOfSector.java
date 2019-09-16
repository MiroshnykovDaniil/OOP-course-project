package project.employee;

import project.interfaces.FindAge;
import project.interfaces.Subordinate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;
public class HeadOfSector extends Employee implements Subordinate<Object>, FindAge<HeadOfSector> {


    private List<String> obligations= new ArrayList<String>();;
    private List<String> subordinates= new ArrayList<String>();;
    private int bonus;
    public HeadOfSector(String name, String position, String adress, String birthDate, int salary, int bonus,
            List<String> obligations, List<String> subordinates) {
        super(name, position, adress, birthDate, salary, obligations);
        this.bonus = bonus;
        if (subordinates != null)
            this.subordinates = subordinates;
        if (obligations != null)
            this.obligations = obligations;
    }

    @Override
    public List<String> getObligations() {
        return obligations;
    }

    public List<String> getSubordinates() {
        return subordinates;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + getBonus();
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public void addObligation(String obligation) {
        getObligations().add(obligation);
    }

    @Override
    public void removeObligation(String obligation) {
        if (getObligations().contains(obligation))
            getObligations().remove(obligation);
    }

    public void addSubordinate(Object subordinate) {
        try {
            Employee employee = (Employee) subordinate;
            subordinates.add(employee.getName());
        } catch (ClassCastException e) {
            System.out.println(
                    "Method: [addSubordinate(Object subordinate)]: Wrong Object. Must be Specialist or HeadOfSector");
        }
    }

    @Override
    public void removeSubordinate(Object subordinate) {
        if (getSubordinates().contains(subordinate))
            getSubordinates().remove(subordinate);
    }

    @Override
    public String toString() {
        return super.toString() + ",obligations = [" + getObligations() + " ], subordinate = [" + getSubordinates()
                + "]";
    }
    @Override
    public String findAge(ArrayList<HeadOfSector> employees) {
        HeadOfSector minByAge = employees
            .stream()
            .max(Comparator.comparing(HeadOfSector::getBirthDate))
            .orElseThrow(NoSuchElementException::new);
        HeadOfSector maxByAge = employees
            .stream()
            .min(Comparator.comparing(HeadOfSector::getBirthDate))
            .orElseThrow(NoSuchElementException::new);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // int mixAge = minByAge.getBirthDate()
        String result = "Min age:[ name = "+ minByAge.getName() + ", Adress = "+minByAge.getAdress()+", Work = " + minByAge.getClass()+
        "] \n Max age: [name = "+ maxByAge.getName() + ", Adress = "+maxByAge.getAdress()+", Work = " + maxByAge.getClass();
        return result;
    }

}
