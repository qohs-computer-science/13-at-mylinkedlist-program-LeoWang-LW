public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList Chris = new MyLinkedList(); 
    System.out.println(Chris.size()); 
    Chris.add("Meade");
    Chris.addFirst("Enzo");
    Chris.addLast("Nick");
    System.out.println(Chris.size()); 
    System.out.println(Chris.toString());
    System.out.println(Chris.get(2)); 

  } // end main
  
} // end class
