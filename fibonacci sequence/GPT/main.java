// O SonarQube aconcelhou que trocasse os System.out por Logger.

public class FibonacciSequence {

    /* --------------------------------------------------------------
     *  1️⃣  Iterative version – O(N) time, O(1) space
     * -------------------------------------------------------------- */
    public static long fibIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return 0L;
        if (n == 1) return 1L;

        long prev = 0L;
        long cur  = 1L;
        for (int i = 2; i <= n; i++) {
            long next = prev + cur;
            prev = cur;
            cur = next;
        }
        return cur;
    }

    /* --------------------------------------------------------------
     *  2️⃣  Recursive version with memoization – O(N) time, O(N) space
     * -------------------------------------------------------------- */
    private static long[] memo;   // helper array for memoization

    public static long fibRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        memo = new long[n + 1];
        for (int i = 0; i <= n; i++) memo[i] = -1L;
        return fibRecHelper(n);
    }

    private static long fibRecHelper(int n) {
        if (n == 0) return 0L;
        if (n == 1) return 1L;
        if (memo[n] != -1L) return memo[n];
        memo[n] = fibRecHelper(n - 1) + fibRecHelper(n - 2);
        return memo[n];
    }

    /* --------------------------------------------------------------
     *  3️⃣  Binet’s formula (closed‑form) – O(1) time, double precision
     * -------------------------------------------------------------- */
    public static long fibBinet(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        double sqrt5 = Math.sqrt(5);
        double phi   = (1 + sqrt5) / 2;
        double psi   = (1 - sqrt5) / 2;
        // rounding to the nearest long eliminates the floating‑point error
        return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
    }

    /* --------------------------------------------------------------
     *  Main driver – prints the first N Fibonacci numbers using the
     *  iterative implementation (the fastest and safest for large N).
     * -------------------------------------------------------------- */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FibonacciSequence <N>");
            System.exit(1);
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
            if (n < 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.err.println("Error: <N> must be a non‑negative integer.");
            System.exit(1);
            return; // unreachable, but keeps the compiler happy
        }

        System.out.print("Fibonacci sequence (first " + n + " numbers): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibIterative(i));
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
