package task;

public class Task {
    public static int squareWithoutMultiply(int number) {
        if (number <= 0) {
            return 0;
        } else {
            int square = 0;
            for (int i = 0; i < number; i++) {
                square += number;
            }
            return square;
        }
    }
}
