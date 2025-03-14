import java.util.Scanner;

public class BeCrowd_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sideA =  sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();
        double auxiliary;

        if(sideA < sideB){
            auxiliary = sideA;
            sideA = sideB;
            sideB = auxiliary;
        }

        if(sideA < sideC){
            auxiliary = sideA;
            sideA = sideC;
            sideC = auxiliary;
        }
        if (sideB < sideC){
            auxiliary = sideB;
            sideB = sideC;
            sideC = auxiliary;
        }

        if (sideA >= (sideB + sideC)){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double sideA2 = sideA * sideA;
            double sideB2 = sideB * sideB;
            double sideC2 = sideC * sideC;

            if (sideA2 == (sideB2 + sideC2)){
                System.out.println("TRIANGULO RETANGULO");
            } else if (sideA2 >(sideB2 + sideC2)){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (sideA2 < (sideB2 + sideC2)) {
                System.out.println("TRIANGULO ACUTANGULO");}

            if (sideA == sideB && sideA == sideC) {
                System.out.println("TRIANGULO EQUILATERO");
            }else if(sideA == sideB || sideB == sideC || sideC == sideA){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}
