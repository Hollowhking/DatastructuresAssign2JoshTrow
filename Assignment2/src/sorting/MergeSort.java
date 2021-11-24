package sorting;

public class MergeSort extends Sorter{
	public void merge(double[] list, double[] l, double[] r, int left, int right) { 
		int i = 0, j = 0, k = 0;
		this.countOp(3);
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				list[k++] = l[i++];
		        this.countOp(5);
			}
			else {
				list[k++] = r[j++];
		        this.countOp(5);
			}
	    }
		while (i < left) {
	        list[k++] = l[i++];
	        this.countOp(5);
		}
	    while (j < right) {
	    	list[k++] = r[j++];
	        this.countOp(5);
	    }
	}

	@Override
	public void sort(double[] list) {
	    if (list.length < 2) {
	        return;
	    }
	    int mid = list.length / 2;
	    this.countOp(2);
	    double[] l = new double[mid];
	    double[] r = new double[list.length - mid];
	    this.countOp(3);
	    for (int i = 0; i < mid; i++) {
	        l[i] = list[i];
	        this.countOp(3);
	    }
	    for (int i = mid; i < list.length; i++) {
	        r[i - mid] = list[i];
	        this.countOp(4);
	    }
	    sort(l);
	    sort(r);
	    this.countOp(2);

	    merge(list, l, r, mid, list.length - mid);
	    this.countOp();
	}

}
