package ProjectsFund;

import java.util.Scanner;

public class PatternDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;
        do {
            // Step 1: Display a menu to the user
            System.out.println("🌟 Welcome to the Java Pattern Drawing Program!");
            System.out.println("Choose a pattern type:");
            System.out.println("1. Right-angled Triangle");
            System.out.println("2. Square with Hollow Center");
            System.out.println("3. Diamond");
            System.out.println("4. Left-angled Triangle");
            System.out.println("5. Hollow Square");
            System.out.println("6. Pyramid");
            System.out.println("7. Reverse Pyramid");
            System.out.println("8. Rectangle with Hollow Center");

            // Step 2: Get the user's choice
            System.out.print("Enter the number corresponding to your choice: ");
            int choice = Integer.parseInt(scanner.next());

            // Step 3: Get dimensions based on choice
            int rows = 0, width = 0, height = 0;
            if (choice >= 1 && choice <= 7) {
                System.out.print("Enter the number of rows: ");
                rows = scanner.nextInt();
                // TODO: Prompt the user to enter the number of rows
            } else if (choice == 8) {
                System.out.print("Enter the width of the rectangle: ");
                width = scanner.nextInt();
                System.out.print("Enter the height of the rectangle: ");
                height = scanner.nextInt();
                // TODO: Prompt the user to enter the width and height of the rectangle
            } else {
                System.out.println("❌ Invalid choice! Please restart the program.");
                return;
            }

            // Step 4: Generate the selected pattern
            switch (choice) {
                case 1: // Right-angled Triangle
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a right-angled triangle
                    break;

                case 2: // Square with Hollow Center
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= rows; j++) {
                            if (i == 1 || i == rows || j == 1 || j == rows) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a square with a hollow center
                    break;

                case 3: // Diamond
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = rows - 1; i >= 1; i--) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a diamond shape
                    break;

                case 4: // Left-angled Triangle
                    for (int i = rows; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a left-angled triangle
                    break;

                case 5: // Hollow Square
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= rows; j++) {
                            if (i == 1 || i == rows || j == 1 || j == rows) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a hollow square
                    break;

                case 6: // Pyramid
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a centered pyramid
                    break;

                case 7: // Reverse Pyramid
                    for (int i = rows; i >= 1; i--) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a reverse pyramid
                    break;

                case 8: // Rectangle with Hollow Center
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            if (i == 1 || i == height || j == 1 || j == width) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    // TODO: Use nested loops to create a rectangle with a hollow center
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please restart the program.");
                    break;
            }

            // Step 5: Optional - Allow the user to restart or exit
            System.out.print("Do you want to draw another pattern? (yes/no): ");
            String response = scanner.next();
            repeat = response.equalsIgnoreCase("yes");
        }   while (repeat);

        System.out.println("🎉 Thank you for using the Pattern Drawing Program!");
        scanner.close();

        // TODO: Add a feature to let the user restart the program or exit
    }
}

