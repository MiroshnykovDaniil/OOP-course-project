package project.main;

import java.util.ArrayList;

import project.employee.DepartmentHead;
import project.employee.Employee;
import project.employee.HeadOfSector;
import project.employee.Specialist;
import project.group.Group;

public class Main {

    public static  void main(String args[]){
        String name="Иванов Антон Федерович";
        String position="Specialist";
        String adress="Kharkiv";
        String birthDate="01.02.1990";
        int salary=1000;

        HeadOfSector antoha = new HeadOfSector(name,position,adress,birthDate,salary,100,null,null, "Main Sector");
        antoha.addObligation("Работать");
        antoha.addObligation("Много работать");
        antoha.addObligation("Не отдыхать");
        String birthDate1="01.02.1980";
        String birthDate2="01.02.2000";

        DepartmentHead departmentHead = new DepartmentHead("Петров Владислав Викторович",position,adress,birthDate,salary,100,null,null, "First");
        Specialist specialist = new Specialist("Стрельцов Кузьма Валерьевич",position,adress,birthDate1,salary,null,null, "Second");
        DepartmentHead departmentHead1 = new DepartmentHead("Ложкин Дмитрий Васильевич",position,adress,birthDate2,salary,100,null,null, "First");
        antoha.addSubordinate(departmentHead);
        antoha.addSubordinate(specialist);
        antoha.addSubordinate(departmentHead1);
        specialist.addSubordinate(departmentHead1);
        departmentHead1.addSubordinate(departmentHead);

        ArrayList<Employee> vlads = new ArrayList<Employee>();
        vlads.add(departmentHead); vlads.add(specialist); vlads.add(departmentHead1);

       // System.out.println(Employee.findAge(vlads));
       // antoha.addSubordinate(0);
//        System.out.println(antoha);
        Group group = new Group();
        group.addEmployee(antoha);
        group.addEmployee(departmentHead);
        group.addEmployee(specialist);
        group.addEmployee(departmentHead1);
//        System.out.println(group);
       System.out.println(antoha);
//        System.out.println(group.toString());
//        System.out.println(group.findEmployee("Стрельцов"));
    }

}
