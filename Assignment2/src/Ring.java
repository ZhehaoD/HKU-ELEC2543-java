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
  public void addObj(Object obj){
    RingNode node = new RingNode(obj);
    if (head == null) {
      head = node;
      node.next = head;
    } else {
      node.next = head.next;
      head.next = node;
    }
  }

  public int size(){
    if(curr==null && head==null){
      return 0;
    }
    int size=1;
    RingNode curr = head;
    while (curr.next != head) {
      size++;
      curr = curr.next;
    }
    return size;
  }

  public Object getCurrObj(){
    if(curr==null){
      curr=head;
    }
    return curr.obj;
  }

  public void removeCurrObj(){
    RingNode temp=head;
    if (head.next==head){
      head = curr = null;
      return;
    }
    if(curr==head){
      while (curr.next != head) {
        curr = curr.next;
      }
      head=head.next;
      curr.next=head;
    }else{
      while (temp.next != curr) {
        temp = temp.next;
      }
    }
    temp.next = curr.next;
    curr = curr.next;
  }

  public void advance(){
    curr=curr.next;
  }

}
