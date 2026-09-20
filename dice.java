import java.util.Random;
import java.util.Scanner;
public class dice {
    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of die and sides: ");

 int total = 0;

    int num_of_die = scanner.nextInt();

  int d = scanner.nextInt();

for (int rep = 0; rep < num_of_die; rep++) {
Random rand = new Random();
        int roll = rand.nextInt(d) + 1; 
        System.out.println("You rolled a " + roll); 
total = total + roll;
}
if (num_of_die == 1) {

} else {
    System.out.println("The total is: " + total);
}

    }
}