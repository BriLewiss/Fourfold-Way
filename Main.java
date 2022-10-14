import java.util.Scanner;
public class Main {

    public static int factorial (int num)
    {
        if (num==0)
        {
            return 1;
        }
        else {
            return (num*factorial(num-1));
        }
    }

    public static double multiplication(int n, int r)
    {
        return Math.pow(n,r);
    }

    public static double permutation(int n,int r)
    {
        return (double) (factorial(n))/factorial(n-r);
    }

    public static double combination (int n, int r)
    {
        return (double) (factorial(n))/(factorial(n-r)*factorial(r));
    }

    public static double multiCombination (int n, int r)
    {
        return (double) (r + n - 1)/(r);
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Welcome to the Fourfold Way computer. \nPlease enter n:");
        int n = sc.nextInt();
        System.out.println("Please enter r:");
        int r = sc.nextInt();
        System.out.println("Does order matter?");
        String order = sc.next();
        System.out.println("Is repetition allowed?");
        String repetition = sc.next();

        if (order.equalsIgnoreCase("yes") && repetition.equalsIgnoreCase("yes"))
        {
            double multi = multiplication(n,r);
            System.out.println("You will be completing multiplication. Your answer is: " + multi);
        }
        else if (order.equalsIgnoreCase("yes") && repetition.equalsIgnoreCase("no"))
        {
            double perm = permutation(n,r);
            System.out.println("You will be completing permutation. Your answer is: " + perm);
        }
        else if (order.equalsIgnoreCase("no") && repetition.equalsIgnoreCase("yes"))
        {
            double multi = multiCombination(n,r);
            System.out.println("You will be completing multi-combination. Your answer is: " + multi);
        }
        else if (order.equalsIgnoreCase("no") && repetition.equalsIgnoreCase("no"))
        {
            double comb = combination(n,r);
            System.out.println("You will be completing combination. Your answer is: " + comb);
        }

    }
}
