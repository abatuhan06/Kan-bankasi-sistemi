import java.util.ArrayList;

public class Bloodgroup {

    String Bloodtype;
    int amount;

    //Bloodgroup[] bloods = new Bloodgroup[8];

    public Bloodgroup(String bloodtype, int Amount)
    {
        this.Bloodtype = bloodtype;
        this.amount = Amount;
    }

    public Bloodgroup(){/*
        bloods[0] = new Bloodgroup("A+",5);
        bloods[1] = new Bloodgroup("A-",0);
        bloods[2] = new Bloodgroup("B+",0);
        bloods[3] = new Bloodgroup("B-",0);
        bloods[4] = new Bloodgroup("AB+",0);
        bloods[5] = new Bloodgroup("AB-",0);
        bloods[6] = new Bloodgroup("0+",0);
        bloods[7] = new Bloodgroup("0-",0);*/
    }

    public String toString(){
        return "\nKan tipi :" + Bloodtype +" Stok :" + amount;
    }

/*
    public void bloodincrease(String type){
        for (int a = 0; a <= 7 ; a++){
            if (type.equalsIgnoreCase(bloods[a].Bloodtype)){
                bloods[a].amount = bloods[a].amount + 1;
                aa=999;
                System.out.println("arttırıldı "+aa+" "+bloods[a].amount);
            }
        }
    }*/
/*
    public void blooddecrease(int amount, String type){
        for (int a = 0; a <= 7 ; a++){
            if (type.equalsIgnoreCase(bloods[a].Bloodtype)){
                if (bloods[a].amount >= amount) {
                    bloods[a].amount = bloods[a].amount - amount;
                    System.out.println("azaltildi");
                }
                else { System.out.println("yeterli kan yok!");}
            }
        }
    }*/

/*
    public void Displaybloodslist()
    {
        System.out.println("Kan Stok listesi :");
        for (int j=0 ; j < 8 ; j++) {
            //System.out.println(""+bloods[j].toString());
            System.out.println("Kan tipi: "+bloods[j].Bloodtype+" Stok: "+bloods[j].amount+aa);
        }
    }*/



}
