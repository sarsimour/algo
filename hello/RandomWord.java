/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int num = 0;
        String champion = "";
        while (!StdIn.isEmpty()) {
            num++;
            if (StdRandom.bernoulli(1/num)) champion = StdIn.readString();
        }
        StdOut.println(champion);
    }
}
