public class PascalTriangle {

  public static int[] computePT(int k) {
    if (k == 1) {
      return new int[]{1};
    }
    int[] prevRow = computePT(k - 1);
    int[] currentRow = new int[k];
    currentRow[0] = 1;
    currentRow[k - 1] = 1;
    for (int i = 1; i < k - 1; i++) {
      currentRow[i] = prevRow[i - 1] + prevRow[i];
    }
    return currentRow;
  }
}
