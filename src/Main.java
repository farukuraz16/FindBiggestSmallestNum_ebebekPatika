import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?= ");//ask for count
        int count = dat.nextInt();
        int numB = 0, numS = 0;//assign biggest and smallest data
        for (int i = 1; i <= count; i++) {
            System.out.print("Please enter " + i + ". number= ");
            int num = dat.nextInt();

            if (i == 1) {
                numS = num;//assign first value
                numB = num;//assign first value
            }

            if (num > numB) numB = num;//assign if bigger
            if (num < numS) numS = num;//assign if smaller

        }
        System.out.println("Biggest number is " + numS);
        System.out.println("Smallest number is " + numB);
    }

}
