import java.util.Scanner;

public class bloodbank {

        public static void main(String[] args) {

        Bloodgroup[] bloods = new Bloodgroup[8];
        bloods[0] = new Bloodgroup("A+",5);
        bloods[1] = new Bloodgroup("A-",0);
        bloods[2] = new Bloodgroup("B+",5);
        bloods[3] = new Bloodgroup("B-",0);
        bloods[4] = new Bloodgroup("AB+",0);
        bloods[5] = new Bloodgroup("AB-",0);
        bloods[6] = new Bloodgroup("0+",0);
        bloods[7] = new Bloodgroup("0-",0);

        Donor Don = new Donor();
        Doctor Doc = new Doctor ("Dr.batuhan" , 01);
        Patient patient = new Patient();
        Scanner scan = new Scanner(System.in);
        int back, BB;
        do {
            System.out.println("\nKan Bankasina Hosgeldiniz");
            System.out.println("Ne Yapmak Istersiniz");
            System.out.println("1)Kan bagisla\n2)Kan al\n3)Kayitli donorleri listele\n4)Kayitli hastalari listele\n5)Kan grubu listesi\n6)Cıkıs");
            BB = scan.nextInt();
            switch (BB){
                case 1:
                {
                    Don.inputDonor();
                    Doc.checkDonor();
                    if (Doctor.doccheck == true){
                    for (int a = 0; a <= 7 ; a++){
                        if (Don.getBloodtype().equalsIgnoreCase(bloods[a].Bloodtype)){
                            bloods[a].amount = bloods[a].amount + 1;
                            System.out.println("arttırıldı "+" "+bloods[a].amount);
                        }
                    }Doctor.doccheck = false;}
                    System.out.println("\n\nResepsiyona donmek icin 0'a basin.\n");
                    back = scan.nextInt();
                    break;
                }

                case 2:
                {
                    patient.inputPatients();
                    for (int a = 0; a <= 7 ; a++){
                        if (patient.getBloodtype().equalsIgnoreCase(bloods[a].Bloodtype)){
                            if (bloods[a].amount >= patient.bloodamount) {
                                bloods[a].amount = bloods[a].amount - patient.bloodamount;
                                System.out.println("azaltildi");
                            }
                            else { System.out.println("yeterli kan yok!");}
                        }
                    }
                    System.out.println("\nResepsiyona donmek icin 0'a basin.\n");
                    back = scan.nextInt();
                    break;
                }

                case 3:
                {
                    Don.Displaydonorlist();
                    System.out.println("\nResepsiyona donmek icin 0'a basin.\n");
                    back = scan.nextInt();
                    break;
                }

                case 4:
                {
                    patient.Displaypatienstslist();
                    System.out.println("\nResepsiyona donmek icin 0'a basin.\n");
                    back = scan.nextInt();
                    break;
                }

                case 5:
                {
                    Bloodgroup a = new Bloodgroup();
                    //a.Displaybloodslist();
                    System.out.println("Kan Stok listesi :");
                    for (int j=0 ; j < 8 ; j++) {
                        System.out.println(""+bloods[j].toString());
                        //System.out.println("Kan tipi: "+bloods[j].Bloodtype+" Stok: "+bloods[j].amount);
                    }
                    System.out.println("\nResepsiyona donmek icin 0'a basin.\n");
                    back = scan.nextInt();
                    break;
                }

            }
        }while (BB!=6);

    }
}
