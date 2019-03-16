
public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data, 0, data.length - 1);
  }
  private static void mergesort(int[] data, int lo, int hi) {
    if (lo < hi) {
      int half = (lo + hi) / 2
      mergesort(lo, half);
      mergesort(half + 1, hi);
      merge(data, lo, half, hi);
    }
  }
  private static int[] merge(int[] data, int lo1, int lo2, int hi) {
    int[] merged = new int[hi - lo];

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

    return merged;
  }

}
