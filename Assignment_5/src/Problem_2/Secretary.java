package Problem_2;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, int year, int month, int day, double salary, double overtimeHours) {
        super(name, year, month, day, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHours);
    }
}
