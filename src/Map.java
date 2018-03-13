import java.util.ArrayList;

public class Map 
{
	private ArrayList<Node> route = new ArrayList<Node>();
	public void Map(int mapNo)
	{
		if(mapNo == 1)
		{
			//Create first map
		}
		else if(mapNo == 2)
		{
			//Create map 2
		}
	}
	
	public Node getHold(String nodeName)
	{
		for(int i = 0; i < route.size(); i++)
		{
			if(nodeName.compareTo(route.get(i).getName()) == 0)
			{
				return route.get(i);
			}
		}
		return null;
	}
	
	public double getDist(Node start, Node finish)
	{
		double dist = Math.sqrt(Math.pow(start.getXCoord() - finish.getXCoord(), 2) + Math.pow(start.getYCoord() - finish.getYCoord(), 2));
		return dist;
	}
	
}
