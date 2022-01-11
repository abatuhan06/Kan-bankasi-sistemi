import java.util.Scanner;

public class Nurse extends staff{

    String name;
    private int Id;
    static String donorbloodtype;

    Scanner sc = new Scanner(System.in);

    public Nurse()
    {

    }

    public Nurse(String name , int Id)
    {
        this.name=name;
        this.Id=Id;
    }

    public void takingBlood()
    {
        System.out.println("\nKan alindi, Tesekkurler!");
        //Bloodgroup a = new Bloodgroup();
        //a.bloodincrease(donorbloodtype);
    }

    static public void setbloodtype(String bloodtype){
        donorbloodtype = bloodtype;
    }



}
