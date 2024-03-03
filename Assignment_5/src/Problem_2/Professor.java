package Problem_2;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, int year, int month, int day, double salary, int numberOfPublications) {
        super(name, year, month, day, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
