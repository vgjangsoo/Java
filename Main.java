import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner2.nextLine().trim();
        System.out.println("You are " + name);
    }
}