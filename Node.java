
package linkedlist;

public class Node {
   public int Data ;
   public  Node next ; 
    
   public Node(int Data){
        this.Data=Data;
        next=null;
    }
   
   public  Node(int Data, Node next){
       this.Data=Data;
       this.next=next ;
    }
}
