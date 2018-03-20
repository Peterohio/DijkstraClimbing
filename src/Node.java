import java.util.ArrayList;

public class Node 
{
	private String name;
	private int xCoord;
	private int yCoord;
	private ArrayList<String> links = new ArrayList<String>();
	private double distFromStart = 1000000000000000.0;
	private boolean isBoxed = false;
	
	Node(String nodeName, int x, int y, ArrayList nextNodes)
	{
		name = nodeName;
		xCoord = x;
		yCoord = y;
		links = nextNodes;
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
	
	public boolean isBoxed()
	{
		return isBoxed;
	}
	
	public void setBoxTrue()
	{
		isBoxed = true;
	}
	
	public void setDist(double dist)
	{
		distFromStart = dist;
	}
	
	public double getDistFromStart()
	{
		return distFromStart;
	}
}
