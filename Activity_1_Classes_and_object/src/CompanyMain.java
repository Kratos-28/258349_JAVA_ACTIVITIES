import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SystemPropertiesWriter;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company c=new Company();
        System.out.println("Enter the company name:");
        String name=sc.next();
        c.setName(name);
        System.out.println("Enter the employees:");
        String employees=sc.next();
        c.setemployees(employees);
        System.out.println("Enter the teamlead:");
        String teamlead=sc.next();
        c.setteamlead(teamlead);
        System.out.println("Name: "+c.getName());
        System.out.println("Employees: "+c.getemployees());
        System.out.println("Lead: "+c.getteamlead());

    }
    
}
