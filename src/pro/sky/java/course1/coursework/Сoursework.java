package pro.sky.java.course1.coursework;

public class Сoursework {
    static void showAllInfo(Employee[] database) {
        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i]);
            System.out.println();
        }
    }

    static int salarySum(Employee[] database) {
        int salarySum = 0;
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null) {
                salarySum += database[i].getSalary();
            }
        }
        return salarySum;
    }

    static Employee getEmployeeWithMinSalary(Employee[] database) {
        Employee minSalary = null;

        for (int i = 1; i < database.length; i++) {
            if (minSalary == null &&
            database[i] != null) {
                minSalary = database[i];
                continue;
            }

            if (database[i] != null &&
                    database[i].getSalary() < minSalary.getSalary()) {
                minSalary = database[i];
            }
        }
        return minSalary;
    }

    static Employee getEmployeeWithMaxSalary(Employee[] database) {
        Employee maxSalary = null;

        for (int i = 1; i < database.length; i++) {
            if (maxSalary == null &&
                    database[i] != null) {
                maxSalary = database[i];
                continue;
            }

            if (database[i] != null &&
                database[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = database[i];
            }
        }
        return maxSalary;
    }

    static int averageSalaryValue(Employee[] database) {
        int salarySum = salarySum(database);
        int numberOfEmployees = 0;

        for (int i = 0; i < database.length; i++) {
            if (database[i] != null) {
                numberOfEmployees++;
            }
        }
        return salarySum / numberOfEmployees;
    }

    static void showAllFullName(Employee[] database) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null) {
                System.out.println(database[i].getFullName());
            }
        }
    }

    static void indexingSalary(Employee[] database, int index) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null) {
                int newSalary = database[i].getSalary() + ((database[i].getSalary() / 100) * index);
                database[i].setSalary(newSalary);
            }
        }
    }

    static Employee getEmployeeWithMinSalaryInDepartment(Employee[] database, int department) {
        Employee[] currentDepartment = new Employee[database.length];

        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getDepartment() == department) {
                currentDepartment[i] = database[i];
            }
        }

        return getEmployeeWithMinSalary(currentDepartment);
    }

    static Employee getEmployeeWithMaxSalaryInDepartment(Employee[] database, int department) {
        Employee[] currentDepartment = new Employee[database.length];

        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getDepartment() == department) {
                currentDepartment[i] = database[i];
            }
        }

        return getEmployeeWithMaxSalary(currentDepartment);
    }

    static int salarySumInDepartment(Employee[] database, int department) {
        Employee[] currentDepartment = new Employee[database.length];

        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getDepartment() == department) {
                currentDepartment[i] = database[i];
            }
        }
        return salarySum(currentDepartment);
    }

    static int averageSalaryValueInDepartment(Employee[] database, int department){
        Employee[] currentDepartment = new Employee[database.length];

        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getDepartment() == department) {
                currentDepartment[i] = database[i];
            }
        }
        return averageSalaryValue(currentDepartment);
    }

    static void indexingSalaryInDepartment(Employee[] database, int index, int department) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
            database[i].getDepartment() == department) {
                int newSalary = database[i].getSalary() + ((database[i].getSalary() / 100) * index);
                database[i].setSalary(newSalary);
            }
        }
    }

    static void showAllInfoInDepartment(Employee[] database, int department) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getDepartment() == department) {
                System.out.println("ФИО - " + database[i].getFullName());
                System.out.println("Зарплата - " + database[i].getSalary());
                System.out.println("Id - " + database[i].getId());
                System.out.println();
            }
        }
    }

    static void showAllEmployeesWithASalaryLessThanANumber(Employee[] database, int salary) {
        System.out.println("Сотрудники с зарплатой меньше " + salary + ":");

        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getSalary() < salary) {
                System.out.println("ФИО - " + database[i].getFullName());
                System.out.println("Зарплата - " + database[i].getSalary());
                System.out.println("Id - " + database[i].getId());
                System.out.println();
            }
        }
    }

    static void showAllEmployeesWithASalaryGreaterThanANumber(Employee[] database, int salary) {
        System.out.println("Сотрудники с зарплатой больше или равной " + salary + ":");


        for (int i = 0; i < database.length; i++) {
            if (database[i] != null &&
                    database[i].getSalary() >= salary) {
                System.out.println("ФИО - " + database[i].getFullName());
                System.out.println("Зарплата - " + database[i].getSalary());
                System.out.println("Id - " + database[i].getId());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Employee[] database = new Employee[10];
        Employee a = new Employee("A A A", 3, 70000);
        Employee b = new Employee("B B B", 2, 45000);
        Employee c = new Employee("C C C", 5, 62000);
        Employee d = new Employee("D D D", 4, 89000);
        Employee e = new Employee("E E E", 1, 58000);
        Employee f = new Employee("F F F", 1, 51000);
        Employee g = new Employee("G G G", 4, 49000);
        Employee h = new Employee("H H H", 5, 83000);
        Employee i = new Employee("I I I", 2, 90000);
        Employee j = new Employee("J J J", 3, 56000);

        database[0] = a;
        database[1] = b;
        database[2] = c;
        database[3] = d;
        database[4] = e;
        database[5] = f;
        database[6] = g;
        database[7] = h;
        database[8] = i;
        database[9] = j;

        showAllInfo(database);
        System.out.println(salarySum(database));
        System.out.println(getEmployeeWithMinSalary(database));
        System.out.println(getEmployeeWithMaxSalary(database));
        System.out.println(averageSalaryValue(database));
        showAllFullName(database);
        indexingSalary(database, 10);
        System.out.println(getEmployeeWithMinSalaryInDepartment(database, 3));
        System.out.println(getEmployeeWithMaxSalaryInDepartment(database, 5));
        System.out.println(salarySumInDepartment(database, 1));
        System.out.println(averageSalaryValueInDepartment(database, 2));
        indexingSalaryInDepartment(database, 5, 4);
        showAllInfoInDepartment(database, 4);
        showAllEmployeesWithASalaryLessThanANumber(database, 60000);
        showAllEmployeesWithASalaryGreaterThanANumber(database, 65000);

    }
}
