package sorting;

public class InsertionSort extends Sorter{
//anything that is [], =, +, -, ++, --, %, /, function call(), *

	@Override
	public void sort(double[] list) {
        int n = list.length;  
        this.countOp();
        for (int j = 1; j < n; j++) { 
            double key = list[j];  
            int i = j-1;  
            this.countOp(2);
            while ( (i > -1) && ( list [i] > key ) ) {  
                list [i+1] = list [i];  
                i--;  
                this.countOp(5);
            }  
            list[i+1] = key;  
            this.countOp(3);//COUNTING
        }  
	}

}
