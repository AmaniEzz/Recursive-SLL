
package recurtionsll;

public class labpacket4 {
//recurtion methods;
    public static void main(String[] args) {
    SLL list = new  SLL();
       
           
       list.addLast("amany");
       list.RECaddinglast(list.head,"aya");
       list.RECaddinglast(list.head,"nada");
       list.RECaddinglast(list.head,"lara");
       list.RECaddinglast(list.head,"soha");
       list.print(list.head);
       System.out.println("------------------");
        
       list.RevPrint(list.head);
       list.recursivAddAfter(list.head,"lara", "nohaa");
       list.print(list.head);
            System.out.println("-------------------");
       list.deletedFirst();
       list.RecursiveDeleteLast(list.head);
       list.print(list.head);
            System.out.println("--------------------");
       list.recursivDeleteAfter(list.head ,"nada");
       list.print(list.head);
            System.out.println("\nthe size is " +SLL.size(list.head));
       list.print(list.head);
            System.out.println(list.search(list.head, "aya"));
       //list.reverse(list.head);
       //list.print(list.head);
       list.DeleteAll(list,list.head);
       list.print(list.head);
    }
  
}
    

 class Node
 {
     public String data;
    public Node next;

    public Node(String data) {
        this.data = data;
       
    }

    public Node() {
    }
    
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
        
 }
     

class SLL{
   public Node head;
   public Node tail;
   public int size;
   public Node prev;
   public Node Next;

    public SLL() {
        head=null;
        size=0;
    }
    
    
    void addFrist(String str){
        Node newnode= new Node(str);
        if(head==null){
            newnode.next=null;
           }
        else{
         newnode.next=head;}
        //in both cases the head and tail will be updaated;
        head=newnode;
        tail=newnode;
        }
    
     
    void addLast(String str){
        Node cur =head;
        Node newnode = new  Node(str);
        if(head==null){
            head=newnode;
            tail=newnode;}
        else{
            while(cur.next!=null){  
              //travers until the currunt.next equals to null which is the tail which the last node in the list//
                cur=cur.next;}
            cur.next=newnode;
                
            }
            }
    void RECaddinglast(Node cur , String str){
             
        if(head==null){
        RECaddinglast(head, str);
        }else{
            if(cur.next==null){
                Node newnode = new  Node(str);
                 cur.next=newnode;
            return;
        }
        RECaddinglast(cur.next, str);
    
  }}
    void addAfterNode (String prevData , String newData){
        Node cur = head;
        Node newnode = new Node(newData);
         while (cur.next!=null && cur.data!=prevData){
           
           cur=cur.next;}
           newnode.next=cur.next;
           cur.next=newnode; }
    
    
    void recursivAddAfter(Node cur , String x , String y){
        if((cur.data).equalsIgnoreCase(x)){ //base case 
            Node newnode = new Node(y);
            newnode.next=cur.next;
            cur.next= newnode;
            return;
        }
        recursivAddAfter(cur.next, x, y); // like a while loop
    }
     
    
    
    void deletedFirst(){
          head=head.next;
          }
          
    void deletLast(){
          Node cur= head;
           while(cur.next.next!=null){//travers to the node before the last node//
               cur=cur.next;
           }
               cur.next=null;
               
    }
    
    void RecursiveDeleteLast(Node cur){
        if(cur.next.next==null){ //base case 
             cur.next=null;
             return;
        }
        RecursiveDeleteLast(cur.next); //like a while loop
    }        
    
    
    void deletAftenode(String prevdata){
         Node cur= head;
         while(cur.next!=null && cur.data!= prevdata){
             cur=cur.next;}
         
         cur.next=cur.next.next;
             
     }
    void recursivDeleteAfter(Node cur , String x){
        if((cur.data).equalsIgnoreCase(x)&&cur.next!=null){ //base case 
             cur.next=cur.next.next;
           return;
        }
        recursivDeleteAfter(cur.next, x); // like a while loop
        }
          
   
    public static int size (Node curr){
              if(curr==null) // base case
                 return 0;
              else
                 return 1+size(curr.next); // like a while loop every time add 1 to the return value 
          } 
          
    public void print(Node head){
        if (head == null) // base case 
            return;
        else
        System.out.print(head.data+" "); //print the value frist 
        print(head.next); // then go call method again and again until the base case!
    }
      
    public boolean search(Node head , String str){
               if (head==null)
                   return false;

               if(head.data.equals(str)){ //base case 
                 return true;
               }
               else  
                 return search(head.next,str); //this is like a while loop until base case came true 
           }
         
            
    public Node reverse(Node p){
             if(head==null){
                 return null;}
             else{
              if (p.next==null){ 
                  head.next=null;
                  head=p;
                  return p; }
             }
              return reverse(p.next).next=p;
                
           }
           
    public void RevPrint(Node n){
               if(n ==null)
                   return;
               RevPrint(n.next); //a new place in stack for cur.next
               System.out.println(n.data); // n is the return node
               
           }
    
    public void DeleteAll(SLL list,Node cur){
         cur=head;
         if(cur==null){ //base case when the travers finish cur=null
         return;
          }  
         list.deletedFirst(); //if cur is not null the delete it
         DeleteAll(list,cur.next); //and call the method fot cur.next
        
         }
           
    }
 



