import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long sum(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long a = Long.parseLong(reader.readLine());
            long b = Long.parseLong(reader.readLine());
            System.out.println(sum(a, b));
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
