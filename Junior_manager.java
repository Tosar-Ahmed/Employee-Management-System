package employee_management_system;

public class Junior_manager extends Manager implements Functionality {

    public Junior_manager(String name, String id, int age, String PhoneNumber, String Email, String address, double salary, int servicePeriod) {
        super(name, id, age, PhoneNumber, Email, address, salary, servicePeriod);
    }

    public void giveSalary(double balance) {
        balance = balance - this.getSalary();
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + this.getName() + "\nSalary:" + this.getSalary() + "\nTracking Code:" + 111111);
    }

    public void vocation_day(String gender, String type) {
        if (gender.equalsIgnoreCase("Female") && type.equalsIgnoreCase("pregnancy")) {
            System.out.println("Your vocation day: 12 weeks");
        } else {
            System.out.println("Your vocation day: 18 days");
        }
    }

    @Override
    public void calBonus() {
        if (this.getServicePeriod() >= 12) {
            System.out.println("50% Eid bonus");
        }
    }
}
