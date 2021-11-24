package expressiontree;

public class OpNode implements TreeNode{
	
	String op;
	TreeNode left,right;
	
	public OpNode(ValueNode left, String operation, ValueNode right) {
		this.left=left;
		this.op=operation;
		this.right=right;
	}

	public OpNode(ValueNode left, String operation, OpNode right) {
		this.left=left;
		this.op=operation;
		this.right=right;
	}

	public OpNode(OpNode left, String operation, OpNode right) {
		this.left=left;
		this.op=operation;
		this.right=right;
	}

	public void print(int depth) {
		right.print(depth+1);

		for (int i=0; i<=depth;i++) {
			System.out.print("\t");
		}
		System.out.println(""+op);
		left.print(depth+1);

	}

	public double evaluate() {
		//recursive statement 
		// find op 
		// call left/right evaluate
		// solve 
		if (op == "+") {
			return this.left.evaluate()+this.right.evaluate();
		}
		else if (op == "-") {
			return this.left.evaluate()-this.right.evaluate();
		}
		else if (op == "*") {
			return this.left.evaluate()*this.right.evaluate();
		}
		else {
			return this.left.evaluate()/this.right.evaluate();
		}
	}
}