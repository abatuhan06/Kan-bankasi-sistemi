import java.util.Scanner;

public class Patient extends  Customer{
    Scanner sc=new Scanner(System.in);
    Patient [] plist;
    int bloodamount;
    static int c;
    public Patient()
    {
        plist= new Patient[100];
    }

    public Patient(String name , String bloodtype , String mail)
    {
        this.name = name;
        this.bloodtype = bloodtype;
        this.mail = mail;

    }

    public String getbloodtypee()
    {
        return bloodtype;
    }

    public void setpbloodtypee(String bloodtypee)
    {
        this.bloodtype = bloodtypee;
    }

    public void inputPatients ()
    {
        for (int i=0 ; i<1 ; i++)
        {
            System.out.println("\nBilgilerinizi giriniz.");
            System.out.println("\nIsminiz : ");
            name = sc.next();
            System.out.println("\nMail adresi : ");
            mail = sc.next();
            boolean loop1 = true;
            while (loop1){
                if (mail.contains("@")){
                    loop1 = false;
                }else {
                    System.out.println("Lutfen gecerli bit mail adresi girin: ");
                    mail = sc.next();
                }
            }
            System.out.println("\nKan tipi : ");
            bloodtype = sc.next();
            boolean loop = true;
            while(loop){
                if (bloodtype.equalsIgnoreCase("a+")||bloodtype.equalsIgnoreCase("a-")||bloodtype.equalsIgnoreCase("ab+")||bloodtype.equalsIgnoreCase("ab-")||bloodtype.equalsIgnoreCase("b+")||bloodtype.equalsIgnoreCase("b-")||bloodtype.equalsIgnoreCase("0+")||bloodtype.equalsIgnoreCase("0-")){
                    plist[this.c] = new Patient( name , bloodtype , mail);
                    loop = false;
                    System.out.println("Kac tup kan istiyorsunuz :");
                    bloodamount = sc.nextInt();
                    boolean loop11 = true;
                    while (loop11){
                        if (bloodamount < 6) {
                            loop11 = false;
                        }else {
                            System.out.println("En fazla 5 tane kan alabilirsiniz. Lutfen tekrar deneyin.");
                            System.out.println("\nKac tup kan istiyorsunuz :");
                            bloodamount =sc.nextInt();
                        }
                    } loop11 = true;
                    Bloodgroup a = new Bloodgroup();
                    //a.blooddecrease(p ,bloodtype);
                }else {System.out.println("Hatali giris. Tekrar deneyin.\nKan tipi : ");
                    bloodtype = sc.next();}}
            this.c++;
        }


    }

    public String getBloodtype(){
        return bloodtype;
    }

    public int getamount(){
        return bloodamount;
    }

    @Override
    public String toString()
    {
        return "Isim " + name + "\nKan tipi " + bloodtype + "\nmail: " + mail+"\n" ;
    }

    public void Displaypatienstslist()
    {
        System.out.println("Hastalarin listesi :");
        for (int j=0 ; j< this.c ; j++) {
            System.out.println(""+plist[j].toString());
        }
    }

}
