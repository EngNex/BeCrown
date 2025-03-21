import java.util.Scanner;
public class bee_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialHours = sc.nextInt();
        int initialMinutes = sc.nextInt();
        int finalHours = sc.nextInt();
        int finalMinutes = sc.nextInt();

        int initialWithMinutes = initialHours * 60 + initialMinutes;
        int finalWithMinutes = finalHours * 60 + finalMinutes;

        int durationMinutes;
        if(finalWithMinutes < initialWithMinutes){
            durationMinutes = (1440 - initialWithMinutes) + finalWithMinutes;
        }else{
            durationMinutes = finalWithMinutes - initialWithMinutes;
        }

        if(durationMinutes == 0){
            durationMinutes = 1440;
        }
        int hours = durationMinutes / 60;
        int minutes = durationMinutes % 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hours, minutes);

        sc.close();

    }
}
