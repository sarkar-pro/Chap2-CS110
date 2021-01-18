
import java.util.Scanner;

public class SquareOrCube {

    private int square;
    private int cube;
    private int value;
    private int SquareOrCube;
    Scanner in = new Scanner(System.in);

    public SquareOrCube() {
        askQuestion();
        if (SquareOrCube == 1) {
            square(value);
        } else if (SquareOrCube == 2) {
            cube(value);
        } else{
            System.out.println("Just Fuck Off You Illiterate Bitch!!!");
        }

    }

    public void askQuestion() {

        System.out.println("What is the number?");
        value = in.nextInt();
        System.out.println("What do you want to do? (1 = Square, 2 = Cube)");
        SquareOrCube = in.nextInt();

    }

    public void square(int value) {
        square = value * value;
        System.out.println("Square: " + square);
    }

    public void cube(int value) {
        cube = value * value * value;
        System.out.println("Cube: " + cube);
    }
}
