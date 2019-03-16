
public class Merge {
  public static void mergesort(int[] data) {
    mergesort(data, 0, data.length - 1);
  }
  private static void mergesort(int[] data, int lo, int hi) {
    if (lo < hi) {
      int half = (lo + hi) / 2
      mergesort(lo, half);
      mergesort(half + 1, hi);
      merge(lo, half, hi);
    }
  }
  private static int[] merge(int lo1, int lo2, int hi) {

  }
}
