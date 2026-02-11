import java.util.Scanner;

class java8 {
    public static boolean canVote(int age) {
        return (age >= 18);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < 10; i++) {
            System.out.println(ages[i] + "\t" + (canVote(ages[i]) ? "Yes" : "No"));
        }

        sc.close();
    }
}
