package SIBUS;
import java.util.ArrayList;

public class Layer {
	public ArrayList<Node> nodes_a = new ArrayList<Node>();
	public ArrayList<Node> nodes_b = new ArrayList<Node>();
	public Layer()
	{
		
	}
	public void connectNodes(Node a, Node b)
	{
		nodes_a.add(a);
		nodes_b.add(b);
		a.connect(b);
	}
}
