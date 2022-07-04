/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println(String.format("Hello %s.", String.join(" and ", args)));
        System.out.println(String.format("Goodbye %s.", String.join(" and ", args)));
    }
}
