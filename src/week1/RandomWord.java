//package week1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String champ = "";
        while (!StdIn.isEmpty()) {
            String w = StdIn.readString();
            boolean sel = StdRandom.bernoulli((float) 1 / i);
            if (sel) {
                champ = w;
            }
            i += 1;
        }
        System.out.println(champ);
    }
}
