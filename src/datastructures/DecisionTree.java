package datastructures;

class DecisionTree {	
	
	static class Node {
		String feature = null;
		String value = null;
		String prediction = null;
		Node left;
		Node right;	
		
		Node (String feature, String value, String prediction){
			
			this.feature = feature;
			this.value = value;
			this.prediction = prediction;
			
		}
		
			
	}//end of inner static class Node
	
		
	private Node root;
	
	public void train(String[][] data) {
		root = new Node ("Outlook", "Sunny", null);
		
		root.left = new Node ("Temperature", "Cool", null);
		root.left.left = new Node (null, null, "Yes");
		root.left.right = new Node (null, null, "No");
		
		root.right = new Node (null, null, "Yes");
		
	}
	
	public String predict (String outlook, String temperature) {		
		
		Node current = root;	
		if (outlook.equals("Sunny")) {
			current = current.left;
			if (temperature.equals("Cool")) {
				current = current.left;
				return current.prediction;					
			} else {
				current = current.right;
				return current.prediction;
			}
		} else {
			current = current.right;
			return current.prediction;
		}		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		DecisionTree tree = new DecisionTree();
		tree.train(null);
		
		System.out.println("Prediction for Sunny and Cool: " + tree.predict("Sunny", "Cool"));
		
		
	}

}
