public class Merge {
  public static void main(String[] args) {
    int[] a = {1, 21,25,31,234, 5234, 643, 51,224,1243,234,5463,65,42,34,123};
    mergesort(a);
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
  public static void mergesort(int[] data) {
    mergesort(data, 0, data.length - 1);
  }
  private static void mergesort(int[] data, int lo, int hi) {
    if (lo < hi) {
      int half = (lo + hi) / 2;
      mergesort(data, lo, half);
      mergesort(data, half + 1, hi);
      merge(data, lo, half, hi);
    }
  }
  private static void merge(int[] data, int lo1, int lo2, int hi) {
    int[] merged = new int[hi - lo1 + 1];

    int i1 = lo1;
    int i2 = lo2 + 1;
    for (int i = 0; i < merged.length; i++) {
      if (i1 <= lo2 && i2 <= hi) {
        if (data[i1] < data[i2])
          merged[i] = data[i1++];
        else
          merged[i] = data[i2++];
      }
      else {
        if (i1 > lo2)
          merged[i] = data[i2++];
        else
          merged[i] = data[i1++];
      }
    }
    for (int i = 0; i < merged.length; i++) {
      data[lo1 + i] = merged[i];
    }
  }

}
