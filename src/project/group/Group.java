package project.group;

import project.employee.Employee;

import java.util.*;

public class Group {

    private List<Employee> employees = new ArrayList<>();

    public Group(List<Employee> employees) {
        this.employees = employees;
    }
    public Group() {
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public String toString(){
        for (Employee e : employees)
            System.out.println(subordinateTree(e,0));
        return employees.toString();
    }
    public Employee findEmployee(String name){
        String n;
        for (Employee employee : employees)
             if(employee.getName().substring(0,employee.getName().indexOf(" ")).equals(name))
                return employee;
            return null;
    }
    public String toString(String name){
        try{
        Employee employee = findEmployee(name);
        if (employee == null) throw new NullPointerException();
        return subordinateTree(employee,0);
        }
        catch (NullPointerException e) {}
        return "Object not found";
       // return employee.toString();
    }

    public String subordinateTree(Employee employee, int n) {
        String str = "";
        String space = "";
        for (int i = 0; i<n;i++) space+=" ";
        str += space + employee.getName()+"\n";
        n++;
        Map<String,Employee> employees = employee.getSubordinates();
        for (Employee e : employees.values()){
                str += space+ "|_" + subordinateTree(e, n) ;
        }
        return str;
    }
}
