package Problem_2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private int year;
    private int month;
    private int day;
    private LocalDate hireDate;
    private double salary;

    public DeptEmployee(String name, int year, int month, int day, double salary) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        hireDate = LocalDate.of(year, month, day);
        return hireDate;
    }

    public double computeSalary() {
        return salary;
    }
}
