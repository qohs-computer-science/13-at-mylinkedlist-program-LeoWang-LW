public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList Chris = new MyLinkedList(); 
    System.out.println(Chris.size()); 
    System.out.println(Chris.isEmpty()); 
    System.out.println(Chris.toString());
    Chris.add("Meade");
    Chris.addFirst("Enzo");
    Chris.addLast("Nick");
    System.out.println(Chris.size()); 
    System.out.println(Chris.toString());
    System.out.println(Chris.get(2)); 
    System.out.println(Chris.set(2,"Leo")); 
    System.out.println(Chris.get(2)); 
    System.out.println(Chris.remove(0)); 
    System.out.println(Chris.removeLast()); 

  } // end main
  
} // end class
