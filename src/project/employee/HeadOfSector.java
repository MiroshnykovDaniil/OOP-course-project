package project.employee;

import project.interfaces.FindAge;
import project.interfaces.Subordinate;

import java.util.*;

public class HeadOfSector extends Employee {

    private String sectorName;
    private Set<String> departments = new HashSet<>();
    private List<String> obligations= new ArrayList<String>();;
    private int bonus;
    public HeadOfSector(String name, String position, String address, String birthDate, int salary, int bonus,
            List<String> obligations, Map<String, Employee> subordinates, String sectorName) {
        super(name, position, address, birthDate, salary, obligations, subordinates);
        this.bonus = bonus;
        this.sectorName = sectorName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public Set<String> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<String> departments) {
        this.departments = departments;
    }

    @Override
    public List<String> getObligations() {
        return obligations;
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


    @Override
    public String toString() {
        return super.toString() + ", sector:  [" + getSectorName()+"]"+
                "departments: ["+ getDepartments() +
                " ],obligations = [" + getObligations() + " ], subordinate = [" + getSubordinates().keySet()
                + "]\n";
    }
    /*
    public static String findAge(ArrayList<HeadOfSector> employees) {
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
        String result = "Min age:[ name = "+ minByAge.getName() + ", Address = "+minByAge.getAddress()+", Work = " + minByAge.getClass()+
        "] \n Max age: [name = "+ maxByAge.getName() + ", Address = "+maxByAge.getAddress()+", Work = " + maxByAge.getClass();
        return result;
    }*/

}
