public class RabinKarp {
    public final static int d = 10;

    public static void search (String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        int i, j;
        int p = 0;
        int t = 0;

        for (i = 0; i < m; i++) {
            p += pattern.charAt(i)*Math.pow(d, m - (i + 1));
            t += text.charAt(i)*Math.pow(d, m - (i + 1));
        }
        System.out.println(p);
        System.out.println(t);
        for (i = 0; i < n - m + 1; i++) {
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                if (j == m)
                    System.out.println("Pattern found at index: " +  (i + 1));
            }
            if (i < n - m) {
                t = (int) (t - text.charAt(i)*Math.pow(d, m - 1));
                t = t*d + text.charAt(i + m);
            }
            System.out.println("--");
            System.out.println(p);
            System.out.println(t);
        }
    }

    public static void main (String[] args) {
        String text = "I like cats";
        String pattern = "cat";
        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        search(pattern, text);
    }
}
