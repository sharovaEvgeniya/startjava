import java.util.Arrays;

public class Player {
    private String name;
    private int[] inputNumbers = new int[10];
    private int numberAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberAttempts() {
        return numberAttempts;
    }


    public void addNumber(int number) {
        inputNumbers[numberAttempts] = number;
        numberAttempts++;
    }

    public int[] copyPart() {
        return inputNumbers = Arrays.copyOf(inputNumbers, numberAttempts);
    }

    public void clearInputNumbers() {
        Arrays.fill(inputNumbers, 0);
        numberAttempts = 0;
    }
}