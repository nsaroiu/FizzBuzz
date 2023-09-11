public class Multiples {
    public static void main(String[] args) {

        int count = 0;

        int upperLimit = 10;

        for (int i = 3; i < upperLimit; i += 3) {
            count += 1;
        }

        for (int i = 5; i < upperLimit; i += 5) {
            if (i % 3 != 0) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
