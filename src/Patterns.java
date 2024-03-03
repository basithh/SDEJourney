public class Patterns {
    public static void main(String[] args) {

        /*  ****
         ****
         ****
         **** */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        1
//        12
//        123
//        1234
//        12345
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
//        1
//        22
//        333
//        4444
//        55555
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
//        *****
//        ****
//        ***
//        **
//        *

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        12345
//        1234
//        123
//        12
//        1
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
//     *
//    ***
//   *****
//  *******
// *********
//***********
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i + n; j++) {
                if (j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
//***********
// *********
//  *******
//   *****
//    ***
//     *
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i + n; j++) {
                if (j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 4; j > 0; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j));
            }
            System.out.print("\n");
        }

//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444

        for (int i = 0; i < 4 * 2; i++) {
            for (int j = 0; j < 4 * 2; j++) {
                System.out.print(4-Math.min(Math.min(i,j),Math.min(((2 * 4 - 2) - i),(2 * 4 - 2) - j)));
            }
            System.out.println();
        }
    }
}
