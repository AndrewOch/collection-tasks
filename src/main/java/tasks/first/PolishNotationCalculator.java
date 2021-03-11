package tasks.first;

import java.util.ArrayDeque;

public class PolishNotationCalculator {

    public Long reverseCalculator(String s) throws IllegalArgumentException {
        ArrayDeque<Long> arrayDeque = new ArrayDeque<>();
        Long l2;
        while (!s.isEmpty()) {
            switch (s.charAt(0)) {

                case '+':
                    l2 = arrayDeque.pollFirst();
                    try {
                        arrayDeque.offerFirst(l2 + arrayDeque.pollFirst());
                    } catch (NullPointerException e) {
                        throw new IllegalArgumentException();
                    }
                    break;
                case '-':

                    l2 = arrayDeque.pollFirst();
                    try {
                        arrayDeque.offerFirst(l2 - arrayDeque.pollFirst());
                    } catch (NullPointerException e) {
                        throw new IllegalArgumentException();
                    }
                    break;
                case '*':
                    l2 = arrayDeque.pollFirst();
                    try {
                        arrayDeque.offerFirst(l2 * arrayDeque.pollFirst());
                    } catch (NullPointerException e) {
                        throw new IllegalArgumentException();
                    }
                    break;
                case '/':

                    l2 = arrayDeque.pollFirst();
                    try {
                        arrayDeque.offerFirst(l2 / arrayDeque.pollFirst());
                    } catch (NullPointerException e) {
                        throw new IllegalArgumentException();
                    }

                    break;
                default:
                    arrayDeque.offerFirst(Long.parseLong(s.substring(0, s.indexOf(' '))));
                    break;
            }
            s = s.substring(1);
            if (s.length() > 1 && s.charAt(0) == ' ') {
                s = s.substring(1);
            } else {
                return arrayDeque.pollFirst();
            }
        }
        return null;
    }

}