
package linkedlist;

public class SLL {
   protected Node head , tail;
  public SLL(){
   head=null ;
   tail=null ;
   }
   public boolean isEmpty(){
      if (head==null){
         return true;
      }
      else{
          return false;
      }
   }
   public void addToHead(int val){
      Node newNode = new Node(val,head);
      head=newNode;
      if (tail==null){
          tail=head;
          
      }
   }
   public void addToTail(int val){
       Node newNode= new Node(val) ;
       if(!isEmpty()){
         tail.next=newNode;
         tail=tail.next;
       }
       else{
           head=tail=newNode;
       }
   }
   public int delFromHead(){
       int val= head.Data ;
       if (head==tail){
           head=tail=null ;
       }
       else{
           head=head.next ;
       }
       return val;
   }
   public int delFormTail() {
       int val= tail.Data ;
       if (head==tail) {
           head=tail=null ;
       }
       else{
           Node temp;
           for(temp=head;temp.next!=tail;temp=temp.next){
               ;
           }
           tail=temp;
           tail.next=null;
       }
       return val; 
   }
     public boolean isInList(int val){
         Node tmp;
         for(tmp=head; tmp!=null && tmp.Data!=val;tmp=tmp.next){
             
         }
         if(tmp!=null){
             return true;
         }
         else
             return false;
     }
     public void prinAll(){
       Node temp;
       for(temp=head;temp!=null;temp=temp.next){
           System.out.print(temp.Data + " ") ;
       }
     }
}
