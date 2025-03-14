import java.util.Scanner;

public class BeCrowd_1044 {
        public static void main(String[] args){
            Scanner sc  = new Scanner(System.in);

            int valueA = sc.nextInt();
            int valueB = sc.nextInt();

            if (valueA % valueB == 0 || valueB % valueA == 0){
                System.out.println("Sao Multiplos.");
            }else {
                System.out.println("Nao sao Multiplos.");
            }
            sc.close();
        }
    }

