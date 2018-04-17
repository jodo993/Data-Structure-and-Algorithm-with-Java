//
//
//

public class LinkedBinaryTreeDemo
{
	public static <E> void printPreorder(AbstractTree<E> T)
	{
	    for (Position<E> p : T.preorder())
	      System.out.print(p.getElement() + ", ");
  	}

        public static <E> void print()
        {
            
        }
        
	public static void main(String[] args)
	{
		LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();

		tree.addRoot("a");
		tree.addLeft(tree.root(),"b");
		tree.addRight(tree.root(),"c");

		Position<String> p = tree.left(tree.root());

		tree.addLeft(p,"d");
		tree.addRight(p,"e");

		Position<String> q = tree.right(tree.root());

		tree.addRight(q,"f");

		printPreorder(tree);
	}
}