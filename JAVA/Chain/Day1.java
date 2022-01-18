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

        for (int i = 1; i <= n; i++) {

            for (int sp = 1; sp <= (n - i); sp++) {
                if (i % 2 != 0) { out.print("  "); }
                else { break; }
            }

            if (i % 2 != 0) {
                int tmp = 0;
                for (int st = 1; st <= i - tmp; st++) {
                    out.print("* ");
                    tmp = st - 1;
                }
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
                out.println();
            }
        }

        for (int i = 1; i <= n / 2; i++) {
            for (int sp2 = 1; sp2 <= 2 * i; sp2++) {
                out.print("  ");
            }

            for (int str = i; str <= n / 2; str++) {
                out.print("* ");
            }

            if (i != n / 2) {
                int itr = n / 2 - i;
                int od = (2 * itr) - 1;
                for (int it = 1; it <= 2 * od; it++) {
                    out.print(" ");
                }
                for (int str = i; str <= n / 2; str++) {
                    out.print("* ");
                }
            }
            out.println();
        }
    }
}