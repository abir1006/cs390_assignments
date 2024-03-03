package Problem_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Mike Hussy", 2000, 1, 1, 110000, 11);
        Professor prof2 = new Professor("Darren Lehman", 2001, 2, 2, 98000, 10);
        Professor prof3 = new Professor("Steve Waugh", 2002, 3, 3, 95000, 9);
        Secretary sec1 = new Secretary("Shakib Al Hassan", 2003, 4, 4, 45000, 4);
        Secretary sec2 = new Secretary("Tamim Iqbal", 2004, 5, 5, 38000, 5);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = prof1;
        department[1] = prof2;
        department[2] = prof3;
        department[3] = sec1;
        department[4] = sec2;

        System.out.print("Do you wishes to see the sum of all Professor and Secretary salary in the department (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toUpperCase();

        if (choice.equals("Y")) {
            double totalSalary = 0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total Salary: $" + totalSalary);
        } else {
            System.out.println("Exiting program...");
        }

        scanner.close();
    }

}
