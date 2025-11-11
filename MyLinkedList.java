// Leo Wang | 11/11/25 | Pd. 6 | CP3

public class MyLinkedList
{
    //field(s): 
    private ListNode head;
    private int size; 

    public MyLinkedList(){
        head = null; 
        size = 0; 
    } // end constructor 

    public int size(){
        return size; 
    } // end size method 

    public boolean isEmpty(){
        if(size == 0){
            return true; 
        } // end if 
        else{
            return false; 
        } // end else 
    } // end isEmpty method

    public String toString(){
        String output = ""; 
        ListNode current = head; 
        int position = 0; 

        while(current != null){
            output += "\n" + position + ":" + current.getValue() + "\n";
            position += 1;
            current = current.getNext();
        } // end while loop 
        return output; 
    } // end toString method 

    public boolean add(Object newItem){
        ListNode newNode = new ListNode(newItem, null); 
        if(head == null){
            head = newNode;
            size++;
            return true; 
        } // end if statment 

        ListNode temp = head; 
        while(temp.getNext() != null){
            temp = temp.getNext(); 
        } // end while loop 
        size++;
        temp.setNext(newNode); 
        return true; 
    } // end add method 

    public boolean addFirst(Object newItem){
        ListNode newNode = new ListNode(newItem, head); 
        head = newNode; 
        size += 1; 
        return true; 
    } // end addFirst method 

    public boolean addLast(Object newItem){
        add(newItem); 
        return true; 
    } // addLast method 

    public Object get(int i){
        int x = 0;
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException(); 
        } // end if statement 
        ListNode current = head; 
        while( x != i){
            current = current.getNext(); 
            x++;
        } // end while loop 
        return current.getValue(); 
    } // end get method 

    public Object set(int i, Object newValue){
        String oldValue = ""; 
        int x = 0; 
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        } // end if statement 
        ListNode current = head; 
        while(x != i){
            current = current.getNext(); 
            x++;
        } // end while loop 
        oldValue = ((String) current.getValue()); 
        current.setValue(newValue); 
        return oldValue; 

    } // end set method 

    public Object remove(int i){
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        } // end if statement 
        
        if( i == 0){
            return removeFirst(); 
        } // end if statement 
        ListNode current = head; 
        for (int x = 0; x < i - 1; x++){
            current = current.getNext();
        } // end for loop 
        ListNode removed = current.getNext(); 
        Object removedValue = removed.getValue(); 

        current.setNext(removed.getNext()); 
        removed.setNext(null); 
        size--; 
        return removedValue; 

    } // end remove method 

    public Object removeFirst(){
        if( head == null){
            return null; 
        } // end if statement 
        Object removedValue = head.getValue();
        ListNode remove = head; 
        head = head.getNext(); 
        remove.setNext(null); 
        size--; 
        return removedValue; 
    } // end removeFirst method 

    public Object removeLast(){
        if( head == null){
            return null; 
        } // end if statement 
        return remove(size - 1); 
    } // end removeLast method

    




} // end class 

