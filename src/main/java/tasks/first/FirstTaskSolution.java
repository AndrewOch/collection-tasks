package tasks.first;

public class FirstTaskSolution implements FirstTask {
    @Override
    public String breadthFirst(boolean[][] adjacencyMatrix, int startIndex) {
        Graph graph = new Graph();
        return graph.breadthFirst(adjacencyMatrix, startIndex);
    }

    @Override
    public Boolean validateBrackets(String s) {
        BracketsManager bracketsManager = new BracketsManager();

        return bracketsManager.checkValidity(s);
    }

    @Override
    public Long polishCalculation(String s) {
        PolishNotationCalculator polishNotationCalculator = new PolishNotationCalculator();

        return polishNotationCalculator.reverseCalculator(s);
    }
}
