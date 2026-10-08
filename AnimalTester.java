import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        