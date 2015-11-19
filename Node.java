package SIBUS;

abstract public class Node {
	int signal;
	public void connect(Node n)
	{
		n.signal += this.signal;
	}
}
