package project.interfaces;

import project.employee.DepartmentHead;
import project.employee.Employee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.NoSuchElementException;

public interface FindAge<T>{
    public  String findAge(ArrayList<T> employees);
}