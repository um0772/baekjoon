import java.util.Scanner;

public class baekjoon2444 {

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*N - 2*i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}