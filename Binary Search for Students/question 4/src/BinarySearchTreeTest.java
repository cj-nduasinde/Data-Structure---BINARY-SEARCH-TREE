import java.util.Scanner;

public class BinarySearchTreeTest {
	  public static void main (String[] args) throws java.lang.Exception
	   {
	       float key;
	       Student newItem;
	      
	       // create an empty Binary Search Tree
	       BinarySearchTreeClass BST = new BinarySearchTreeClass();
	      
	       // create a binary search tree of n nodes
	       System.out.println("Enter the number of items to append:");
	       Scanner sc = new Scanner(System.in);
	       int n = Integer.parseInt(sc.nextLine());
	       System.out.println("Enter " + n + " items \r\n");
	       for(int i = 0; i < n; i++)
	       {
	       
	       BST.Insert(new Student());
	       };
	      
	       System.out.println("\nDisplay all items from the root:");
	       BST.InOrder( BST.getroot() );
	      
	       // test the operations of Binary Search Tree
	       System.out.println("\nEnter 1 for search,2 for deletion,3 for inserting");
	       int s = Integer.parseInt(sc.nextLine());
	       while(s == 1 || s == 2 || s == 3 || s == 4)
	       {
	       if(s == 1)
	       {
	       System.out.println("enter the key that you want to search:");
	       key = Integer.parseInt(sc.nextLine());
	       Node node = BST.Search(key);
	       if(node != null)
	       System.out.println("The item is found: " + "Score:"+node.item.score+ " "  +  "Name: "+  node.item.name  + " "+  "Id:"   + node.item.id+ "\r\n");
	       };
	       if(s == 2)
	       {
	       System.out.println("enter the key that you want to delete:");
	       key = Integer.parseInt(sc.nextLine());
	       BST.Delete(key);
	       System.out.println("Display all items from the header:");
	       BST.InOrder(BST.getroot());
	       };
	       if(s == 3)
	       {
	       System.out.println("enter the item that you want to insert:");
	       
	       BST.Insert(new Student());
	       System.out.println("Display all items from the header:");
	       BST.InOrder(BST.getroot());
	       };
	       if(s == 4)
	       {
	       System.out.println("Display all items from the header:");
	       BST.InOrder(BST.getroot());
	       };
	       System.out.println("\r\n");
	      
	       System.out.println("Enter 1 for search,2 for deletion,3 for isert");
	       s = Integer.parseInt(sc.nextLine());
	       }
	   }
}
