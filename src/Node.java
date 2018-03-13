import java.util.ArrayList;

public class Node 
{
	private String name;
	private int xCoord;
	private int yCoord;
	private ArrayList<String> links = new ArrayList<String>();
	
	public void Node(String nodeName, int x, int y, ArrayList nextCoords)
	{
		name = nodeName;
		xCoord = x;
		yCoord = y;
		links = nextCoords;
	}
	
	public String getName()
	{
		return name;
	}
	public int getXCoord()
	{
		return xCoord;
	}
	
	public int getYCoord()
	{
		return yCoord;
	}
	
	public ArrayList<String> getLinks()
	{
		return links;
	}
}
