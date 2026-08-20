import java.util.Scanner;

public class IndiaMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        String s1 =
                "TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";

        int a = 10;
        int b = 0;
        int c = 10;

        while (a != 0 && b < s1.length()) {

            a = s1.charAt(b);

            while (a > 64) {

                a--;

                if (++c == 'Z') {
                    c /= 9;
                    System.out.print((char) c);
                } else {
                    System.out.print((char) (33 ^ (b & 1)));
                }
            }

            b++;
        }

        sc.close();
    }
}