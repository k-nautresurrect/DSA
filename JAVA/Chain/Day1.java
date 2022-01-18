/*
    Take n as an input, for a value of n = 7 the pattern will be


                1             <-6
            2 1   1 2         <-4
        3 2 1       1 2 3     <-2
    4 3 2 1           1 2 3 4 <-0
        3 2 1       1 2 3     <-2
            2 1   1 2         <-4
                1             <-6

    N should always be odd number.
*/
public class Day1 extends IO {
    public static void main(String[] args) {
        int n = in.nextInt();

        // 1st step print stars (rows)
        for (int i = 1; i <= n; i++) {

            // 2nd print spaces following an pattern (cols)
            for (int sp = 1; sp <= (n - i); sp++) {
                if (i % 2 != 0) { out.print("  "); }
                else { break; }
            }

            // 3rd print star representing numbers in pattern (cols)
            if (i % 2 != 0) {

                // 4th print the star pattern as in pattern(half)
                //   1 3 5 7
                // 0 1 2 3 4
                int tmp = 0;
                for (int st = 1; st <= i - tmp; st++) {
                    out.print("* ");
                    tmp = st - 1;
                }

                // 5th print the star pattern space as in pattern (half)
                // 1 3 5 7
                //   1 3 5 => 2 6 10
                if (i != 1) {
                    for (int sp2 = 1; sp2 <= i - 2; sp2++) {
                        out.print("  ");
                    }
                    int tmp2 = 0;
                    for (int st = 1; st <= i - tmp2; st++) {
                        out.print("* ");
                        tmp2 = st - 1;
                    }
                }

                // 6th print above other second qauter for above pattern(other half)

                out.println();
            }

        }

        // 2nd half of the pattern in star form
        for (int i = 1; i <= n / 2; i++) {

            // 2nd, spaces
            // 1 2 3
            // 2 4 6
            for (int sp2 = 1; sp2 <= 2 * i; sp2++) {
                out.print("  ");
            }

            // 2nd, stars
            // 1 2 3
            // 3 2 1
            for (int str = i; str <= n / 2; str++) {
                out.print("* ");
            }

            //2nd, space btwn
            // 1 2
            // 3 1
            // 6 2 => 3*2, 1*2 , made odd from i then double
            if (i != n / 2) {
                int itr = n / 2 - i;
                int od = (2 * itr) - 1;
                for (int it = 1; it <= 2 * od; it++) {
                    out.print(" ");
                }
                // 2nd, star as in pattern
                // have to stop at i == 3
                for (int str = i; str <= n / 2; str++) {
                    out.print("* ");
                }

            }


            out.println();

        }
    }
}