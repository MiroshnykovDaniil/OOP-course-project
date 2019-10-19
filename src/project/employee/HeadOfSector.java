package project.employee;

import java.util.*;

public class HeadOfSector extends Employee {

    private String sectorName;
    private Set<String> departments = new HashSet<>();
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
    public int getSalary() {
        return super.getSalary() + getBonus();
    }

    public int getBonus() {
        return bonus;
    }

    public void addObligation(String obligation) {
        getObligations().add(obligation);
    }

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
    @Override
    public void addSubordinate(Employee subordinate) {
        getSubordinates().put(subordinate.getName(),subordinate);
        departments.add(subordinate.getDepartment());
    }
}
