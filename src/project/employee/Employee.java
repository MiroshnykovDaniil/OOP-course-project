package project.employee;

import java.util.*;

import project.interfaces.FindAge;
import project.interfaces.Obligation;

public abstract class Employee implements Obligation {
    private String name;
    private String position;
    private String address;
    private String birthDate;
    private int salary;
    private String department;
    private List<String> obligations = new ArrayList<String>();
    private Map<String, Employee> subordinates = new HashMap<>();
    //private Map<String,Employee> sub = new HashMap<>();

    public Map<String, Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Map<String, Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public String getName(){return name;}
    public String getPosition(){return  position;}
    public String getAddress(){return address;}
    public String getBirthDate(){return birthDate;}
    public int getSalary(){return salary;}
    public List<String> getObligations(){return obligations;}

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, String position, String address, String birthDate, int salary,
                    List<String>obligations, Map<String, Employee> subordinates){
        this.address = address;
        this.birthDate=birthDate;
        this.name=name;
        this.position=position;
        this.salary = salary;
        if (subordinates !=null)this.subordinates = subordinates;
        if (obligations!=null) this.obligations = obligations;
    }
    public String toString(){
        return getClass()+ "[name = "+getName()
                +", position = " +getPosition()
                +", adress = "+ getAddress()+
                ", birth date = "+getBirthDate()
                +", salary = "+ getSalary() +"]";
    }
    public static String findAge(ArrayList<Employee> employees) {
        Employee minByAge = employees
                .stream()
                .max(Comparator.comparing(Employee::getBirthDate))
                .orElseThrow(NoSuchElementException::new);
        Employee maxByAge = employees
                .stream()
                .min(Comparator.comparing(Employee::getBirthDate))
                .orElseThrow(NoSuchElementException::new);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // int mixAge = minByAge.getBirthDate()
        String result = "Min age:[ name = "+ minByAge.getName() + ", Adress = "+minByAge.getAddress()+", Work = " + minByAge.getClass()+
                "] \n Max age: [name = "+ maxByAge.getName() + ", Adress = "+maxByAge.getAddress()+", Work = " + maxByAge.getClass();
        return result;
    }

    public void addSubordinate(Employee subordinate) {
            subordinates.put(subordinate.getName(),subordinate);
    }
    public void removeSubordinate(Employee subordinate){
        if (getSubordinates().containsValue(subordinate))
            getSubordinates().remove(subordinate);
    }

}
