package employee_management_system;

import java.util.ArrayList;

public class Manager extends EmployeeDetails implements Functionality {

    private String managertype;

    public Manager(String name, String id, int age, String PhoneNumber, String Email, String address, double salary, int servicePeriod) {
        super(name, id, age, PhoneNumber, Email, address, salary, servicePeriod);
    }

    public String getManagertype() {
        return managertype;
    }

    @Override
    public void giveSalary(double balance) {
        balance = balance - this.getSalary();
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + this.getName() + "\nSalary:" + this.getSalary() + "\nTracking Code:" + 111111);
    }

    public void vocation_day(String gender, String type) {
        if (gender.equalsIgnoreCase("female")) {
            System.out.println("Your vocation day: 12 weeks");
        };

    }

    public void vocation_day() {

        System.out.println("Your vocation day: 12 weeks");

    }

    @Override
    public void calBonus() {
        if (this.getServicePeriod() >= 12) {
            System.out.println("70% Eid bonus");
        }
    }

    public void check_absent(ArrayList<Female_Employee> fl, ArrayList<Male_Employee> ml) {
        for (Female_Employee f : fl) {
            if (f.getAbsentdays() > 6) {
                System.out.println(f.getName() + "'s absent days: " + f.getAbsentdays());
                System.out.println("Please " + f.getName() + " contact in Office room");
            };
            for (Male_Employee m : ml) {
                if (m.getAbsentdays() > 6) {
                    System.out.println(m.getName() + "'s absent days: " + m.getAbsentdays());
                    System.out.println("Please " + m.getName() + " contact in Office room");
                };
            }
        }

    }

}
