package Digital;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class sample3 {
    static boolean match(String first, String second)
    {

        // If we reach at the end of both strings,
        // we are done
        if (first.length() == 0 && second.length() == 0)
            return true;

        // Make sure that the characters after '*'
        // are present in second string.
        // This function assumes that the first
        // string will not contain two consecutive '*'
        if (first.length() > 1 && first.charAt(0) == '*' &&
                second.length() == 0)
            return false;

        // If the first string contains '?',
        // or current characters of both strings match
        if ((first.length() > 1 && first.charAt(0) == '?') ||
                (first.length() != 0 && second.length() != 0 &&
                        first.charAt(0) == second.charAt(0)))
            return match(first.substring(1),
                    second.substring(1));

        // If there is *, then there are two possibilities
        // a) We consider current character of second string
        // b) We ignore current character of second string.
        if (first.length() > 0 && first.charAt(0) == '*')
            return match(first.substring(1), second) ||
                    match(first, second.substring(1));
        return false;
    }

    // A function to run test cases
    static void test(String first, String second)
    {
        if (match(first, second))
            System.out.println(first.indexOf(second.charAt(0)));
        else
            System.out.println("No");
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String first=sc.nextLine();
        String second=sc.nextLine();
        test(first,second); // Yes

    }
}

