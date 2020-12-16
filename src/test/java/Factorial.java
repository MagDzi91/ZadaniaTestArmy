public class Factorial {

    public static int countFactorial(int i) {
        if (i == 0) {
            return 1;
        } else
            return i * countFactorial(i - 1);
    }

    public static int countFactorial2(int i) {
        int wynik = 1;
        for (int j = 1; j <= i; j++) {
            wynik = wynik * j;
        }
        return wynik;
    }
}
