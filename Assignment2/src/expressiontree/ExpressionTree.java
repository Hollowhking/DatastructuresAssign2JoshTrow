package expressiontree;

public class ExpressionTree {
	
	OpNode expression;
	String answer;
	public ExpressionTree(OpNode Node) {
		this.expression = Node;
	}

	public void print() {
		expression.print(0);
	}

	public String evaluate() {
		return Double.toString(expression.evaluate());
	}
}
