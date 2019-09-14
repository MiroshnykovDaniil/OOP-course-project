package project.main;

import project.employee.DepartmentHead;
import project.employee.HeadOfSector;
import project.employee.Specialist;

public class Main {

    public static  void main(String args[]){
        String name="Antoha";
        String position="Specialist";
        String adress="Kharkiv";
        String birthDate="01.02.1990";
        int salary=1000;

        DepartmentHead antoha = new DepartmentHead(name,position,adress,birthDate,salary,100,null,null);
        antoha.addObligation("Работать");
        antoha.addObligation("Много работать");
        antoha.addObligation("Не отдыхать");
        antoha.addObligation("Пить с начальством");
        HeadOfSector vlad = new HeadOfSector("Vlad",position,adress,birthDate,salary,100,null,null);
        antoha.addSubordinate(0);
        System.out.println(antoha);
    }
}
