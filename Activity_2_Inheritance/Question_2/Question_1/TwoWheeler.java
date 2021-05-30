package Question_2.Question_1;
public class TwoWheeler extends Vehicle{
    private boolean kickStart;
    TwoWheeler(String make,String Vnumber,String fType,int cap,int cc,boolean kickStart){
        super(make,Vnumber,fType,cap,cc);
        this.kickStart=kickStart;
    }
    public void displayDetailInfo(){
        System.out.println("---Detail Informaion---");
        if(kickStart)
        System.out.println("Kick Start AVAILBLE: "+"YES");
        else{
            System.out.println("Kick Start AVAILBLE: "+"NO");
        }
    }
   
}
