package employee_management_system;

import java.util.ArrayList;

public class Male_Employee extends EmployeeDetails implements Functionality {

    private int absentdays;

    public Male_Employee(String name, String id, int age, String PhoneNumber, String Email, String address, double salary, int servicePeriod) {
        super(name, id, age, PhoneNumber, Email, address, salary, servicePeriod);
    }

    @Override
    public void giveSalary(double balance) {
        balance = balance - this.getSalary();
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + this.getName() + "\nSalary:" + this.getSalary() + "\nTracking Code:" + 111111);
    }

    public int getAbsentdays() {
        return absentdays;
    }

    public void check_name(ArrayList<Male_Employee> ml) {
        for (Male_Employee m : ml) {
            System.out.println(m.getName());
        }
    }

    public void check_email(ArrayList<Male_Employee> ml) {
        for (Male_Employee m : ml) {
            System.out.println(m.getEmail());
        }
    }

    public void check_address(ArrayList<Male_Employee> ml) {
        for (Male_Employee m : ml) {
            System.out.println(m.getAddress());
        }
    }

    public void vocation_day(String type) {
        if (type.equalsIgnoreCase("being a father")) {
            System.out.println("Your vocation day: 2 weeks");
        };

    }

    @Override
    public void vocation_day() {

        System.out.println("Your vocation day: 14 days");

    }

    @Override
    public void calBonus() {
        if (this.getServicePeriod() >= 12) {
            System.out.println("40% Eid bonus");
        }
    }
}
