// leo Wang | 11/11/25 | Pd. 6 | CP3

public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList chris = new MyLinkedList(); 
    MyLinkedList kat = new MyLinkedList();
    MyLinkedList leo = new MyLinkedList();  
    System.out.println(chris.size()); 
    System.out.println(chris.isEmpty()); 
    System.out.println(chris.toString());
    System.out.println(kat.size()); 
    System.out.println(kat.isEmpty()); 
    System.out.println(kat.toString());
    System.out.println(leo.size()); 
    System.out.println(leo.isEmpty()); 
    System.out.println(leo.toString());
    System.out.println(chris.add("Meade"));
    System.out.println(chris.addFirst("Enzo"));
    System.out.println(chris.addLast("Nick"));
    System.out.println(chris.add("lemons"));
    System.out.println(chris.add("apples"));
    System.out.println(chris.add("tissues"));
    System.out.println(chris.add("programming"));
    System.out.println(chris.add("Ms. Adams"));
    System.out.println(chris.add("Seniors"));
    System.out.println(chris.add("Math"));
    System.out.println(kat.addFirst("chris"));
    System.out.println(leo.addLast("kat"));
    System.out.println(chris.size()); 
    System.out.println(chris.toString());
    System.out.println(chris.isEmpty()); 
    System.out.println(kat.size()); 
    System.out.println(kat.toString());
    System.out.println(kat.isEmpty()); 
    System.out.println(leo.size()); 
    System.out.println(leo.toString());
    System.out.println(leo.isEmpty()); 

    System.out.println(chris.get(0)); 
    System.out.println(chris.get(chris.size() - 1));
    System.out.println(chris.get(((chris.size() - 1)/2)));
    
    System.out.println(chris.set(0, "kat")); 
    System.out.println(chris.set(chris.size() - 1, "leo"));
    System.out.println(chris.set(((chris.size() - 1)/2), "Ms. Adams"));
    System.out.println(chris.toString()); 

    System.out.println(chris.remove(1)); 
    System.out.println(chris.removeFirst()); 
    System.out.println(chris.removeLast()); 
    System.out.println(chris.toString()); 
    System.out.println(chris.size());
    System.out.println(chris.isEmpty()); 

    System.out.println(chris.add("CP3")); 
    System.out.println(chris.get(0)); 
    System.out.println(chris.set(0, "AP Java")); 
    System.out.println(chris.toString()); 
    System.out.println(chris.size());
    System.out.println(chris.isEmpty()); 




  } // end main
  
} // end class
