public class BinarySearch {

  // find target from list[i] to list[j]
  // return null if target not found
  //  YOU MUST USE RECURSION TO IMPLEMENT THIS METHOD
  public static Comparable binSearch(int i, int j, Comparable[] list, Comparable target) {
    if(i>j){
      return null;
    }

    if(target.compareTo(list[(i+j)/2])==0){
      return 1;
    }
    else if(target.compareTo(list[(i+j)/2])>0){
      return binSearch((i+j)/2 + 1, j, list, target);
    }else{
      return binSearch(i, (i+j)/2 - 1, list, target);
    }

  }


  // find target from list[]
  // return null if target not found
  public static Comparable search(Comparable[] list, Comparable target) {
    // search the item using method binSearch
    return binSearch(0, list.length-1, list, target);
  }
}
