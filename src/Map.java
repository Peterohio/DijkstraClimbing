import java.util.ArrayList;

public class Map 
{
	private ArrayList<Node> route = new ArrayList<Node>();
	Map(int mapNo)
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
		for(Node match: route)
		{
			if(nodeName.compareTo(match.getName()) == 0)
			{
				return match;
			}
		}
		return null;
	}
	
	public ArrayList<Node> getRoute()
	{
		return route;
	}
	
	public Node getStart()
	{
		return route.get(0);
	}
	
	public Node getEnd()
	{
		int last = route.size()-1;
		return route.get(last);
	}
	
	public double makeDijkstra()
	{
		ArrayList<String> shortestPath = new ArrayList<String>();
		ArrayList<String> visitedNodes = new ArrayList<String>();
		ArrayList<Double> distToNode = new ArrayList<Double>();
		Node currentNode = route.get(0);
		
		while(currentNode != route.get(route.size()-1))
		{
			for(String adjacent: currentNode.getLinks())
			{
				
			}
		}
	}
	
	public double getDist(Node start, Node finish)
	{
		double dist = Math.sqrt(Math.pow(start.getXCoord() - finish.getXCoord(), 2) + Math.pow(start.getYCoord() - finish.getYCoord(), 2));
		return dist;
	}
}
