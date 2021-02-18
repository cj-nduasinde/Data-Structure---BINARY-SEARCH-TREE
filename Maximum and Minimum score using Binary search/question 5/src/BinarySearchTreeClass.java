


	import java.util.*;

	public class BinarySearchTreeClass
	{
		public Node root;

		public BinarySearchTreeClass()
		{
			root = null;
		}

		public Node getroot()
		{
			return root;
		}

		public Node Search(float KEY)
		{
			Node x = root;
			while (x != null && x.item.score != KEY)
			{
				if (KEY < x.item.score)
					x = x.Left;
				else
					x = x.Right;
			};
			if (x == null) 
				System.out.println("There is no such item!");
			return x; 
		}

		public  void Insert(Student newItem)
		{
			Node parent = null;
			Node current = root; 
			Node newNode = new Node(newItem);

			while (current != null)
			{
				parent = current;
				if (newNode.item.score < current.item.score)
					current = current.Left;
				else
					current = current.Right;
			}
			if (root == null)
				root = newNode;
			else
			{
				if (newNode.item.score < parent.item.score)
					parent.Left = newNode;
				else
					parent.Right = newNode;
			}
		}

		public void Delete(float KEY)
		{
			Node current = root;
			Node parent = null;
			boolean isLeftChild = true;

			/* Find the deleting node (current) */
			if (root == null)
			   System.out.println("It is empty!");
			while (current != null && current.item.score != KEY)
			{
				parent = current;
				if (KEY < current.item.score)
				{
					isLeftChild = true;
					current = current.Left;
				}
				else
				{
					isLeftChild = false;
					current = current.Right;
				}
			};
			if (current == null) /* The node is not found */
				System.out.println("There is no such item!");
			else /* The node is found*/
			{
				/* Case 1: the deleting node (current) has no child */
				if ((current.Left == null) && (current.Right == null))
				{
					if (current == root)
						root = null;
					else if (isLeftChild)
						parent.Left = null;
					else
						parent.Right = null;
				}
		
				/* Case 2: the deleting node (current) has one child */
				else if (current.Right == null)
				{
					if (current == root)
						root = current.Left;
					else if (isLeftChild)
						parent.Left = current.Left;
					else
						parent.Right = current.Left;
				}
				else if (current.Left == null)
				{
					if (current == root)
						root = current.Right;
					else if (isLeftChild)
						parent.Left = current.Right;
					else
						parent.Right = current.Right;
				}
		
				/* Case 3: the deleting node (current) has two children */
				else
				{
					Node successorParent = GetSuccessorParent(current);
					Node successor = successorParent.Left;
					if (!(successor == current.Right))
					{
						successorParent.Left = successor.Right;
					}
					current.item = successor.item;
				}
			}
		}

		public Node GetSuccessorParent(Node delNode)
		{
			Node successorParent = delNode;
			Node successor = delNode;
			Node current = delNode.Right;
			while (!(current == null))
			{
				successorParent = successor;
				successor = current;
				current = current.Left;
			}
			return successorParent;
		}
	
		
		  
		public Node Min()
		{
		Node current=root;
		while(!(current.Left==null))
	          current=current.Left;
	   	return current;
		}
		
		public Node Max()
		{
		Node current=root;
		while(!(current.Right==null))
		      current=current.Right;
		return current;
		}
		
		public int Height(Node x)
		{
		if (x==null)
			return 0;
		else
			{
			int L=Height (x.Left);
		    int R=Height (x.Right);
		    if( L<R)
		    return R+1;
		    else return L+1;
		    
		    }
		}
		public int NodeNumber(Node x)	
		{
		if (x==null)
			return 0;
		else
		{
			int Nl=NodeNumber(x.Left);
			int Nr=NodeNumber(x.Right);
			return (Nl+Nr)+1;
			}
		
		}
		public void InOrder(Node theRoot)
		{
			if (!(theRoot == null))
			{
				InOrder(theRoot.Left);
				theRoot.DisplayNode();
				InOrder(theRoot.Right);
			}
		}

		public void Min(Student student) {
			// TODO Auto-generated method stub
			
		}
	}


