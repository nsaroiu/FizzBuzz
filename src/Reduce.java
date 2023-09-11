public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int i = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            i++;
        }

        System.out.println(i);
    }
}
