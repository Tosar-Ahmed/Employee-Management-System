package employee_management_system;

public class Manufacturer extends EmployeeDetails implements Functionality {

    public Manufacturer(String name, String id, int age, String PhoneNumber, String Email, String address, double salary, int servicePeriod) {
        super(name, id, age, PhoneNumber, Email, address, salary, servicePeriod);
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

        System.out.println("Your vocation day: 14 days");

    }

    public void calBonus() {
        if (this.getServicePeriod() >= 12) {
            System.out.println("50% Eid bonus");
        }
    }
}
