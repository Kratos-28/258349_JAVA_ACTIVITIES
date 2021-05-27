import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        Employee emp=new Employee();
        try{
        System.out.println("Enter the name:");
        String name=sc.next();
        emp.setName(name);
        System.out.println("Enter Address:");
        String address=sc.next();
        emp.setAddress(address);
        System.out.println("Enter Mobile");
        String Mobile=sc.next();
        emp.setMobile(Mobile);
        
        System.out.println("Employee Details");
        System.out.println("Name: "+emp.getName());
        System.out.println("Address: "+emp.getAddress());
        System.out.println("Mobile: "+emp.getMobile());
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }

    }
}
