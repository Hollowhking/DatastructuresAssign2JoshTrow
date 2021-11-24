package expressiontree;

public class ValueNode implements TreeNode{
	double value;
	
	public ValueNode(int i) {
		this.value = i;
	}

	public void print(int depth) {
		for (int i=0; i<=depth;i++) {
			System.out.print("\t");
		}
		System.out.println(value);
	}

	public double evaluate() {
		return value;
	}
	
}