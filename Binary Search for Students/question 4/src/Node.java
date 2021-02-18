
	import java.util.*;

	public class Node
	{
		public Student item;
		public Node Left;
		public Node Right;

		public Node(Student Item)
		{
			item = Item;
			Left = null;
			Right = null;
		}

		public void DisplayNode()
		{
			System.out.println(item.score + "");
		}
	}


