package Problem_2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private static final int RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    public void printTargetHeartRateRange() {
        int maxHeartRate = calculateMaxHeartRate();
        int averageHeartRate = maxHeartRate - RESTING_HEART_RATE;
        int lowerBoundaryTargetHeartRate = (int) (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        int upperBoundaryTargetHeartRate = (int) (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.println("The target Heart Rate Range is between " + lowerBoundaryTargetHeartRate + " and "
                + upperBoundaryTargetHeartRate);
    }

    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName +
                "\nAge: " + calculateAge() +
                "\nDate of Birth: " + dateOfBirth +
                "\nMaximum Heart Rate: " + calculateMaxHeartRate();
    }
}
