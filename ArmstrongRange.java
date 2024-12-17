import java.util.Scanner;
import java.lang.Math;

class ArmstrongRange {
    int n;

    public void printArmstrongNumbers() {
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isArmstrong(int number) {
        int sum = 0, temp = number;
        int length = String.valueOf(number).length();
        
        while (number > 0) {
            int r = number % 10;
            sum += Math.pow(r, length);
            number /= 10;
        }
        
        return temp == sum;
    }

    public static void main(String[] args) {
        ArmstrongRange a = new ArmstrongRange();
        System.out.println("Enter the range (n): ");
        Scanner sc = new Scanner(System.in);
        a.n = sc.nextInt();
        System.out.println("Armstrong numbers from 1 to " + a.n + ":");
        a.printArmstrongNumbers();
    }
}

