
package linkedlist;

public class LinkedList {
   
    public static void main(String[] args) {
     
       SLL sll =new SLL(); 
       System.out.println("SLL : 1");
       sll.addToHead(1);
       sll.addToHead(2);
       sll.addToHead(4);
       sll.addToTail(3);
       sll.addToTail(7);
       sll.prinAll();
       System.out.println("\nSLL : 2");
      sll.delFromHead();
     sll.prinAll();
     System.out.println("\nsll : 3");
     sll.delFormTail();
     sll.prinAll();
    System.out.println("\n"+sll.isEmpty());
      System.out.println(sll.isInList(1));
       System.out.println(sll.isInList(7));
    }}
   

