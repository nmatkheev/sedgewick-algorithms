//package week1;
import edu.princeton.cs.algs4.StdIn;

public class HelloGoodbye {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        String res1 = String.join(" and ", s1, s2);
        String res2 = String.join(" and ", s2, s1);
        System.out.println("Hello " + res1 + ".");
        System.out.println("Goodbye " + res2 + ".");
    }
}
