
package employee_management_system;


public abstract class EmployeeDetails{
    private String name, id;
    private int age;
    private String PhoneNumber, Email, address;
    private double salary;
    private int servicePeriod;
    private int vocationDate;

    public EmployeeDetails(String name, String id, int age, String PhoneNumber, String Email, String address, double salary, int servicePeriod) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.address = address;
        this.salary = salary;
        this.servicePeriod = servicePeriod;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public int getServicePeriod() {
        return servicePeriod;
    }

    public int getVocationDate() {
        return vocationDate;
    }


    void calFine(int lastmonthtime, int workingDay) {
        int total1 = lastmonthtime * 8;
        int total2 = workingDay * 8;
        if (total2 >= total1) {

            System.out.println("No Fine");
        } else {
            System.out.println("Your Late Fine is:" + (salary * 0.1));
        }

    }
    

}
