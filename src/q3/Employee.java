package q3;

public class Employee {
    private int id;
    private String fullName;
    private double salary;
    private String jobTitle;

    public Employee(int id, String fullName, double salary, String jobTitle) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void printInformation() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }

    public double getSalaryInYear() {
        return salary * 12;
    }
}

