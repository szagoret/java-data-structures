package dsa.stack;

/**
 * Created by szagoret on 8/28/2015.
 */
public class MatchingDelimiters {

    public static boolean isMatched(String expresion) {

        final String opening = "({["; // opening delimiters
        final String closing = ")}]"; // respective closing delimiters
        Stack<Character> buffer = new LinkedStack<>();

        for (char c : expresion.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);        // this is a left delimiter
            } else if (closing.indexOf(c) != -1) {  // this is a right delimiter
                if (buffer.isEmpty()) {             // nothing to match with
                    return false;
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false;       // mismatched delimiter
                }
            }
        }

        return buffer.isEmpty();            // were all opening delimiters matched ?
    }

    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer = new LinkedStack<>();
        int j = html.indexOf('<');
        while (j != -1) {
            int k = html.indexOf('>', j + 1);
            if (k == -1) {
                return false;
            }
            String tag = html.substring(j + 1, k);
            if (!tag.startsWith("/")) {
                buffer.push(tag);
            } else {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (!tag.substring(1).equals(buffer.pop())) {
                    return false;
                }
            }
            j = html.indexOf('<', k + 1);
        }
        return buffer.isEmpty();
    }
}
