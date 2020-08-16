package tree.bst;

public class BstLogic {

    TreeNode<Integer> root;

	public static void main(String[] args) {
		
		BstLogic theTree = new BstLogic();
		theTree.addNode(60);
		theTree.addNode(55);
		theTree.addNode(100);
		theTree.addNode(45);
		theTree.addNode(67);
		theTree.addNode(57);
		theTree.addNode(107);
		
		boolean found = theTree.search(45);
		System.out.println(found);
		found = theTree.search(99);
		System.out.println(found);

	}

	// add a node to the binary search tree
	public  void addNode(Integer val) {

		TreeNode<Integer> newNode = new TreeNode<>(val);

		if (root == null) {
			root = newNode;
		} else {

	

		TreeNode<Integer> current = root;
		TreeNode<Integer> parent;

		while (true) {
			
			parent = current;

			if (newNode.element < current.element) {
				parent = current;
				current = parent.leftChild;
				
				if(current == null) {
					parent.leftChild = newNode;
					return;
				}

			}else {
				current = current.rightChild;
				
				if(current == null) {
					parent.rightChild = newNode;
					return;
				}
			}
		}
	  }
	}
	
	public static boolean search(Integer element) {
		
		TreeNode<Integer> current = root;
		
		while(current.element != element) {
		   if(element < current.element) {
			   current = current.leftChild;
		   }
		   else if(element > current.element) {
			   current = current.rightChild;
		   }
		   else {
			   return true;
		   }
			
		}
		
		return false;
	}

}
