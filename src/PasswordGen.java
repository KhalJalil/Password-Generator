import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;


public class PasswordGen {


    public static void main(String[]args) {


        String charpool= "CD$%EFG{[]|QRS45uv^&*w67TUVYZa:,.bcdJKLMe`!lmno@WX#ABx)fghijk'/NOP;'\\'389HIpqrstxyz120}";


        int amount, lenOfPass;
        Scanner input = new Scanner(System.in);
        out.print("How many passwords do you need? ");
        amount = input.nextInt();


        out.print("Of what lenth? ");
        lenOfPass = input.nextInt();

        input.close();

        Random rand = new Random();
        int amountOfPass=1;



        while (amountOfPass<amount){
            String password="";
            for(int looper =0 ; looper < lenOfPass; looper++) {

                password +=  charpool.charAt(rand.nextInt(charpool.length()));

            }out.print("Password: "+password+"\n");

            amountOfPass+=1;

        }

    }




}
