
public class ChristmasTree {


    public static void drawChristmasTree(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");

            System.out.println(" ");

        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 0; j <=i*size; j++)
                System.out.print(" ");
                for (int k = 0; k < i; k++)
            System.out.print("|");

        }
    }
}


