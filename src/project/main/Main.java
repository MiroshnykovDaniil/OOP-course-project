package project.main;

import java.util.ArrayList;

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
        String birthDate1="01.02.1980";
        String birthDate2="01.02.2000";

        HeadOfSector vlad = new HeadOfSector("Vlad",position,adress,birthDate,salary,100,null,null);
        HeadOfSector vlad1 = new HeadOfSector("Vlad_OLD",position,adress,birthDate1,salary,100,null,null);
        HeadOfSector vlad2 = new HeadOfSector("Vlad_YOUNG",position,adress,birthDate2,salary,100,null,null);

        ArrayList<HeadOfSector> vlads = new ArrayList<HeadOfSector>();
        vlads.add(vlad); vlads.add(vlad1); vlads.add(vlad2);

        System.out.println(vlad.findAge(vlads));

        antoha.addSubordinate(0);
        System.out.println(antoha);
    }

}
