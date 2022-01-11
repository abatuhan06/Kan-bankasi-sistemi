import java.util.Scanner;

public class Donor extends Customer{
    int d;
    static int c = 0;
    static boolean agee;
    Scanner scan =new Scanner(System.in);
    Donor [] dlist;

    public Donor()
    {
        dlist= new Donor[100];
    }


    public Donor(String name , int age , String mail , String bloodtype)
    {
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.bloodtype = bloodtype;
    }


    public void inputDonor ()
    {

        for (int i=0 ; i<1 ; i++)
        {
            System.out.println("\nBilgilerinizi giriniz.");
            System.out.println("\nIsminiz : ");
            name = scan.next();
            System.out.println("Yasınız : ");
            age = scan.nextInt();
            if (age>=18){Donor.setAgee(true);}
            System.out.println("Mail adresi : ");
            mail = scan.next();
            boolean loop1 = true;
            while (loop1){
                if (mail.contains("@")){
                    loop1 = false;
                }else {
                    System.out.println("Lutfen gecerli bit mail adresi girin: ");
                    mail = scan.next();
                }
            }
            System.out.println("Kan tipi : ");
            bloodtype = scan.next();
            boolean loop = true;
            while(loop){
            if (bloodtype.equalsIgnoreCase("a+")||bloodtype.equalsIgnoreCase("a-")||bloodtype.equalsIgnoreCase("ab+")||bloodtype.equalsIgnoreCase("ab-")||bloodtype.equalsIgnoreCase("b+")||bloodtype.equalsIgnoreCase("b-")||bloodtype.equalsIgnoreCase("0+")||bloodtype.equalsIgnoreCase("0-")){
                donorcheck();
                if (donorcheck == false ){dlist[c] = new Donor( name , age , mail , bloodtype); c++;} donorcheck = true;
                loop = false;
            }else {System.out.println("Hatali giris. Tekrar deneyin.\nKan tipi : ");
                   bloodtype = scan.next();}}
            Nurse.setbloodtype(bloodtype);
        }

    }

    public String getBloodtype(){
        return bloodtype;
    }

    @Override
    public String toString(){
        return "\nIsim :" + name +"\nYas :" + age + "\nmail :"+ mail ;

    }

    boolean donorcheck;

    public void donorcheck(){
        for (int j = 0; j < c; j++) {
            if (mail.equalsIgnoreCase(dlist[j].mail)) {
                System.out.println("Tekrar kan bagisladiginiz icin tesekkurler");
            }
            else if (!mail.equalsIgnoreCase(dlist[j].mail) || dlist[j].mail == null) {
                donorcheck = false;
            }
        }
    }

    public void Displaydonorlist() {
        String listbloodtype;
        System.out.println("Listelemek istediginiz kan grubunu giriniz: ");
        listbloodtype = scan.next();
        if (listbloodtype.equalsIgnoreCase("a+") || listbloodtype.equalsIgnoreCase("a-") || listbloodtype.equalsIgnoreCase("ab+") || listbloodtype.equalsIgnoreCase("ab-") || listbloodtype.equalsIgnoreCase("b+") || listbloodtype.equalsIgnoreCase("b-") || listbloodtype.equalsIgnoreCase("0+") || listbloodtype.equalsIgnoreCase("0-")) {
             if (dlist[0] != null){
                System.out.println("Donor listesi :");
                for (int j = 0; j < c; j++) {
                    if (listbloodtype.equalsIgnoreCase(dlist[j].bloodtype)) {
                        System.out.println("" + dlist[j].toString());
                    }
                    else /*if (!listbloodtype.equalsIgnoreCase(dlist[j].bloodtype))*/ {
                        System.out.println("ilgili kan grubuyla donor bulunmuyor");
                    }
                }
            }else {
                System.out.println("Sistemde hic donor yok");
            }
        }
    }
    static public boolean getAgee(){
        return agee;
    }

    static public void setAgee(boolean newagee){
        agee = newagee;
    }
}
