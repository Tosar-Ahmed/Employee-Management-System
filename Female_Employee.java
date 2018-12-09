package employee_management_system;

import java.util.ArrayList;

public class Female_Employee extends EmployeeDetails implements Functionality {

    private int absentdays;

    public Female_Employee(String name, String id, int age, String PhoneNumber, String Email, String address, double salary, int servicePeriod, int absentdays) {
        super(name, id, age, PhoneNumber, Email, address, salary, servicePeriod);
        this.absentdays = absentdays;
    }

    public int getAbsentdays() {
        return absentdays;
    }

    @Override
    public void giveSalary(double balance) {
        balance = balance - this.getSalary();
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + this.getName() + "\nSalary:" + this.getSalary() + "\nTracking Code:" + 111111);
    }

    public void check_name(ArrayList<Female_Employee> fl) {
        for (Female_Employee f : fl) {
            System.out.println(f.getName());
        }
    }

    public void check_email(ArrayList<Female_Employee> fl) {
        for (Female_Employee f : fl) {
            System.out.println(f.getEmail());
        }

    }

    public void check_address(ArrayList<Female_Employee> fl) {
        for (Female_Employee f : fl) {
            System.out.println(f.getAddress());
        }
    }

    public void vocation_day(String type) {
        if (type.equalsIgnoreCase("pregnancy")) {
            System.out.println("Your vocation day: 12 weeks");
        };

    }

    public void vocation_day() {
        {
            System.out.println("Your vocation day: 14 days");
        };

    }

    @Override
    public void calBonus() {
        if (this.getServicePeriod() >= 12) {
            System.out.println("40% Eid bonus");
        }
    }

}
