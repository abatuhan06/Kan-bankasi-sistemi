import java.util.Scanner;

public class Doctor extends staff{
    String name;
    private int Id;
    static Boolean doccheck = false;
    Scanner sc = new Scanner(System.in);

    public Doctor()
    {

    }

    public Doctor(String name , int Id)
    {
        this.name=name;
        this.Id=Id;

    }

    public int getid()
    {
        return Id;
    }

    public void setid(int Id)
    {
        this.Id = Id;
    }

    public void checkDonor()
    {
        System.out.println("\nAsagıdaki sorulara evet ise 1 hayir ise 0 seklinde cevap verin");
        int Ans;

        if (Donor.getAgee() == true)
        {
            System.out.println("\nAgirliginiz 45kg'dan fazla mi?");
            Ans =sc.nextInt();
            Donor.setAgee(false);

            boolean loop = true;
            while (loop){
                if (Ans == 1 || Ans == 0) {
                    loop = false;
                }else {
                    System.out.println("Yalnizca 1 ve 0 girisi yapiniz");
                    System.out.println("\nAgirliginiz 45kg'dan fazla mi?");
                    Ans =sc.nextInt();
                }
            } loop = true;

            if (Ans == 1)
            {
                System.out.println("\nAgir bir hastaliginiz var mi?");
                Ans=sc.nextInt();
                while (loop){
                    if (Ans == 1 || Ans == 0) {
                        loop = false;
                    }else {
                        System.out.println("Yalnizca 1 ve 0 girisi yapiniz");
                        System.out.println("\nAgir bir hastaliginiz var mi?");
                        Ans =sc.nextInt();
                    }
                } loop = true;

                if (Ans == 0)
                {
                    System.out.println("\nHerhangi bir antibiyotik kullaniyor musunuz?");
                    Ans = sc.nextInt();
                    while (loop){
                        if (Ans == 1 || Ans == 0) {
                            loop = false;
                        }else {
                            System.out.println("Yalnizca 1 ve 0 girisi yapiniz");
                            System.out.println("\nHerhangi bir antibiyotik kullaniyor musunuz?");
                            Ans =sc.nextInt();
                        }
                    } loop = true;

                    if (Ans == 0)
                    {
                        System.out.println("\nKan bagislayabilirsiniz, hemsireye yonlendiriliyorsunuz\n");
                        Nurse nus = new Nurse();
                        nus.takingBlood();
                        this.doccheck = true;
                    }
                    else if (Ans == 1)
                    {
                        System.out.println("\nKan bagisinda bulunamazsiniz.\n");
                        Donor.c--;
                    }
                }
                else if (Ans == 1)
                {
                    System.out.println("\nKan bagisinda bulunamazsiniz.\n");
                    Donor.c--;
                }

            }
            else if (Ans == 0)
            {
                System.out.println("\nKan bagisinda bulunamazsiniz.\n");
                Donor.c--;
            }
        }
        else
        {
            System.out.println("\nKan bagisinda bulunamazsiniz.\n");
            Donor.c--;
        }
    }

}
