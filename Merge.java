public class Merge {
	public static void main(String[] args) {
		int[] a = {4,324,234,23,52,4324,534, 23,432, 54,342,24,54562345};
		mergesort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	public static void mergesort(int[] data) {
		int[] temp = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		mergesort(data, temp, 0, data.length - 1, 1);
	}
	private static void mergesort(int[] data, int[] temp, int lo, int hi, int i) {
		if (lo < hi) {
			int half = (lo + hi) / 2;
			mergesort(data, temp, lo, half, i + 1);
			mergesort(data, temp, half + 1, hi, i + 1);
			if (i % 2 == 0) 
				merge(data, temp, lo, half, hi);
			else
				merge(temp, data, lo, half, hi);
		}
	}
	private static void merge(int[] data, int[] temp, int lo1, int lo2, int hi) {
		int i1 = lo1;
		int i2 = lo2 + 1;
		for (int i = lo1; i <= hi; i++) {
			if (i1 <= lo2 && i2 <= hi) {
				if (data[i1] < data[i2])
					temp[i] = data[i1++];
				else
					temp[i] = data[i2++];
			}
			else {
				if (i1 > lo2)
					temp[i] = data[i2++];
				else
					temp[i] = data[i1++];
			}
		}
	}
}
