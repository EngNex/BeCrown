import java.util.Scanner;

public class BeCrowd_1046 {
        public static void main(String[] args){
            Scanner sc  = new Scanner(System.in);

            int initialHours = sc.nextInt();
            int finalHours = sc.nextInt();

            int duration;

            if (finalHours > initialHours){
                duration = finalHours - initialHours;
            }else if (finalHours < initialHours){
                duration = (24 - initialHours) + finalHours;
            }else{
                duration = 24;
            }
            System.out.println("O JOGO DUROU " + duration + " HORA(S)" );
                sc.close();
        }
    }

