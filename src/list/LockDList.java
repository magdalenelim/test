package list;


public class LockDList extends DList{
	
	public void lockNode(DListNode node) {
		((LockDListNode) node).locked = true;
	}
	
	public void UnlockNode(DListNode node) {
		((LockDListNode) node).locked = false;
	}
	
	protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
	    return new LockDListNode(item, prev, next);
	  }
	
	  public void remove(DListNode node) {
		 if ((node == null) || ((LockDListNode) node).locked == true) {
			 return;
		 }
		 super.remove(node);
	  }

	  /**
	   *  toString() returns a String representation of this DList.
	   *
	   *  DO NOT CHANGE THIS METHOD.
	   *
	   *  @return a String representation of this DList.
	   *  Performance:  runs in O(n) time, where n is the length of the list.
	   */
	  public String toString() {
	    String result = "[  ";
	    DListNode current = head.next;
	    while (current != head) {
	      result = result + current.item + "  ";
	      current = current.next;
	    }
	    return result + "]";
	  }
}
