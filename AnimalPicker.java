import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to the Animal Picker!");
			System.out.println("Which animal do you want to see, a dog or a cat?: ");
			String animal = scanner.nextLine();

			if (animal.equalsIgnoreCase("dog")) {
			    System.out.println("DOG ASCII");
			} else if (animal.equalsIgnoreCase("cat")) {
			    System.out.println("CAT ASCII");
			} else {
			    System.out.println("Invalid option.");
			}
		}
    }
}