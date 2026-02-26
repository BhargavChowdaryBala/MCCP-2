
import java.util.Scanner;

class Search_Iteration
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList li=new LinkedList();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            li.insert(data);
        }
        int key=sc.nextInt();
        boolean found=li.search(key);
        if(found)    System.out.println("Element found in the linked list.");
        else    System.out.println("Element not found in the linked list.");   
    }
}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
    Node head;
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    boolean search(int key)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.data==key) 
                 return true;
            current=current.next;
        }
        return false;
    }
}