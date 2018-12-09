
package employee_management_system;

import java.util.ArrayList;


public class Employee_Management_System {

    
    public static void main(String[] args) {
        
        Female_Employee f1=new Female_Employee("Dola","1001",22,"017","dola@gmail.com","Rangpur",10000,13,8);
        Female_Employee f2=new Female_Employee("Mukti","1002",21,"017","mukti@gmail.com","khustia",12000,15,5);    
        ArrayList<Female_Employee>fl=new ArrayList<>();
        
        Male_Employee m1=new Male_Employee("Tareq","172",21,"016","tareq@gmail.com","faridpur",15000,10);
        ArrayList<Male_Employee>ml=new ArrayList<>();
        
        fl.add(f1);
        fl.add(f2);
        f1.giveSalary(45000);
        f1.vocation_day();
        f1.calBonus();
        ml.add(m1);
        m1.giveSalary(50000);
        m1.vocation_day();
        m1.calBonus();
        
        Manager manager1=new Manager("Emon","2001",25,"0167","emon@gmail.com","Dhaka",30000,25);
        manager1.check_absent(fl,ml);
      
    
    }
    
}
