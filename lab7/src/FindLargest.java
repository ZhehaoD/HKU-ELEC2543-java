public class FindLargest {
    public static Comparable findLargest(Comparable[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Comparable largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static MyDate findLargest(MyDate[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        MyDate largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }
        return largest;
    }
}