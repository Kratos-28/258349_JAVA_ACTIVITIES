import java.util.*;
public class InningsMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Innings inn=new Innings(); 
        System.out.println("Enter the team name:");
        String tname=sc.next();
        inn.setTeamName(tname);
        System.out.println("Enter session:");
        String s=sc.next(); //Enter only First and Second
        inn.setinningsname(s);
        System.out.println("Enter runs:");
        int runs=sc.nextInt();
        inn.setruns(runs);

        inn.displayInningsDetails();
    }
    
}
