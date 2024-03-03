package Problem_4;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new CommissionEmployee("Abc", "Xyz", "334455" , 100000, 10);
        employees[1] = new HourlyEmployee("Pqr", "Xyz", "234555" ,50, 8);
        employees[2] = new SalariedEmployee("Lmn", "Abc", "766544" ,20000);
        employees[3] = new BasePlusCommissionEmployee("Opq", "Rst", "112334" ,150000, 5, 30000);

        double sum = 0;

        for (Employee emp: employees) {
            sum += emp.getPayment();
            System.out.println(emp);
        }

        System.out.println("Total salary of employees: " + sum);

    }
}
