package tasks.first;

import java.util.ArrayDeque;


public class BracketsManager {

    public Boolean checkValidity(String s) {
        if (s.equals("")) {
            return true;
        }
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    brackets.offerFirst('(');
                    break;

                case '[':
                    brackets.offerFirst('[');
                    break;
                case '{':
                    brackets.offerFirst('{');
                    break;
                case ')':
                    if (!brackets.isEmpty() && brackets.getFirst() == '(') {
                        brackets.removeFirst();
                    } else return false;
                    break;

                case ']':
                    if (!brackets.isEmpty() && brackets.getFirst() == '[') {
                        brackets.removeFirst();
                    } else return false;
                    break;

                case '}':
                    if (!brackets.isEmpty() && brackets.getFirst() == '{') {
                        brackets.removeFirst();
                    } else return false;

                    break;

            }
        }

        return brackets.isEmpty();
    }
}
