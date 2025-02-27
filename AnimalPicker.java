import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to the Animal Picker!");

			while (true) {
			    System.out.println("Which animal do you want to see, a dog, a cat, a fish, or a camel?: ");
			    String animal = scanner.nextLine();

			    if (animal.equalsIgnoreCase("dog")) {
			        System.out.println(
                    	"  / \\__\n" +
                    	" (    @\\___\n" +
                    	" /         O\n" +
                    	"/   (_____/\n" +
                    	"/_____/   U\n"
               		);
			        break;
			    } else if (animal.equalsIgnoreCase("cat")) {
			        System.out.println(
                    	"  /\\_/\\\n" +
                    	" ( o.o )\n" +
                    	"  > ^ <\n"
                	);
			        break;
				} else if (animal.equalsIgnoreCase("fish")) {
					System.out.println(
						"      ><>          \n" +
						"     ><><>         \n" +
						"  ><> ><> ><>     \n" +
						" ><><><><><><>    \n"
					);
					break;
				}
				else if(animal.equalsIgnoreCase("camel")){
					System.out.println(" ___.-\'\'\'\'-.\n/___  @    |\n\',,,,.     |         _.\'\'\'\'\'\'\'._\n     \'     |        /           \\\n     |     \\    _.-\'             \\\n     |      \'.-\'                  \'-.\n     |                               \',\n     |                                \'\',\n      \',,-,                           \':;\n           \',,| ;,,                 ,\' ;;\n              ! ; !\'\',,,\',\',,,,\'!  ;   ;:\n             : ;  ! !       ! ! ;  ;   :;\n             ; ;   ! !      ! !  ; ;   ;,\n            ; ;    ! !     ! !   ; ;     \n            ; ;    ! !    ! !     ; ;\n           ;,,      !,!   !,!     ;,;\n           /_I      L_I   L_I     /_I\n");
					break;
			    } else {
			        System.out.println("Error: Invalid option! Please choose 'dog', 'cat', or 'fish'.");
			    }
			}
		}
    }
}