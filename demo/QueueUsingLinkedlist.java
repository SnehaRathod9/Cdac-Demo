import java.util.Scanner;

class node
{
    int data;
    node next;
    node(int e)
    {
        data = e;
        next = null;
    }
}

public class QueueUsingLinkedlist 
{
node root;
    
    void createQueue()
    {
        root = null;
    }
        
    void enqueue(int e)
    {
        node n = new node(e);
        if(root == null)
        {
            root = n;
        }
        else
        {
            node t = root;//1
            while(t.next != null)//2
                t = t.next;
            t.next = n;   
        }
    }
    
    void dequeue()
    {
             
        if(root == null)
        {
          System.out.println("Empty Queue");
        }
        else
        {
            node t = root;//1
            root = root.next;//2
            System.out.println("Deleted:"+t.data);
        }
    }

    void print()
    { 
        if(root == null)
        {
          System.out.println("Empty Queue");
        }
        else
        {
            node t = root;//1
            while(t != null)//2
            {
                System.out.println(t.data);
                t = t.next;
            }
         }
        
    }


 public static void main(String[] args)
 {
     /* Creating object of class linkedList */
	 QueueUsingLinkedlist que = new QueueUsingLinkedlist();
     Scanner scan = new Scanner(System.in);
     int ch;
     do
     {
         System.out.println("\n0.Exit\n1.Enqueue\n2.Dequeue\n3.Print\n");
         ch = scan.nextInt();            
         switch (ch)
         {
		        case 1 : 
		             System.out.println("Enter integer element to insert");
		             int e = scan.nextInt();
		             que.enqueue( e );                     
		        break;                         
                    
	                
	            case 2 : 
	            	que.dequeue();
	                System.out.println("Element Deleted");                        
	            break;
	            
	            case 3 :
	                   System.out.println("Elements on Queue:");                        
	                   que.print();
	                break;
	                
	            case 0:
	                System.out.println("Exiting Program");                        
	                break;
	                
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
         }
     } while (ch != 0);               
 }
}
