import java.util.*;
public class Employee {
    private String name;
    private String address;
    private String mobile;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setMobile(String Mobile){
        this.mobile=Mobile;
    }
    public String getMobile(){
        return this.mobile;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
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
}
