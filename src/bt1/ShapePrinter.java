package bt1;

import java.util.Scanner;

public class ShapePrinter {
    public static void printIsoscelesTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter width of the rectangle: ");
                    int width = scanner.nextInt();
                    System.out.print("Enter height of the rectangle: ");
                    int height = scanner.nextInt();
                    printRectangle(width, height);
                    break;
                case 2:
                    System.out.println("Select type of square triangle:");
                    System.out.println("1. Bottom-left");
                    System.out.println("2. Top-left");
                    System.out.println("3. Bottom-right");
                    System.out.println("4. Top-right");
                    System.out.print("Enter your choice: ");
                    int triangleType = scanner.nextInt();
                    System.out.print("Enter the size of the triangle: ");
                    int size = scanner.nextInt();
                    String[] types = {"bottom-left", "top-left", "bottom-right", "top-right"};
                    printSquareTriangle(types[triangleType - 1], size);
                    break;
                case 3:
                    System.out.print("Enter height of the isosceles triangle: ");
                    int triangleHeight = scanner.nextInt();
                    printIsoscelesTriangle(triangleHeight);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void printSquareTriangle(String type, int size) {
        switch (type) {
            case "bottom-left":
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case "top-left":
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case "bottom-right":
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case "top-right":
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (4 types)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
