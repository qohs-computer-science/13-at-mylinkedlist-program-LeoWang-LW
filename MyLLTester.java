// leo Wang | 11/11/25 | Pd. 6 | CP3

public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList chris = new MyLinkedList(); 
    MyLinkedList kat = new MyLinkedList();
    MyLinkedList leo = new MyLinkedList();  
    System.out.println("Size of chris " + chris.size()); 
    System.out.println("Is chris empty? " + chris.isEmpty()); 
    System.out.println("chris toString: " + chris.toString());
    System.out.println("Size of kat " + kat.size()); 
    System.out.println("Is kat empty? " + kat.isEmpty()); 
    System.out.println("kat toString: " + kat.toString());
    System.out.println("Size of leo " + leo.size()); 
    System.out.println("Is leo empty? " + leo.isEmpty()); 
    System.out.println("leo toString: " + leo.toString());
    System.out.println("Sucessfully added? " + chris.add("Meade"));
    System.out.println("Sucessfully added? " + chris.addFirst("Enzo"));
    System.out.println("Sucessfully added? " + chris.addLast("Nick"));
    System.out.println("Sucessfully added? " + chris.add("lemons"));
    System.out.println("Sucessfully added? " + chris.add("apples"));
    System.out.println("Sucessfully added? " + chris.add("tissues"));
    System.out.println("Sucessfully added? " + chris.add("programming"));
    System.out.println("Sucessfully added? " + chris.add("Ms. Adams"));
    System.out.println("Sucessfully added? " + chris.add("Seniors"));
    System.out.println("Sucessfully added? " + chris.add("Math"));
    System.out.println("Sucessfully added? " + kat.addFirst("chris"));
    System.out.println("Sucessfully added? " + leo.addLast("kat"));
    System.out.println("Size of chris " + chris.size()); 
    System.out.println("chris toString: " + chris.toString());
    System.out.println("Is chris empty? " + chris.isEmpty()); 
    System.out.println("Size of kat " + kat.size()); 
    System.out.println("kat toString: " + kat.toString());
    System.out.println("Is kat empty? " + kat.isEmpty()); 
    System.out.println("Size of leo " + leo.size()); 
    System.out.println("leo toString: " + leo.toString());
    System.out.println("Is leo empty? " + leo.isEmpty()); 

    System.out.println("chris value at 0 " + chris.get(0)); 
    System.out.println("chris value at middle " + chris.get(chris.size() - 1));
    System.out.println("chris value at end " + chris.get(((chris.size() - 1)/2)));
    
    System.out.println("Old value for set " + chris.set(0, "kat")); 
    System.out.println("Old value for set " + chris.set(chris.size() - 1, "leo"));
    System.out.println("Old value for set " + chris.set(((chris.size() - 1)/2), "Ms. Adams"));
    System.out.println("chris toString: " + chris.toString()); 

    System.out.println("Old value for remove " +chris.remove(1)); 
    System.out.println("Old value for remove " +chris.removeFirst()); 
    System.out.println("Old value for remove " + chris.removeLast()); 
    System.out.println("chris toString: " + chris.toString()); 
    System.out.println("Size of chris " + chris.size());
    System.out.println("Is chris empty? " + chris.isEmpty()); 

    System.out.println("Sucessfully added? " + chris.add("CP3")); 
    System.out.println("Value at 0 " + chris.get(0)); 
    System.out.println("Old value for set " + chris.set(0, "AP Java")); 
    System.out.println("chris toString: " + chris.toString()); 
    System.out.println("Size of chris " + chris.size());
    System.out.println("Is chris empty? " + chris.isEmpty()); 




  } // end main
  
} // end class
