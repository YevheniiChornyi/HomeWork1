package CollectionsHW;

public class Employee implements Comparable<Employee>{
    String name;
    int salary;
    String department;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}' + '\n';
    }

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary < o.salary){
            return -1;
        } else if(this.salary > o.salary){
            return 1;
        }
        return 0;
    }
}
