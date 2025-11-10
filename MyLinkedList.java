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

        while(current != null){
            output += position + ":" + current.getValue() + "\n";
            position += 1;
            current = current.getNext();
        }
        return output; 
    }
    public boolean add(Object newItem){
        ListNode newNode = new ListNode(newItem, null); 
        if(head == null){
            head = newNode;
            size++;
            return true; 
        }

        ListNode temp = head; 
        while(temp.getNext() != null){
            temp = temp.getNext(); 
        }
        size++;
        temp.setNext(newNode); 
        return true; 
    }

    public boolean addFirst(Object newItem){
        ListNode newNode = new ListNode(newItem, head); 
        head = newNode; 
        size += 1; 
        return true; 
    }

    public boolean addLast(Object newItem){
        add(newItem); 
        return true; 
    }

    public Object get(int i){
        int x = 0;
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException(); 
        }
        ListNode current = head; 
        while( x != i){
            current = current.getNext(); 
            x++;
        }
        return current.getValue(); 
    }

    




}

