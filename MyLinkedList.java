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
    }

    public boolean isEmpty(){
        if(size == 0){
            return true; 
        }
        else{
            return false; 
        }
    }

    public String toString(){
        String output = ""; 
        ListNode current = head; 
        int position = 0; 

        while(current!= null){
            output += position + ":" + current.getValue();
            position += 1;
            current = head.getNext();
        }
        return output; 
    }
    public boolean add(Object newItem){
        if(head == null){
            ListNode newNode = new ListNode(newItem, null);
            head = newNode;
        }
        else{
            ListNode current = head; 
            while(current.getNext() != null){
                current = current.getNext(); 
                ListNode newNode = new ListNode(newItem, null);
                current = newNode;
            }
             
        }
        size+= 1; 
        return true; 
    }

    public boolean addFirst(Object newItem){
        ListNode newNode = new ListNode(newItem,head); 
        newNode = head; 
        head = newNode; 
        size += 1; 
        return true; 
    }

    public boolean addLast(Object newItem){
        add(newItem); 
        return true; 
    }



}

