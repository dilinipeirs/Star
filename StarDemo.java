package javaapplication10;

/**
 *
 * @author dilin
 */
public class StarDemo {

    public static void main(String[] args) {

        int length = 5; // this is the length of a side of the star

        //section 1
        for (int i = 1; i <= length - (length / 2); i++) {
            for (int j = i; j <= length; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + (i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //section 2
        int side = length / 2 + 1;

        for (int i = 0; i < length - (length / 2); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = ((side * 2) + length) - i * 2; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        //section 3
        for (int i = length / 2 - 1, k=1; i >= 0; i--,k++) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = length*(k+1)-k*k; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        //section 4
        for (int i = length - (length / 2); i >0 ; i--) {
            for (int j = length; j >=i; j--) {
                System.out.print("  ");
            }
            for (int j = i + (i-1); j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
