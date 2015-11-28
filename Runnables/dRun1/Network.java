package SIBUS;
import java.util.ArrayList;
public class Network {
	public ArrayList<Layer> layers = new ArrayList<Layer>();
	public Layer l;
	public Input i;
	public Output o;
	public Network()
	{
		l = new Layer();
		i = new Input(2);
		o = new Output();
		l.connectNodes(i, o);
		System.out.println("Input value = "+i.signal);
		System.out.println("Output value = "+o.signal);
	}
	
}
