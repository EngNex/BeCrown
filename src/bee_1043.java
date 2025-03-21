import java.util.Scanner;

class bee_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();

        if(sideA > 0 && sideB > 0 && sideC > 0 &&
           sideA + sideB > sideC &&
           sideA + sideC > sideB &&
           sideB + sideC > sideA){

           double perimeter = sideA + sideB + sideC;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        }else{
            double area = ((sideA + sideB) * sideC ) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
        sc.close();
    }
}
