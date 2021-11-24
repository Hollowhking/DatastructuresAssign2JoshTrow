package sorting;

public class Main {

	public static void main(String[] args) {
		double[] array1 = generateRandomArray(10);
		double[] array2 = array1.clone();
		System.out.println("A list of 100,000");
		// algorithm #1
		Sorter iSorter = new InsertionSort();
		iSorter.sort(array1);
		System.out.println("Insertion Operations: " + iSorter.getOpCount());

		// algorithm #2
		Sorter mSorter = new MergeSort();
		mSorter.sort(array2);
		System.out.println("Merge Operations: " + mSorter.getOpCount());
	}

	//generate random: 
	public static double[] generateRandomArray(int size) {
		double[] array = new double[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 100.0;
		}

		return array;
	}
}