import java.util.*;
public class EmployeesMain {
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
        boolean f=true;
        while(f) {
        System.out.println("Employee Details");
        System.out.println("Name: "+emp.getName());
        System.out.println("Address: "+emp.getAddress());
        System.out.println("Mobile: "+emp.getMobile());
        System.out.println("Verify and Update the details:");
        System.out.println("Menu");
        System.out.println("1. Update Employee name");
        System.out.println("2. Update Employee Address");
        System.out.println("3. Update Employee Mobile");
        System.out.println("4. All information is correct/Exit");
        int op=sc.nextInt();
        
       
        switch(op){
            case 1:
                    System.out.println("Current name"+emp.getName());
                    System.out.println("Enter the Name: ");
                    String na=sc.next();
                    emp.setName(na);
                    System.out.println("Wanted more update(Y/N||y/n):");
                    String c=sc.next();
                    if(c.equals("N")||c.equals("n")){
                            f=false;
                            break; 
                    } 
                    break;
                
            case 2:
                    System.out.println("Current Address"+emp.getAddress());
                    System.out.println("Enter the Address: ");
                    String Ad=sc.next();
                    emp.setAddress(Ad);
                    System.out.println("Wanted more update(Y/N):");
                    String cm=sc.next();
                    if(cm.equals("N")){
                            f=false;
                            break;
                    }
                    break;
                    
            case 3:
                    System.out.println("Current Mobile"+emp.getMobile());
                    System.out.println("Enter the Mobile: ");
                    String Mo=sc.next();
                    emp.setMobile(Mo);
                    System.out.println("Wanted more update(Y/N):");
                    String cn=sc.next();
                    if(cn.equals("N")){
                            f=false;
                            break; 
                    }
                    break;
                      
            case 4:
                    System.out.println("The Details are:");
                    System.out.println("Name: "+emp.getName());
                    System.out.println("Address: "+emp.getAddress());
                    System.out.println("Mobile: "+emp.getMobile());
                    System.out.println("Wanted more update(Y/N):");
                    String CN=sc.next();
                    if(CN.equals("N")){
                            f=false;
                            break; 
                    }

                    break;     
        }
        }
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }

    }
}
