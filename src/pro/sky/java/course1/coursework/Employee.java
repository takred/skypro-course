package pro.sky.java.course1.coursework;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 0;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String result = "";
        result += "ФИО - " + fullName + "\n";
        result += "Отдел - " + department + "\n";
        result += "Зарплата - " + salary + "\n";
        result += "Id - " + id;
        return result;
    }
}
