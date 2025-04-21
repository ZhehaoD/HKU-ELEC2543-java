public class BinarySearch {

  // find target from list[i] to list[j]
  // return null if target not found
  //  YOU MUST USE RECURSION TO IMPLEMENT THIS METHOD
  public static Comparable binSearch(int i, int j, Comparable[] list, Comparable target) {
    return null;
  }


  // find target from list[]
  // return null if target not found
  public static Comparable search(Comparable[] list, Comparable target) {

    // search the item using method binSearch
    return binSearch(0, list.length-1, list, target);
  }
}
