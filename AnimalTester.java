import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class AnimalTester{
    public static void main(String[] args) throws FileNotFoundException{
        ArrayCollection<String> animals = new ArrayCollection<>();

        Scanner file = new Scanner(new File("Animal.txt"));

        while(file.hasNextLine()){
            String animal = file.nextLine();
            if(!animal.isEmpty()){
                animals.add(animal);
            }
        }

        file.close();
        Random num = new Random();
        char character = (char) ('A' + num.nextInt(26));

        System.out.println("Write an animal beginning with " + character + ".");
        System.out.println("Write a name you have used, and a name that does not begin with the character.");

        Scanner key = new Scanner(System.in);
        ArrayCollection<String> usedAnimals = new ArrayCollection<>();

        int success = 0;
        while (true) { 
            System.out.println("Enter an animal: "); 
            String animal = key.nextLine(); 
            if (animal.isEmpty() || animal.charAt(0) != character){ 
                break; 
            } 
            if (!animals.contains(animal)){ 
                break; 
            }
            if(usedAnimals.contains(animal)){
                break;
            }
            usedAnimals.add(animal);
            success++;
        }
        System.out.println("You entered a total of: " + success + " valid animals.");
        key.close();
}
}