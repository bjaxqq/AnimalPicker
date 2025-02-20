import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to the Animal Picker!");

			while (true) {
			    System.out.println("Which animal do you want to see, a dog or a cat?: ");
			    String animal = scanner.nextLine();

			    if (animal.equalsIgnoreCase("dog")) {
			        System.out.println("DOG ASCII");
			        break;
			    } else if (animal.equalsIgnoreCase("cat")) {
			        System.out.println("CAT ASCII");
			        break;
			    } else {
			        System.out.println("Error: Invalid option! Please choose 'dog' or 'cat'.");
			    }
			}
		}
    }
}