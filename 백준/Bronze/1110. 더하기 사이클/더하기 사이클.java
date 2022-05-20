import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int count = 0;
        do {

            n = ((n%10)*10 + ((n/10) + (n%10))%10);
            count++;
        }
        while (copy != n) ;

        System.out.println(count);

    }
}