public class Ring {

  // DO NOT CHANGE THE FOLLOWING
  private class RingNode {
    Object obj;
    RingNode next;
 
    RingNode(Object j) {
      obj = j;
      next = null;  
    }
  }

  private RingNode head;
  private RingNode curr;

  public Ring() {
    head = curr = null;
  }
  
  // print out the content of the ring
  // starting from the head node
  public String toString() {
    String s = "";

    RingNode curr = head;
    if (curr == null) return s;

    s += curr.obj.toString();
    while (curr.next != head) {
      curr = curr.next;
      s += ", " + curr.obj.toString();
    }

    return s;
  }
  ////////////////////////////////////////

  // PUT YOUR CODES BELOW HERE
}
