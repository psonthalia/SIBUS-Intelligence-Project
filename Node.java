package SIBUS;

abstract public class Node {
	public int signal;
	public void connect(Node n)
	{
		n.signal += this.signal;
	}
}
