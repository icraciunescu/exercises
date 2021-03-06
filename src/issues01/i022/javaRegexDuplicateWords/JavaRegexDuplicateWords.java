package issues01.i022.javaRegexDuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexDuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(  ), m.group( 1 ));
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        in.close();

    }

}

/*
https://www.hackerrank.com/challenges/duplicate-word/problem

https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum
http://tutorials.jenkov.com/java-regex/matcher.html
 */
