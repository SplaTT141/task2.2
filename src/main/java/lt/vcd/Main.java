package lt.vcd;
import java.util.Scanner;

public class Main {
    static void main() {
            Scanner in = new Scanner(System.in);

            System.out.println("Iveskite valandas, minutes ir sekundes:");
            int h = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();

            s++;

            if (s >= 60) {
                m++;
                s = 0;
            }

            if (m >= 60) {
                h++;
                m = 0;
            }

            if (h >= 24) {
                h = 0;
            }

            System.out.print(h + ":" + m + ":" + s);
        }
    }
