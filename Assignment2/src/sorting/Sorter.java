package sorting;

public abstract class Sorter {
	  private long opCount = 0L;

	  public long getOpCount() {
	    return this.opCount;
	  }

	  protected void resetOpCount() {
	    this.opCount = 0L;
	  }
	  protected void countOp() {
		  this.countOp(1);
	  }

	  protected void countOp(int o) {
	      this.opCount += o;
	  }
	  public abstract void sort(double[] list);
}
