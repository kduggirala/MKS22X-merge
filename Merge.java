public class Merge {
	public static void main(String[] args) {
		int[] a = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = (int)(Math.random() * 100);
		}
		mergesort(a);
		for (int i = 0; i < 1000000; i++) {
			if (i % 100 == 0) {
				System.out.println();
			}
			System.out.print(i + " ");
		}
	}
	public static void mergesort(int[] data) {
		int[] temp = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		mergesort(temp, data, 0, data.length - 1);
	}
	private static void mergesort(int[] data, int[] temp, int lo, int hi) {
		if (lo < hi) {
			int half = (lo + hi) / 2;
			mergesort(temp, data, lo, half);
			mergesort(temp, data, half + 1, hi);
			merge(data, temp, lo, half, hi);
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
