package tree.bst;

public class BstLogic {
	
	TreeNode<Integer>  root;

	public static void main(String[] args) {
	
		

	}
	
	public void addNode(Integer val) {
		
		TreeNode<Integer> newNode = new TreeNode<>(val);
		
		if(root == null) {
			root = newNode;
		}
		
		TreeNode<Integer> current = root;
		TreeNode<Integer> previous = current;
		 
		if(current.element > newNode.element) {
			if(current.leftChild != null) {
				previous = current;
				current = current.leftChild;
			}
			else{
				current.leftChild = newNode; 
			}
		}
		
	}

}
