package tasks.first;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Graph {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    public String breadthFirst(boolean[][] adjacencyMatrix, int indexStart) {
        ArrayList<Integer> result = new ArrayList<>();

        arrayDeque.offerFirst(indexStart);
        while (!arrayDeque.isEmpty()) {
            for (int i = 0; i < adjacencyMatrix.length; i++) {
                if (adjacencyMatrix[indexStart][i] && !arrayDeque.contains(i) && !result.contains(i)) {
                    arrayDeque.offerFirst(i);
                }
            }
            result.add(arrayDeque.pollLast());
            if (!arrayDeque.isEmpty()) {
                indexStart = arrayDeque.getLast();
            }
        }
        String res = result.toString();
        return res.substring(1, res.length() - 1);
    }
}
